

## Generating a draft for `Babylon.scala`

```
## Get and patch the babylon.d.ts to help the current ts->scalajs converter
wget https://github.com/BabylonJS/Babylon.js/raw/master/dist/babylon.d.ts -O babylon.d.ts
patch babylon.d.ts babylon.patch

git clone https://github.com/sjrd/scala-js-ts-importer.git
cd scala-js-ts-importer

## Get a patch for abstract classes
git remote add sbrunk https://github.com/sbrunk/scala-js-ts-importer.git
git fetch sbrunk
git merge sbrunk/abstract-classes

sbt 'run ../babylon.d.ts ../Babylon.scala'
reset # to save the terminal

cd -
ls scala-js-ts-importer/Babylon.scala



## This ould take a lot of time....
# git clone https://github.com/BabylonJS/Babylon.js.git
```

## Fixing `Babylon.scala`

Pass 1

- remove the `package importedjs` (and brackets)
- import some stuff
    - `import org.scalajs.dom.raw._`
    - `scala.scalajs.js.typedarray._`
    - `import scala.scalajs.js.annotation._`
- `\cp Babylon.scala ,,scala ; cat ,,scala | grep -v '^ *\(def\|var\) _.*' > Babylon.scala`
- `sed -i -e 's@ protected () extends @ extends @g' Babylon.scala`
- `sed -i -e 's@ArrayLike\[Double\]@js.Array[Double]@g' Babylon.scala`
- `sed -i -e 's@ | symbol@@g' Babylon.scala`
- add some missing definitions
```
see file
```
- `sed -i -e 's@package Geometry @package GeometryPACKAGE @g' Babylon.scala` (as there is also a class with this name)
- `sed -i -e 's@ Geometry.Primitives@ GeometryPACKAGE.Primitives@g' Babylon.scala`
- `for pat in WebGLContextEvent WEBGL_compressed_texture_s3tc EXT_texture_filter_anisotropic MSGesture Uint8ArrayConstructor Float32ArrayConstructor ; do sed -i -e 's@^[^/].*'$pat'.*@// \0@g' Babylon.scala ; done`
- auto-fix
```
sbt compile |grep 'error'> ,,errors
cat ,,errors | awk 'match($0, /Babylon.scala:([^:]*): /, g) {print(g[1]) } ' > ,,lines
for l in $(cat ,,lines) ; do sed -i -e $l' { s@BABYLON\.@@g }' src/main/scala/Babylon.scala; done
```

Pass 2 (when missing override start to appear)

- auto-fix (run a lot times as sbt truncates to ~100 errors errors...)
```
sbt compile |grep 'error'|tee ,,errors
cat ,,errors | awk 'GO==1 && /needs .override. modifier/ {print f;GO=0;next} match($0, /Babylon.scala:([^:]*): /, g) {f=g[1]; GO=1}  ' > ,,lines  ; wc -l ,,lines
for l in $(cat ,,lines) ; do sed -i -e $l' { s@  \(def\|var\) @  override \1 @g }' src/main/scala/Babylon.scala; done

cat ,,errors | awk 'GO==1 && /(cannot override a mutable|has incompatible type)/ {print f;GO=0;next} match($0, /Babylon.scala:([^:]*): /, g) {f=g[1]; GO=1}  ' > ,,lines  ; wc -l ,,lines
for l in $(cat ,,lines) ; do sed -i -e $(( $l - 1 ))' { s_^  *@_  //@_g }' -e $l' { s@.*@@g }' src/main/scala/Babylon.scala; done
```

- next
```
sbt compile |grep 'error'|tee ,,errors

cat ,,errors | awk 'match($0, /Babylon.scala:([^:]*): .*multiple overloaded alternatives of method ([^ ]*)/, g) {print("l=" g[1] ";m=\"" g[2] "\"")}' > ,,lines  ; wc -l ,,lines
for l in $(cat ,,lines) ; do \cp src/main/scala/Babylon.scala ,,scala ; cat ,,scala | awk 'BEGIN { GO=1; '$l' } GO==1 && NR>l && match($0, "def "m"[(]")  {GO=0; next} {print} ' > src/main/scala/Babylon.scala ; done

```

- remaining (or introduced), 8 errors -> `babylon-scala.patch`
