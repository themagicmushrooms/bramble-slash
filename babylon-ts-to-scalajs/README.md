
```
# Get and patch the babylon.d.ts to help the current ts->scalajs converter
wget https://github.com/BabylonJS/Babylon.js/raw/master/dist/babylon.d.ts -O babylon.d.ts
patch babylon.d.ts babylon.patch

git clone https://github.com/sjrd/scala-js-ts-importer.git
cd scala-js-ts-importer

# Get a patch for abstract classes
git remote add sbrunk https://github.com/sbrunk/scala-js-ts-importer.git
git fetch sbrunk
git merge sbrunk/abstract-classes

sbt 'run ../babylon.d.ts ../Babylon.scala'
reset # to save the terminal

cd -
ls scala-js-ts-importer/Babylon.scala



# would take a lot of time....
git clone https://github.com/BabylonJS/Babylon.js.git
```
