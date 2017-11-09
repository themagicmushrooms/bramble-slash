
import scala.scalajs.js
import org.scalajs.dom.raw._

import scala.scalajs.js.typedarray._
import scala.scalajs.js.|

import scala.scalajs.js.annotation._

object CUSTOM {
  type IndicesArray = js.Array[Double] | Int32Array | Uint32Array | Uint16Array
  type WebGLObject = js.Any
  trait PointerEvent
  trait MouseWheelEvent
  type PostProcessOptions = js.Any
  type GamepadButton = js.Any
}
import CUSTOM._

package BABYLON {

@js.native
@JSGlobal("BABYLON.InstancingAttributeInfo")
class InstancingAttributeInfo extends js.Object {
  var index: Double = js.native
  var attributeSize: Double = js.native
  var attribyteType: Double = js.native
  var normalized: Boolean = js.native
  var offset: Double = js.native
  var attributeName: String = js.native
}

@js.native
@JSGlobal("BABYLON.EngineCapabilities")
class EngineCapabilities extends js.Object {
  var maxTexturesImageUnits: Double = js.native
  var maxVertexTextureImageUnits: Double = js.native
  var maxTextureSize: Double = js.native
  var maxCubemapTextureSize: Double = js.native
  var maxRenderTextureSize: Double = js.native
  var maxVertexAttribs: Double = js.native
  var maxVaryingVectors: Double = js.native
  var maxVertexUniformVectors: Double = js.native
  var maxFragmentUniformVectors: Double = js.native
  var standardDerivatives: Boolean = js.native
//   var s3tc: WEBGL_compressed_texture_s3tc = js.native
  var pvrtc: js.Any = js.native
  var etc1: js.Any = js.native
  var etc2: js.Any = js.native
  var astc: js.Any = js.native
  var textureFloat: Boolean = js.native
  var vertexArrayObject: Boolean = js.native
//   var textureAnisotropicFilterExtension: EXT_texture_filter_anisotropic = js.native
  var maxAnisotropy: Double = js.native
  var instancedArrays: Boolean = js.native
  var uintIndices: Boolean = js.native
  var highPrecisionShaderSupported: Boolean = js.native
  var fragmentDepthSupported: Boolean = js.native
  var textureFloatLinearFiltering: Boolean = js.native
  var textureFloatRender: Boolean = js.native
  var textureHalfFloat: Boolean = js.native
  var textureHalfFloatLinearFiltering: Boolean = js.native
  var textureHalfFloatRender: Boolean = js.native
  var textureLOD: Boolean = js.native
  var drawBuffersExtension: js.Any = js.native
  var colorBufferFloat: Boolean = js.native
}

@js.native
trait EngineOptions extends WebGLContextAttributes {
  var limitDeviceRatio: Double = js.native
  var autoEnableWebVR: Boolean = js.native
  var disableWebGL2Support: Boolean = js.native
  var audioEngine: Boolean = js.native
}

@js.native
@JSGlobal("BABYLON.Engine")
class Engine extends js.Object {
  def this(canvas: HTMLCanvasElement, antialias: Boolean = ???, options: EngineOptions = ???, adaptToDeviceRatio: Boolean = ???) = this()
  var isFullscreen: Boolean = js.native
  var isPointerLock: Boolean = js.native
  var cullBackFaces: Boolean = js.native
  var renderEvenInBackground: Boolean = js.native
  var preventCacheWipeBetweenFrames: Boolean = js.native
  var enableOfflineSupport: Database.type = js.native
  var scenes: js.Array[Scene] = js.native
  var onResizeObservable: Observable[Engine] = js.native
  var onCanvasBlurObservable: Observable[Engine] = js.native
  var vrDisplaysPromise: js.Any = js.native
  def badOS: Boolean = js.native
  def badDesktopOS: Boolean = js.native
  def texturesSupported: js.Array[String] = js.native
  def textureFormatInUse: String = js.native
  def emptyTexture: WebGLTexture = js.native
  def emptyCubeTexture: WebGLTexture = js.native
  def webGLVersion: Double = js.native
  def isStencilEnable: Boolean = js.native
  def resetTextureCache(): Unit = js.native
  def getGlInfo(): js.Any = js.native
  def getAspectRatio(camera: Camera, useScreen: Boolean = ???): Double = js.native
  def getRenderWidth(useScreen: Boolean = ???): Double = js.native
  def getRenderHeight(useScreen: Boolean = ???): Double = js.native
  def getRenderingCanvas(): HTMLCanvasElement = js.native
  def getRenderingCanvasClientRect(): ClientRect = js.native
  def setHardwareScalingLevel(level: Double): Unit = js.native
  def getHardwareScalingLevel(): Double = js.native
  def getLoadedTexturesCache(): js.Array[WebGLTexture] = js.native
  def getCaps(): EngineCapabilities = js.native
  def drawCalls: Double = js.native
  def drawCallsPerfCounter: PerfCounter = js.native
  def getDepthFunction(): Double = js.native
  def setDepthFunction(depthFunc: Double): Unit = js.native
  def setDepthFunctionToGreater(): Unit = js.native
  def setDepthFunctionToGreaterOrEqual(): Unit = js.native
  def setDepthFunctionToLess(): Unit = js.native
  def setDepthFunctionToLessOrEqual(): Unit = js.native
  def getStencilBuffer(): Boolean = js.native
  def setStencilBuffer(enable: Boolean): Unit = js.native
  def getStencilMask(): Double = js.native
  def setStencilMask(mask: Double): Unit = js.native
  def getStencilFunction(): Double = js.native
  def getStencilFunctionReference(): Double = js.native
  def getStencilFunctionMask(): Double = js.native
  def setStencilFunction(stencilFunc: Double): Unit = js.native
  def setStencilFunctionReference(reference: Double): Unit = js.native
  def setStencilFunctionMask(mask: Double): Unit = js.native
  def getStencilOperationFail(): Double = js.native
  def getStencilOperationDepthFail(): Double = js.native
  def getStencilOperationPass(): Double = js.native
  def setStencilOperationFail(operation: Double): Unit = js.native
  def setStencilOperationDepthFail(operation: Double): Unit = js.native
  def setStencilOperationPass(operation: Double): Unit = js.native
  def setDitheringState(value: Boolean): Unit = js.native
  def stopRenderLoop(renderFunction: js.Function0[Unit] = ???): Unit = js.native
  def runRenderLoop(renderFunction: js.Function0[Unit]): Unit = js.native
  def switchFullscreen(requestPointerLock: Boolean): Unit = js.native
  def clear(color: Color4, backBuffer: Boolean, depth: Boolean, stencil: Boolean = ???): Unit = js.native
  def scissorClear(x: Double, y: Double, width: Double, height: Double, clearColor: Color4): Unit = js.native
  def setViewport(viewport: Viewport, requiredWidth: Double = ???, requiredHeight: Double = ???): Unit = js.native
  def setDirectViewport(x: Double, y: Double, width: Double, height: Double): Viewport = js.native
  def beginFrame(): Unit = js.native
  def endFrame(): Unit = js.native
  def resize(): Unit = js.native
  def setSize(width: Double, height: Double): Unit = js.native
  def isVRDevicePresent(callback: js.Function1[Boolean, Unit]): Unit = js.native
  def getVRDevice(name: String, callback: js.Function1[js.Any, Unit]): Unit = js.native
  def initWebVR(): Unit = js.native
  def enableVR(vrDevice: js.Any): Unit = js.native
  def disableVR(): Unit = js.native
  def bindFramebuffer(texture: WebGLTexture, faceIndex: Double = ???, requiredWidth: Double = ???, requiredHeight: Double = ???): Unit = js.native
  def unBindFramebuffer(texture: WebGLTexture, disableGenerateMipMaps: Boolean = ???, onBeforeUnbind: js.Function0[Unit] = ???): Unit = js.native
  def generateMipMapsForCubemap(texture: WebGLTexture): Unit = js.native
  def flushFramebuffer(): Unit = js.native
  def restoreDefaultFramebuffer(): Unit = js.native
  def createUniformBuffer(elements: js.Array[Double] | Float32Array): WebGLBuffer = js.native
  def createDynamicUniformBuffer(elements: js.Array[Double] | Float32Array): WebGLBuffer = js.native
  def updateUniformBuffer(uniformBuffer: WebGLBuffer, elements: js.Array[Double] | Float32Array, offset: Double = ???, count: Double = ???): Unit = js.native
  def createVertexBuffer(vertices: js.Array[Double] | Float32Array): WebGLBuffer = js.native
  def createDynamicVertexBuffer(vertices: js.Array[Double] | Float32Array): WebGLBuffer = js.native
  def updateDynamicVertexBuffer(vertexBuffer: WebGLBuffer, vertices: js.Array[Double] | Float32Array, offset: Double = ???, count: Double = ???): Unit = js.native
  def createIndexBuffer(indices: IndicesArray): WebGLBuffer = js.native
  def bindArrayBuffer(buffer: WebGLBuffer): Unit = js.native
  def bindUniformBuffer(buffer: WebGLBuffer = ???): Unit = js.native
  def bindUniformBufferBase(buffer: WebGLBuffer, location: Double): Unit = js.native
  def bindUniformBlock(shaderProgram: WebGLProgram, blockName: String, index: Double): Unit = js.native
  def updateArrayBuffer(data: Float32Array): Unit = js.native
  def recordVertexArrayObject(vertexBuffers: js.Dictionary[VertexBuffer], indexBuffer: WebGLBuffer, effect: Effect): WebGLVertexArrayObject = js.native
  def bindVertexArrayObject(vertexArrayObject: WebGLVertexArrayObject, indexBuffer: WebGLBuffer): Unit = js.native
  def bindBuffersDirectly(vertexBuffer: WebGLBuffer, indexBuffer: WebGLBuffer, vertexDeclaration: js.Array[Double], vertexStrideSize: Double, effect: Effect): Unit = js.native
  def bindBuffers(vertexBuffers: js.Dictionary[VertexBuffer], indexBuffer: WebGLBuffer, effect: Effect): Unit = js.native
  def unbindInstanceAttributes(): Unit = js.native
  def releaseVertexArrayObject(vao: WebGLVertexArrayObject): Unit = js.native
  def createInstancesBuffer(capacity: Double): WebGLBuffer = js.native
  def deleteInstancesBuffer(buffer: WebGLBuffer): Unit = js.native
  def updateAndBindInstancesBuffer(instancesBuffer: WebGLBuffer, data: Float32Array, offsetLocations: js.Array[Double] | js.Array[InstancingAttributeInfo]): Unit = js.native
  def applyStates(): Unit = js.native
  def draw(useTriangles: Boolean, indexStart: Double, indexCount: Double, instancesCount: Double = ???): Unit = js.native
  def drawPointClouds(verticesStart: Double, verticesCount: Double, instancesCount: Double = ???): Unit = js.native
  def drawUnIndexed(useTriangles: Boolean, verticesStart: Double, verticesCount: Double, instancesCount: Double = ???): Unit = js.native
  def createEffect(baseName: js.Any, attributesNamesOrOptions: js.Array[String] | EffectCreationOptions, uniformsNamesOrEngine: js.Array[String] | Engine, samplers: js.Array[String] = ???, defines: String = ???, fallbacks: EffectFallbacks = ???, onCompiled: js.Function1[Effect, Unit] = ???, onError: js.Function2[Effect, String, Unit] = ???, indexParameters: js.Any = ???): Effect = js.native
  def createEffectForParticles(fragmentName: String, uniformsNames: js.Array[String] = ???, samplers: js.Array[String] = ???, defines: String = ???, fallbacks: EffectFallbacks = ???, onCompiled: js.Function1[Effect, Unit] = ???, onError: js.Function2[Effect, String, Unit] = ???): Effect = js.native
  def createShaderProgram(vertexCode: String, fragmentCode: String, defines: String, context: WebGLRenderingContext = ???): WebGLProgram = js.native
  def getUniforms(shaderProgram: WebGLProgram, uniformsNames: js.Array[String]): js.Array[WebGLUniformLocation] = js.native
  def getAttributes(shaderProgram: WebGLProgram, attributesNames: js.Array[String]): js.Array[Double] = js.native
  def enableEffect(effect: Effect): Unit = js.native
  def setIntArray(uniform: WebGLUniformLocation, array: Int32Array): Unit = js.native
  def setIntArray2(uniform: WebGLUniformLocation, array: Int32Array): Unit = js.native
  def setIntArray3(uniform: WebGLUniformLocation, array: Int32Array): Unit = js.native
  def setIntArray4(uniform: WebGLUniformLocation, array: Int32Array): Unit = js.native
  def setFloatArray(uniform: WebGLUniformLocation, array: Float32Array): Unit = js.native
  def setFloatArray2(uniform: WebGLUniformLocation, array: Float32Array): Unit = js.native
  def setFloatArray3(uniform: WebGLUniformLocation, array: Float32Array): Unit = js.native
  def setFloatArray4(uniform: WebGLUniformLocation, array: Float32Array): Unit = js.native
  def setArray(uniform: WebGLUniformLocation, array: js.Array[Double]): Unit = js.native
  def setArray2(uniform: WebGLUniformLocation, array: js.Array[Double]): Unit = js.native
  def setArray3(uniform: WebGLUniformLocation, array: js.Array[Double]): Unit = js.native
  def setArray4(uniform: WebGLUniformLocation, array: js.Array[Double]): Unit = js.native
  def setMatrices(uniform: WebGLUniformLocation, matrices: Float32Array): Unit = js.native
  def setMatrix(uniform: WebGLUniformLocation, matrix: Matrix): Unit = js.native
  def setMatrix3x3(uniform: WebGLUniformLocation, matrix: Float32Array): Unit = js.native
  def setMatrix2x2(uniform: WebGLUniformLocation, matrix: Float32Array): Unit = js.native
  def setFloat(uniform: WebGLUniformLocation, value: Double): Unit = js.native
  def setFloat2(uniform: WebGLUniformLocation, x: Double, y: Double): Unit = js.native
  def setFloat3(uniform: WebGLUniformLocation, x: Double, y: Double, z: Double): Unit = js.native
  def setBool(uniform: WebGLUniformLocation, bool: Double): Unit = js.native
  def setFloat4(uniform: WebGLUniformLocation, x: Double, y: Double, z: Double, w: Double): Unit = js.native
  def setColor3(uniform: WebGLUniformLocation, color3: Color3): Unit = js.native
  def setColor4(uniform: WebGLUniformLocation, color3: Color3, alpha: Double): Unit = js.native
  def setState(culling: Boolean, zOffset: Double = ???, force: Boolean = ???, reverseSide: Boolean = ???): Unit = js.native
  def setZOffset(value: Double): Unit = js.native
  def getZOffset(): Double = js.native
  def setDepthBuffer(enable: Boolean): Unit = js.native
  def getDepthWrite(): Boolean = js.native
  def setDepthWrite(enable: Boolean): Unit = js.native
  def setColorWrite(enable: Boolean): Unit = js.native
  def setAlphaConstants(r: Double, g: Double, b: Double, a: Double): Unit = js.native
  def setAlphaMode(mode: Double, noDepthWriteChange: Boolean = ???): Unit = js.native
  def getAlphaMode(): Double = js.native
  def setAlphaTesting(enable: Boolean): Unit = js.native
  def getAlphaTesting(): Boolean = js.native
  def wipeCaches(bruteForce: Boolean = ???): Unit = js.native
  def setTextureFormatToUse(formatsAvailable: js.Array[String]): String = js.native
  def createTexture(urlArg: String, noMipmap: Boolean, invertY: Boolean, scene: Scene, samplingMode: Double = ???, onLoad: js.Function0[Unit] = ???, onError: js.Function0[Unit] = ???, buffer: ArrayBuffer | HTMLImageElement = ???, fallBack: WebGLTexture = ???, format: Double = ???): WebGLTexture = js.native
  def updateRawTexture(texture: WebGLTexture, data: ArrayBufferView, format: Double, invertY: Boolean, compression: String = ???): Unit = js.native
  def createRawTexture(data: ArrayBufferView, width: Double, height: Double, format: Double, generateMipMaps: Boolean, invertY: Boolean, samplingMode: Double, compression: String = ???): WebGLTexture = js.native
  def createDynamicTexture(width: Double, height: Double, generateMipMaps: Boolean, samplingMode: Double): WebGLTexture = js.native
  def updateTextureSamplingMode(samplingMode: Double, texture: WebGLTexture): Unit = js.native
  def updateDynamicTexture(texture: WebGLTexture, canvas: HTMLCanvasElement, invertY: Boolean, premulAlpha: Boolean = ???, format: Double = ???): Unit = js.native
  def updateVideoTexture(texture: WebGLTexture, video: HTMLVideoElement, invertY: Boolean): Unit = js.native
  def createRenderTargetTexture(size: js.Any, options: js.Any): WebGLTexture = js.native
  def createMultipleRenderTarget(size: js.Any, options: js.Any): js.Array[WebGLTexture] = js.native
  def updateRenderTargetTextureSampleCount(texture: WebGLTexture, samples: Double): Double = js.native
  def createRenderTargetCubeTexture(size: Double, options: js.Any = ???): WebGLTexture = js.native
  def createPrefilteredCubeTexture(rootUrl: String, scene: Scene, scale: Double, offset: Double, onLoad: js.Function0[Unit], onError: js.Function0[Unit] = ???, format: Double = ???): WebGLTexture = js.native
  def createCubeTexture(rootUrl: String, scene: Scene, files: js.Array[String], noMipmap: Boolean = ???, onLoad: js.Function1[js.Any, Unit] = ???, onError: js.Function0[Unit] = ???, format: Double = ???): WebGLTexture = js.native
  def updateTextureSize(texture: WebGLTexture, width: Double, height: Double): Unit = js.native
  def updateRawCubeTexture(texture: WebGLTexture, data: js.Array[ArrayBufferView], format: Double, `type`: Double, invertY: Boolean, compression: String = ???, level: Double = ???): Unit = js.native
  def createRawCubeTexture(data: js.Array[ArrayBufferView], size: Double, format: Double, `type`: Double, generateMipMaps: Boolean, invertY: Boolean, samplingMode: Double, compression: String = ???): WebGLTexture = js.native
  def createRawCubeTextureFromUrl(url: String, scene: Scene, size: Double, format: Double, `type`: Double, noMipmap: Boolean, callback: js.Function1[ArrayBuffer, js.Array[ArrayBufferView]], mipmmapGenerator: js.Function1[js.Array[ArrayBufferView], js.Array[js.Array[ArrayBufferView]]], onLoad: js.Function0[Unit] = ???, onError: js.Function0[Unit] = ???, samplingMode: Double = ???, invertY: Boolean = ???): WebGLTexture = js.native
  def bindSamplers(effect: Effect): Unit = js.native
  def setTextureFromPostProcess(channel: Double, postProcess: PostProcess): Unit = js.native
  def unbindAllTextures(): Unit = js.native
  def setTexture(channel: Double, uniform: WebGLUniformLocation, texture: BaseTexture): Unit = js.native
  def setTextureArray(channel: Double, uniform: WebGLUniformLocation, textures: js.Array[BaseTexture]): Unit = js.native
  def readPixels(x: Double, y: Double, width: Double, height: Double): Uint8Array = js.native
  def addExternalData[T](key: String, data: T): Boolean = js.native
  def getExternalData[T](key: String): T = js.native
  def getOrAddExternalDataWithFactory[T](key: String, factory: js.Function1[String, T]): T = js.native
  def removeExternalData(key: js.Any): Boolean = js.native
  def releaseInternalTexture(texture: WebGLTexture): Unit = js.native
  def unbindAllAttributes(): Unit = js.native
  def releaseEffects(): Unit = js.native
  def dispose(): Unit = js.native
  def displayLoadingUI(): Unit = js.native
  def hideLoadingUI(): Unit = js.native
  var loadingScreen: ILoadingScreen = js.native
  var loadingUIText: String = js.native
  var loadingUIBackgroundColor: String = js.native
//   def attachContextLostEvent(callback: js.Function1[WebGLContextEvent, Unit]): Unit = js.native
//   def attachContextRestoredEvent(callback: js.Function1[WebGLContextEvent, Unit]): Unit = js.native
  def getVertexShaderSource(program: WebGLProgram): String = js.native
  def getFragmentShaderSource(program: WebGLProgram): String = js.native
  def getError(): Double = js.native
  def getFps(): Double = js.native
  def getDeltaTime(): Double = js.native
}

@js.native
@JSGlobal("BABYLON.Engine")
object Engine extends js.Object {
  var Instances: js.Array[Engine] = js.native
  def LastCreatedEngine: Engine = js.native
  def LastCreatedScene: Scene = js.native
  def MarkAllMaterialsAsDirty(flag: Double, predicate: js.Function1[Material, Boolean] = ???): Unit = js.native
  def NEVER: Double = js.native
  def ALWAYS: Double = js.native
  def LESS: Double = js.native
  def EQUAL: Double = js.native
  def LEQUAL: Double = js.native
  def GREATER: Double = js.native
  def GEQUAL: Double = js.native
  def NOTEQUAL: Double = js.native
  def KEEP: Double = js.native
  def REPLACE: Double = js.native
  def INCR: Double = js.native
  def DECR: Double = js.native
  def INVERT: Double = js.native
  def INCR_WRAP: Double = js.native
  def DECR_WRAP: Double = js.native
  def ALPHA_DISABLE: Double = js.native
  def ALPHA_ONEONE: Double = js.native
  def ALPHA_ADD: Double = js.native
  def ALPHA_COMBINE: Double = js.native
  def ALPHA_SUBTRACT: Double = js.native
  def ALPHA_MULTIPLY: Double = js.native
  def ALPHA_MAXIMIZED: Double = js.native
  def ALPHA_PREMULTIPLIED: Double = js.native
  def ALPHA_PREMULTIPLIED_PORTERDUFF: Double = js.native
  def ALPHA_INTERPOLATE: Double = js.native
  def ALPHA_SCREENMODE: Double = js.native
  def DELAYLOADSTATE_NONE: Double = js.native
  def DELAYLOADSTATE_LOADED: Double = js.native
  def DELAYLOADSTATE_LOADING: Double = js.native
  def DELAYLOADSTATE_NOTLOADED: Double = js.native
  def TEXTUREFORMAT_ALPHA: Double = js.native
  def TEXTUREFORMAT_LUMINANCE: Double = js.native
  def TEXTUREFORMAT_LUMINANCE_ALPHA: Double = js.native
  def TEXTUREFORMAT_RGB: Double = js.native
  def TEXTUREFORMAT_RGBA: Double = js.native
  def TEXTURETYPE_UNSIGNED_INT: Double = js.native
  def TEXTURETYPE_FLOAT: Double = js.native
  def TEXTURETYPE_HALF_FLOAT: Double = js.native
  def SCALEMODE_FLOOR: Double = js.native
  def SCALEMODE_NEAREST: Double = js.native
  def SCALEMODE_CEILING: Double = js.native
  def Version: String = js.native
  var CollisionsEpsilon: Double = js.native
  var CodeRepository: String = js.native
  var ShadersRepository: String = js.native
  var audioEngine: AudioEngine = js.native
  def isSupported(): Boolean = js.native
}

@js.native
@JSGlobal("BABYLON.Node")
class Node extends js.Object {
  def this(name: String, scene: Scene) = this()
  var name: String = js.native
  var id: String = js.native
  var uniqueId: Double = js.native
  var state: String = js.native
  var metadata: js.Any = js.native
  var doNotSerialize: Boolean = js.native
  var animations: js.Array[Animation] = js.native
  var onReady: js.Function1[Node, Unit] = js.native
  var parent: Node = js.native
  def getClassName(): String = js.native
  var onDisposeObservable: Observable[Node] = js.native
  var onDispose: js.Function0[Unit] = js.native
  def getScene(): Scene = js.native
  def getEngine(): Engine = js.native
  def getWorldMatrix(): Matrix = js.native
  def updateCache(force: Boolean = ???): Unit = js.native
  def isSynchronizedWithParent(): Boolean = js.native
  def isSynchronized(updateCache: Boolean = ???): Boolean = js.native
  def hasNewParent(update: Boolean = ???): Boolean = js.native
  def isReady(): Boolean = js.native
  def isEnabled(): Boolean = js.native
  def setEnabled(value: Boolean): Unit = js.native
  def isDescendantOf(ancestor: Node): Boolean = js.native
  def getDescendants(directDescendantsOnly: Boolean = ???, predicate: js.Function1[Node, Boolean] = ???): js.Array[Node] = js.native
  def getChildMeshes(directDecendantsOnly: Boolean = ???, predicate: js.Function1[Node, Boolean] = ???): js.Array[AbstractMesh] = js.native
  def getChildren(predicate: js.Function1[Node, Boolean] = ???): js.Array[Node] = js.native
  def getAnimationByName(name: String): Animation = js.native
  def createAnimationRange(name: String, from: Double, to: Double): Unit = js.native
  def deleteAnimationRange(name: String, deleteFrames: Boolean = ???): Unit = js.native
  def getAnimationRange(name: String): AnimationRange = js.native
  def beginAnimation(name: String, loop: Boolean = ???, speedRatio: Double = ???, onAnimationEnd: js.Function0[Unit] = ???): Unit = js.native
  def serializeAnimationRanges(): js.Dynamic = js.native
  def dispose(): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.Node")
object Node extends js.Object {
  def ParseAnimationRanges(node: Node, parsedNode: js.Any, scene: Scene): Unit = js.native
}

@js.native
trait IDisposable extends js.Object {
  def dispose(): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.PointerEventTypes")
class PointerEventTypes extends js.Object {
}

@js.native
@JSGlobal("BABYLON.PointerEventTypes")
object PointerEventTypes extends js.Object {
  def POINTERDOWN: Double = js.native
  def POINTERUP: Double = js.native
  def POINTERMOVE: Double = js.native
  def POINTERWHEEL: Double = js.native
  def POINTERPICK: Double = js.native
  def POINTERTAP: Double = js.native
  def POINTERDOUBLETAP: Double = js.native
}

@js.native
@JSGlobal("BABYLON.PointerInfoBase")
class PointerInfoBase extends js.Object {
  def this(`type`: Double, event: PointerEvent | MouseWheelEvent) = this()
  var `type`: Double = js.native
  var event: PointerEvent | MouseWheelEvent = js.native
}

@js.native
@JSGlobal("BABYLON.PointerInfoPre")
class PointerInfoPre extends PointerInfoBase {
  def this(`type`: Double, event: PointerEvent | MouseWheelEvent, localX: js.Any, localY: js.Any) = this()
  var localPosition: Vector2 = js.native
  var skipOnPointerObservable: Boolean = js.native
}

@js.native
@JSGlobal("BABYLON.PointerInfo")
class PointerInfo extends PointerInfoBase {
  def this(`type`: Double, event: PointerEvent | MouseWheelEvent, pickInfo: PickingInfo) = this()
  var pickInfo: PickingInfo = js.native
}

@js.native
@JSGlobal("BABYLON.RenderingGroupInfo")
class RenderingGroupInfo extends js.Object {
  var scene: Scene = js.native
  var camera: Camera = js.native
  var renderingGroupId: Double = js.native
  var renderStage: Double = js.native
}

@js.native
@JSGlobal("BABYLON.RenderingGroupInfo")
object RenderingGroupInfo extends js.Object {
  var STAGE_PRECLEAR: Double = js.native
  var STAGE_PREOPAQUE: Double = js.native
  var STAGE_PRETRANSPARENT: Double = js.native
  var STAGE_POSTTRANSPARENT: Double = js.native
}

@js.native
@JSGlobal("BABYLON.Scene")
class Scene extends IAnimatable {
  def this(engine: Engine) = this()
  var autoClear: Boolean = js.native
  var autoClearDepthAndStencil: Boolean = js.native
  var clearColor: Color4 = js.native
  var ambientColor: Color3 = js.native
  protected var _environmentTexture: BaseTexture = js.native
  var environmentTexture: BaseTexture = js.native
  protected var _imageProcessingConfiguration: ImageProcessingConfiguration = js.native
  def imageProcessingConfiguration: ImageProcessingConfiguration = js.native
  var forceWireframe: Boolean = js.native
  var forcePointsCloud: Boolean = js.native
  var forceShowBoundingBoxes: Boolean = js.native
  var clipPlane: Plane = js.native
  var animationsEnabled: Boolean = js.native
  var constantlyUpdateMeshUnderPointer: Boolean = js.native
  var hoverCursor: String = js.native
  var metadata: js.Any = js.native
  var onDisposeObservable: Observable[Scene] = js.native
  var onDispose: js.Function0[Unit] = js.native
  var onBeforeRenderObservable: Observable[Scene] = js.native
  var beforeRender: js.Function0[Unit] = js.native
  var onAfterRenderObservable: Observable[Scene] = js.native
  var afterRender: js.Function0[Unit] = js.native
  var onReadyObservable: Observable[Scene] = js.native
  var onBeforeCameraRenderObservable: Observable[Camera] = js.native
  var beforeCameraRender: js.Function0[Unit] = js.native
  var onAfterCameraRenderObservable: Observable[Camera] = js.native
  var afterCameraRender: js.Function0[Unit] = js.native
  var onNewCameraAddedObservable: Observable[Camera] = js.native
  var onCameraRemovedObservable: Observable[Camera] = js.native
  var onNewLightAddedObservable: Observable[Light] = js.native
  var onLightRemovedObservable: Observable[Light] = js.native
  var onNewGeometryAddedObservable: Observable[Geometry] = js.native
  var onGeometryRemovedObservable: Observable[Geometry] = js.native
  var onNewMeshAddedObservable: Observable[AbstractMesh] = js.native
  var onMeshRemovedObservable: Observable[AbstractMesh] = js.native
  var onRenderingGroupObservable: Observable[RenderingGroupInfo] = js.native

  var pointerDownPredicate: js.Function1[AbstractMesh, Boolean] = js.native
  var pointerUpPredicate: js.Function1[AbstractMesh, Boolean] = js.native
  var pointerMovePredicate: js.Function1[AbstractMesh, Boolean] = js.native
  var onPointerMove: js.Function2[PointerEvent, PickingInfo, Unit] = js.native
  var onPointerDown: js.Function2[PointerEvent, PickingInfo, Unit] = js.native
  var onPointerUp: js.Function2[PointerEvent, PickingInfo, Unit] = js.native
  var onPointerPick: js.Function2[PointerEvent, PickingInfo, Unit] = js.native
  var onPrePointerObservable: Observable[PointerInfoPre] = js.native
  var onPointerObservable: Observable[PointerInfo] = js.native
  def unTranslatedPointer: Vector2 = js.native
  var cameraToUseForPointers: Camera = js.native
  var useRightHandedSystem: Boolean = js.native
  var fogEnabled: Boolean = js.native
  var fogMode: Double = js.native
  var fogColor: Color3 = js.native
  var fogDensity: Double = js.native
  var fogStart: Double = js.native
  var fogEnd: Double = js.native
  var shadowsEnabled: Boolean = js.native
  var lightsEnabled: Boolean = js.native
  var lights: js.Array[Light] = js.native
  var cameras: js.Array[Camera] = js.native
  var activeCameras: js.Array[Camera] = js.native
  var activeCamera: Camera = js.native
  var meshes: js.Array[AbstractMesh] = js.native
  var materials: js.Array[Material] = js.native
  var multiMaterials: js.Array[MultiMaterial] = js.native
  var defaultMaterial: Material = js.native
  var texturesEnabled: Boolean = js.native
  var textures: js.Array[BaseTexture] = js.native
  var particlesEnabled: Boolean = js.native
  var particleSystems: js.Array[ParticleSystem] = js.native
  var spritesEnabled: Boolean = js.native
  var spriteManagers: js.Array[SpriteManager] = js.native
  var layers: js.Array[Layer] = js.native
  var highlightLayers: js.Array[HighlightLayer] = js.native
  var skeletonsEnabled: Boolean = js.native
  var skeletons: js.Array[Skeleton] = js.native
  var morphTargetManagers: js.Array[MorphTargetManager] = js.native
  var lensFlaresEnabled: Boolean = js.native
  var lensFlareSystems: js.Array[LensFlareSystem] = js.native
  var collisionsEnabled: Boolean = js.native
  var collisionCoordinator: ICollisionCoordinator = js.native
  var gravity: Vector3 = js.native
  var postProcessesEnabled: Boolean = js.native
  var postProcessManager: PostProcessManager = js.native
  def postProcessRenderPipelineManager: PostProcessRenderPipelineManager = js.native
  var renderTargetsEnabled: Boolean = js.native
  var dumpNextRenderTargets: Boolean = js.native
  var customRenderTargets: js.Array[RenderTargetTexture] = js.native
  var useDelayedTextureLoading: Boolean = js.native
  var importedMeshesFiles: js.Array[String] = js.native
  var probesEnabled: Boolean = js.native
  var reflectionProbes: js.Array[ReflectionProbe] = js.native
  var database: js.Any = js.native
  var actionManager: ActionManager = js.native
  var proceduralTexturesEnabled: Boolean = js.native
  var mainSoundTrack: SoundTrack = js.native
  var soundTracks: js.Array[SoundTrack] = js.native
  var simplificationQueue: SimplificationQueue = js.native
  var animationTimeScale: Double = js.native
  def frustumPlanes: js.Array[Plane] = js.native
  var requireLightSorting: Boolean = js.native
  def debugLayer: DebugLayer = js.native
  var workerCollisions: Boolean = js.native
  def selectionOctree: Octree[AbstractMesh] = js.native
  def meshUnderPointer: AbstractMesh = js.native
  def pointerX: Double = js.native
  def pointerY: Double = js.native
  def getCachedMaterial(): Material = js.native
  def getCachedEffect(): Effect = js.native
  def getCachedVisibility(): Double = js.native
  def isCachedMaterialValid(material: Material, effect: Effect, visibility: Double = ???): Boolean = js.native
  def getBoundingBoxRenderer(): BoundingBoxRenderer = js.native
  def getOutlineRenderer(): OutlineRenderer = js.native
  def getEngine(): Engine = js.native
  def getTotalVertices(): Double = js.native
  def totalVerticesPerfCounter: PerfCounter = js.native
  def getActiveIndices(): Double = js.native
  def totalActiveIndicesPerfCounter: PerfCounter = js.native
  def getActiveParticles(): Double = js.native
  def activeParticlesPerfCounter: PerfCounter = js.native
  def getActiveBones(): Double = js.native
  def activeBonesPerfCounter: PerfCounter = js.native
  def getLastFrameDuration(): Double = js.native
  def lastFramePerfCounter: PerfCounter = js.native
  def getEvaluateActiveMeshesDuration(): Double = js.native
  def evaluateActiveMeshesDurationPerfCounter: PerfCounter = js.native
  def getActiveMeshes(): SmartArray[Mesh] = js.native
  def getRenderTargetsDuration(): Double = js.native
  def getRenderDuration(): Double = js.native
  def renderDurationPerfCounter: PerfCounter = js.native
  def getParticlesDuration(): Double = js.native
  def particlesDurationPerfCounter: PerfCounter = js.native
  def getSpritesDuration(): Double = js.native
  def spriteDuractionPerfCounter: PerfCounter = js.native
  def getAnimationRatio(): Double = js.native
  def getRenderId(): Double = js.native
  def incrementRenderId(): Unit = js.native
  def attachControl(attachUp: Boolean = ???, attachDown: Boolean = ???, attachMove: Boolean = ???): Unit = js.native
  def detachControl(): Unit = js.native
  def isReady(): Boolean = js.native
  def resetCachedMaterial(): Unit = js.native
  def registerBeforeRender(func: js.Function0[Unit]): Unit = js.native
  def unregisterBeforeRender(func: js.Function0[Unit]): Unit = js.native
  def registerAfterRender(func: js.Function0[Unit]): Unit = js.native
  def unregisterAfterRender(func: js.Function0[Unit]): Unit = js.native
  def getWaitingItemsCount(): Double = js.native
  def executeWhenReady(func: js.Function0[Unit]): Unit = js.native
  def beginAnimation(target: js.Any, from: Double, to: Double, loop: Boolean = ???, speedRatio: Double = ???, onAnimationEnd: js.Function0[Unit] = ???, animatable: Animatable = ???): Animatable = js.native
  def beginDirectAnimation(target: js.Any, animations: js.Array[Animation], from: Double, to: Double, loop: Boolean = ???, speedRatio: Double = ???, onAnimationEnd: js.Function0[Unit] = ???): Animatable = js.native
  def getAnimatableByTarget(target: js.Any): Animatable = js.native
  def Animatables: js.Array[Animatable] = js.native
  def stopAnimation(target: js.Any, animationName: String = ???): Unit = js.native
  def getViewMatrix(): Matrix = js.native
  def getProjectionMatrix(): Matrix = js.native
  def getTransformMatrix(): Matrix = js.native
  def setTransformMatrix(view: Matrix, projection: Matrix): Unit = js.native
  def getSceneUniformBuffer(): UniformBuffer = js.native
  def getUniqueId(): Double = js.native
  def addMesh(newMesh: AbstractMesh): Unit = js.native
  def removeMesh(toRemove: AbstractMesh): Double = js.native
  def removeSkeleton(toRemove: Skeleton): Double = js.native
  def removeMorphTargetManager(toRemove: MorphTargetManager): Double = js.native
  def removeLight(toRemove: Light): Double = js.native
  def removeCamera(toRemove: Camera): Double = js.native
  def addLight(newLight: Light): Unit = js.native
  def sortLightsByPriority(): Unit = js.native
  def addCamera(newCamera: Camera): Unit = js.native
  def switchActiveCamera(newCamera: Camera, attachControl: Boolean = ???): Unit = js.native
  def setActiveCameraByID(id: String): Camera = js.native
  def setActiveCameraByName(name: String): Camera = js.native
  def getMaterialByID(id: String): Material = js.native
  def getMaterialByName(name: String): Material = js.native
  def getLensFlareSystemByName(name: String): LensFlareSystem = js.native
  def getLensFlareSystemByID(id: String): LensFlareSystem = js.native
  def getCameraByID(id: String): Camera = js.native
  def getCameraByUniqueID(uniqueId: Double): Camera = js.native
  def getCameraByName(name: String): Camera = js.native
  def getBoneByID(id: String): Bone = js.native
  def getBoneByName(name: String): Bone = js.native
  def getLightByName(name: String): Light = js.native
  def getLightByID(id: String): Light = js.native
  def getLightByUniqueID(uniqueId: Double): Light = js.native
  def getParticleSystemByID(id: String): ParticleSystem = js.native
  def getGeometryByID(id: String): Geometry = js.native
  def pushGeometry(geometry: Geometry, force: Boolean = ???): Boolean = js.native
  def removeGeometry(geometry: Geometry): Boolean = js.native
  def getGeometries(): js.Array[Geometry] = js.native
  def getMeshByID(id: String): AbstractMesh = js.native
  def getMeshesByID(id: String): js.Array[AbstractMesh] = js.native
  def getMeshByUniqueID(uniqueId: Double): AbstractMesh = js.native
  def getLastMeshByID(id: String): AbstractMesh = js.native
  def getLastEntryByID(id: String): Node = js.native
  def getNodeByID(id: String): Node = js.native
  def getNodeByName(name: String): Node = js.native
  def getMeshByName(name: String): AbstractMesh = js.native
  def getSoundByName(name: String): Sound = js.native
  def getLastSkeletonByID(id: String): Skeleton = js.native
  def getSkeletonById(id: String): Skeleton = js.native
  def getSkeletonByName(name: String): Skeleton = js.native
  def getMorphTargetManagerById(id: Double): MorphTargetManager = js.native
  def isActiveMesh(mesh: Mesh): Boolean = js.native
  def getHighlightLayerByName(name: String): HighlightLayer = js.native
  def uid: String = js.native
  def addExternalData[T](key: String, data: T): Boolean = js.native
  def getExternalData[T](key: String): T = js.native
  def getOrAddExternalDataWithFactory[T](key: String, factory: js.Function1[String, T]): T = js.native
  def removeExternalData(key: js.Any): Boolean = js.native
  def updateTransformMatrix(force: Boolean = ???): Unit = js.native
  def render(): Unit = js.native
  var audioEnabled: Boolean = js.native
  var headphone: Boolean = js.native
  def enableDepthRenderer(): DepthRenderer = js.native
  def disableDepthRenderer(): Unit = js.native
  def enableGeometryBufferRenderer(ratio: Double = ???): GeometryBufferRenderer = js.native
  def disableGeometryBufferRenderer(): Unit = js.native
  def freezeMaterials(): Unit = js.native
  def unfreezeMaterials(): Unit = js.native
  def dispose(): Unit = js.native
  def isDisposed: Boolean = js.native
  def disposeSounds(): Unit = js.native
  def getWorldExtends(): js.Any = js.native
  def createOrUpdateSelectionOctree(maxCapacity: Double = ???, maxDepth: Double = ???): Octree[AbstractMesh] = js.native
  def createPickingRay(x: Double, y: Double, world: Matrix, camera: Camera, cameraViewSpace: Boolean = ???): Ray = js.native
  def createPickingRayInCameraSpace(x: Double, y: Double, camera: Camera): Ray = js.native
  def pick(x: Double, y: Double, predicate: js.Function1[AbstractMesh, Boolean] = ???, fastCheck: Boolean = ???, camera: Camera = ???): PickingInfo = js.native
  def pickSprite(x: Double, y: Double, predicate: js.Function1[Sprite, Boolean] = ???, fastCheck: Boolean = ???, camera: Camera = ???): PickingInfo = js.native
  def pickWithRay(ray: Ray, predicate: js.Function1[Mesh, Boolean], fastCheck: Boolean = ???): PickingInfo = js.native
  def multiPick(x: Double, y: Double, predicate: js.Function1[AbstractMesh, Boolean] = ???, camera: Camera = ???): js.Array[PickingInfo] = js.native
  def multiPickWithRay(ray: Ray, predicate: js.Function1[Mesh, Boolean]): js.Array[PickingInfo] = js.native
  def setPointerOverMesh(mesh: AbstractMesh): Unit = js.native
  def getPointerOverMesh(): AbstractMesh = js.native
  def setPointerOverSprite(sprite: Sprite): Unit = js.native
  def getPointerOverSprite(): Sprite = js.native
  def getPhysicsEngine(): PhysicsEngine = js.native
  def enablePhysics(gravity: Vector3 = ???, plugin: IPhysicsEnginePlugin = ???): Boolean = js.native
  def disablePhysicsEngine(): Unit = js.native
  def isPhysicsEnabled(): Boolean = js.native
  def deleteCompoundImpostor(compound: js.Any): Unit = js.native
  def createDefaultCameraOrLight(createArcRotateCamera: Boolean = ???, replace: Boolean = ???, attachCameraControls: Boolean = ???): Unit = js.native
  def createDefaultSkybox(environmentTexture: BaseTexture = ???, pbr: Boolean = ???, scale: Double = ???, blur: Double = ???): Mesh = js.native
  def getMeshesByTags(tagsQuery: String, forEach: js.Function1[AbstractMesh, Unit] = ???): js.Array[Mesh] = js.native
  def getCamerasByTags(tagsQuery: String, forEach: js.Function1[Camera, Unit] = ???): js.Array[Camera] = js.native
  def getLightsByTags(tagsQuery: String, forEach: js.Function1[Light, Unit] = ???): js.Array[Light] = js.native
  def getMaterialByTags(tagsQuery: String, forEach: js.Function1[Material, Unit] = ???): js.Array[Material] = js.native
  def setRenderingOrder(renderingGroupId: Double, opaqueSortCompareFn: js.Function2[SubMesh, SubMesh, Double] = ???, alphaTestSortCompareFn: js.Function2[SubMesh, SubMesh, Double] = ???, transparentSortCompareFn: js.Function2[SubMesh, SubMesh, Double] = ???): Unit = js.native
  def setRenderingAutoClearDepthStencil(renderingGroupId: Double, autoClearDepthStencil: Boolean, depth: Boolean = ???, stencil: Boolean = ???): Unit = js.native
  def markAllMaterialsAsDirty(flag: Double, predicate: js.Function1[Material, Boolean] = ???): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.Scene")
object Scene extends js.Object {
  var MinDeltaTime: Double = js.native
  var MaxDeltaTime: Double = js.native
  def FOGMODE_NONE: Double = js.native
  def FOGMODE_EXP: Double = js.native
  def FOGMODE_EXP2: Double = js.native
  def FOGMODE_LINEAR: Double = js.native
  var DragMovementThreshold: Double = js.native
  var LongPressDelay: Double = js.native
  var DoubleClickDelay: Double = js.native
  var ExclusiveDoubleClickMode: Boolean = js.native
}

@js.native
@JSGlobal("BABYLON.Action")
class Action extends js.Object {
  def this(triggerOptions: js.Any, condition: Condition = ???) = this()
  var triggerOptions: js.Any = js.native
  var trigger: Double = js.native
  def getTriggerParameter(): js.Dynamic = js.native
  def execute(evt: ActionEvent): Unit = js.native
  def skipToNextActiveAction(): Unit = js.native
  def `then`(action: Action): Action = js.native
  def serialize(parent: js.Any): js.Dynamic = js.native
}

@js.native
@JSGlobal("BABYLON.Action")
object Action extends js.Object {
}

@js.native
@JSGlobal("BABYLON.ActionEvent")
class ActionEvent extends js.Object {
  def this(source: js.Any, pointerX: Double, pointerY: Double, meshUnderPointer: AbstractMesh, sourceEvent: js.Any = ???, additionalData: js.Any = ???) = this()
  var source: js.Any = js.native
  var pointerX: Double = js.native
  var pointerY: Double = js.native
  var meshUnderPointer: AbstractMesh = js.native
  var sourceEvent: js.Any = js.native
  var additionalData: js.Any = js.native
}

@js.native
@JSGlobal("BABYLON.ActionEvent")
object ActionEvent extends js.Object {
  def CreateNew(source: AbstractMesh, evt: Event = ???, additionalData: js.Any = ???): ActionEvent = js.native
  def CreateNewFromSprite(source: Sprite, scene: Scene, evt: Event = ???, additionalData: js.Any = ???): ActionEvent = js.native
  def CreateNewFromScene(scene: Scene, evt: Event): ActionEvent = js.native
  def CreateNewFromPrimitive(prim: js.Any, pointerPos: Vector2, evt: Event = ???, additionalData: js.Any = ???): ActionEvent = js.native
}

@js.native
@JSGlobal("BABYLON.ActionManager")
class ActionManager extends js.Object {
  def this(scene: Scene) = this()
  var actions: js.Array[Action] = js.native
  var hoverCursor: String = js.native
  def dispose(): Unit = js.native
  def getScene(): Scene = js.native
  def hasSpecificTriggers(triggers: js.Array[Double]): Boolean = js.native
  def hasSpecificTrigger(trigger: Double): Boolean = js.native
  def hasPointerTriggers: Boolean = js.native
  def hasPickTriggers: Boolean = js.native
  def registerAction(action: Action): Action = js.native
  def processTrigger(trigger: Double, evt: ActionEvent): Unit = js.native
  def serialize(name: String): js.Dynamic = js.native
}

@js.native
@JSGlobal("BABYLON.ActionManager")
object ActionManager extends js.Object {
  def NothingTrigger: Double = js.native
  def OnPickTrigger: Double = js.native
  def OnLeftPickTrigger: Double = js.native
  def OnRightPickTrigger: Double = js.native
  def OnCenterPickTrigger: Double = js.native
  def OnPickDownTrigger: Double = js.native
  def OnDoublePickTrigger: Double = js.native
  def OnPickUpTrigger: Double = js.native
  def OnPickOutTrigger: Double = js.native
  def OnLongPressTrigger: Double = js.native
  def OnPointerOverTrigger: Double = js.native
  def OnPointerOutTrigger: Double = js.native
  def OnEveryFrameTrigger: Double = js.native
  def OnIntersectionEnterTrigger: Double = js.native
  def OnIntersectionExitTrigger: Double = js.native
  def OnKeyDownTrigger: Double = js.native
  def OnKeyUpTrigger: Double = js.native
  def HasTriggers: Boolean = js.native
  def HasPickTriggers: Boolean = js.native
  def HasSpecificTrigger(trigger: Double): Boolean = js.native
  def Parse(parsedActions: js.Any, `object`: AbstractMesh, scene: Scene): Unit = js.native
  def GetTriggerName(trigger: Double): String = js.native
}

@js.native
@JSGlobal("BABYLON.Condition")
class Condition extends js.Object {
  def this(actionManager: ActionManager) = this()
  def isValid(): Boolean = js.native
  def serialize(): js.Dynamic = js.native
}

@js.native
@JSGlobal("BABYLON.ValueCondition")
class ValueCondition extends Condition {
  def this(actionManager: ActionManager, target: js.Any, propertyPath: String, value: js.Any, operator: Double = ???) = this()
  var propertyPath: String = js.native
  var value: js.Any = js.native
  var operator: Double = js.native
  override def isValid(): Boolean = js.native
  override def serialize(): js.Dynamic = js.native
}

@js.native
@JSGlobal("BABYLON.ValueCondition")
object ValueCondition extends js.Object {
  def IsEqual: Double = js.native
  def IsDifferent: Double = js.native
  def IsGreater: Double = js.native
  def IsLesser: Double = js.native
  def GetOperatorName(operator: Double): String = js.native
}

@js.native
@JSGlobal("BABYLON.PredicateCondition")
class PredicateCondition extends Condition {
  def this(actionManager: ActionManager, predicate: js.Function0[Boolean]) = this()
  var predicate: js.Function0[Boolean] = js.native
  override def isValid(): Boolean = js.native
}

@js.native
@JSGlobal("BABYLON.StateCondition")
class StateCondition extends Condition {
  def this(actionManager: ActionManager, target: js.Any, value: String) = this()
  var value: String = js.native
  override def isValid(): Boolean = js.native
  override def serialize(): js.Dynamic = js.native
}

@js.native
@JSGlobal("BABYLON.SwitchBooleanAction")
class SwitchBooleanAction extends Action {
  def this(triggerOptions: js.Any, target: js.Any, propertyPath: String, condition: Condition = ???) = this()
  var propertyPath: String = js.native
  def execute(): Unit = js.native
  override def serialize(parent: js.Any): js.Dynamic = js.native
}

@js.native
@JSGlobal("BABYLON.SetStateAction")
class SetStateAction extends Action {
  def this(triggerOptions: js.Any, target: js.Any, value: String, condition: Condition = ???) = this()
  var value: String = js.native
  def execute(): Unit = js.native
  override def serialize(parent: js.Any): js.Dynamic = js.native
}

@js.native
@JSGlobal("BABYLON.SetValueAction")
class SetValueAction extends Action {
  def this(triggerOptions: js.Any, target: js.Any, propertyPath: String, value: js.Any, condition: Condition = ???) = this()
  var propertyPath: String = js.native
  var value: js.Any = js.native
  def execute(): Unit = js.native
  override def serialize(parent: js.Any): js.Dynamic = js.native
}

@js.native
@JSGlobal("BABYLON.IncrementValueAction")
class IncrementValueAction extends Action {
  def this(triggerOptions: js.Any, target: js.Any, propertyPath: String, value: js.Any, condition: Condition = ???) = this()
  var propertyPath: String = js.native
  var value: js.Any = js.native
  def execute(): Unit = js.native
  override def serialize(parent: js.Any): js.Dynamic = js.native
}

@js.native
@JSGlobal("BABYLON.PlayAnimationAction")
class PlayAnimationAction extends Action {
  def this(triggerOptions: js.Any, target: js.Any, from: Double, to: Double, loop: Boolean = ???, condition: Condition = ???) = this()
  var from: Double = js.native
  var to: Double = js.native
  var loop: Boolean = js.native
  def execute(): Unit = js.native
  override def serialize(parent: js.Any): js.Dynamic = js.native
}

@js.native
@JSGlobal("BABYLON.StopAnimationAction")
class StopAnimationAction extends Action {
  def this(triggerOptions: js.Any, target: js.Any, condition: Condition = ???) = this()
  def execute(): Unit = js.native
  override def serialize(parent: js.Any): js.Dynamic = js.native
}

@js.native
@JSGlobal("BABYLON.DoNothingAction")
class DoNothingAction extends Action {
  def this(triggerOptions: js.Any = ???, condition: Condition = ???) = this()
  def execute(): Unit = js.native
  override def serialize(parent: js.Any): js.Dynamic = js.native
}

@js.native
@JSGlobal("BABYLON.CombineAction")
class CombineAction extends Action {
  def this(triggerOptions: js.Any, children: js.Array[Action], condition: Condition = ???) = this()
  var children: js.Array[Action] = js.native
  override def execute(evt: ActionEvent): Unit = js.native
  override def serialize(parent: js.Any): js.Dynamic = js.native
}

@js.native
@JSGlobal("BABYLON.ExecuteCodeAction")
class ExecuteCodeAction extends Action {
  def this(triggerOptions: js.Any, func: js.Function1[ActionEvent, Unit], condition: Condition = ???) = this()
  var func: js.Function1[ActionEvent, Unit] = js.native
  override def execute(evt: ActionEvent): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.SetParentAction")
class SetParentAction extends Action {
  def this(triggerOptions: js.Any, target: js.Any, parent: js.Any, condition: Condition = ???) = this()
  def execute(): Unit = js.native
  override def serialize(parent: js.Any): js.Dynamic = js.native
}

@js.native
@JSGlobal("BABYLON.PlaySoundAction")
class PlaySoundAction extends Action {
  def this(triggerOptions: js.Any, sound: Sound, condition: Condition = ???) = this()
  def execute(): Unit = js.native
  override def serialize(parent: js.Any): js.Dynamic = js.native
}

@js.native
@JSGlobal("BABYLON.StopSoundAction")
class StopSoundAction extends Action {
  def this(triggerOptions: js.Any, sound: Sound, condition: Condition = ???) = this()
  def execute(): Unit = js.native
  override def serialize(parent: js.Any): js.Dynamic = js.native
}

@js.native
@JSGlobal("BABYLON.InterpolateValueAction")
class InterpolateValueAction extends Action {
  def this(triggerOptions: js.Any, target: js.Any, propertyPath: String, value: js.Any, duration: Double = ???, condition: Condition = ???, stopOtherAnimations: Boolean = ???, onInterpolationDone: js.Function0[Unit] = ???) = this()
  var propertyPath: String = js.native
  var value: js.Any = js.native
  var duration: Double = js.native
  var stopOtherAnimations: Boolean = js.native
  var onInterpolationDone: js.Function0[Unit] = js.native
  def execute(): Unit = js.native
  override def serialize(parent: js.Any): js.Dynamic = js.native
}

@js.native
@JSGlobal("BABYLON.Animatable")
class Animatable extends js.Object {
  def this(scene: Scene, target: js.Any, fromFrame: Double = ???, toFrame: Double = ???, loopAnimation: Boolean = ???, speedRatio: Double = ???, onAnimationEnd: js.Any = ???, animations: js.Any = ???) = this()
  var target: js.Any = js.native
  var fromFrame: Double = js.native
  var toFrame: Double = js.native
  var loopAnimation: Boolean = js.native
  var speedRatio: Double = js.native
  var onAnimationEnd: js.Any = js.native
  var animationStarted: Boolean = js.native
  def getAnimations(): js.Array[Animation] = js.native
  def appendAnimations(target: js.Any, animations: js.Array[Animation]): Unit = js.native
  def getAnimationByTargetProperty(property: String): Animation = js.native
  def reset(): Unit = js.native
  def enableBlending(blendingSpeed: Double): Unit = js.native
  def disableBlending(): Unit = js.native
  def goToFrame(frame: Double): Unit = js.native
  def pause(): Unit = js.native
  def restart(): Unit = js.native
  def stop(animationName: String = ???): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.AnimationRange")
class AnimationRange extends js.Object {
  def this(name: String, from: Double, to: Double) = this()
  var name: String = js.native
  var from: Double = js.native
  var to: Double = js.native
  override def clone(): AnimationRange = js.native
}

@js.native
@JSGlobal("BABYLON.AnimationEvent")
class AnimationEvent extends js.Object {
  def this(frame: Double, action: js.Function0[Unit], onlyOnce: Boolean = ???) = this()
  var frame: Double = js.native
  var action: js.Function0[Unit] = js.native
  var onlyOnce: Boolean = js.native
  var isDone: Boolean = js.native
}

@js.native
@JSGlobal("BABYLON.PathCursor")
class PathCursor extends js.Object {
  def this(path: Path2) = this()
  var value: Double = js.native
  var animations: js.Array[Animation] = js.native
  def getPoint(): Vector3 = js.native
  def moveAhead(step: Double = ???): PathCursor = js.native
  def moveBack(step: Double = ???): PathCursor = js.native
  def move(step: Double): PathCursor = js.native
  def onchange(f: js.Function1[PathCursor, Unit]): PathCursor = js.native
}

@js.native
@JSGlobal("BABYLON.Animation")
class Animation extends js.Object {
  def this(name: String, targetProperty: String, framePerSecond: Double, dataType: Double, loopMode: Double = ???, enableBlending: Boolean = ???) = this()
  var name: String = js.native
  var targetProperty: String = js.native
  var framePerSecond: Double = js.native
  var dataType: Double = js.native
  var loopMode: Double = js.native
  var enableBlending: Boolean = js.native
  var targetPropertyPath: js.Array[String] = js.native
  var currentFrame: Double = js.native
  var allowMatricesInterpolation: Boolean = js.native
  var blendingSpeed: Double = js.native
  def toString(fullDetails: Boolean = ???): String = js.native
  def addEvent(event: AnimationEvent): Unit = js.native
  def removeEvents(frame: Double): Unit = js.native
  def createRange(name: String, from: Double, to: Double): Unit = js.native
  def deleteRange(name: String, deleteFrames: Boolean = ???): Unit = js.native
  def getRange(name: String): AnimationRange = js.native
  def reset(): Unit = js.native
  def isStopped(): Boolean = js.native
  def getKeys(): js.Array[js.Any] = js.native
  def getHighestFrame(): Double = js.native
  def getEasingFunction(): IEasingFunction = js.native
  def setEasingFunction(easingFunction: EasingFunction): Unit = js.native
  def floatInterpolateFunction(startValue: Double, endValue: Double, gradient: Double): Double = js.native
  def floatInterpolateFunctionWithTangents(startValue: Double, outTangent: Double, endValue: Double, inTangent: Double, gradient: Double): Double = js.native
  def quaternionInterpolateFunction(startValue: Quaternion, endValue: Quaternion, gradient: Double): Quaternion = js.native
  def quaternionInterpolateFunctionWithTangents(startValue: Quaternion, outTangent: Quaternion, endValue: Quaternion, inTangent: Quaternion, gradient: Double): Quaternion = js.native
  def vector3InterpolateFunction(startValue: Vector3, endValue: Vector3, gradient: Double): Vector3 = js.native
  def vector3InterpolateFunctionWithTangents(startValue: Vector3, outTangent: Vector3, endValue: Vector3, inTangent: Vector3, gradient: Double): Vector3 = js.native
  def vector2InterpolateFunction(startValue: Vector2, endValue: Vector2, gradient: Double): Vector2 = js.native
  def vector2InterpolateFunctionWithTangents(startValue: Vector2, outTangent: Vector2, endValue: Vector2, inTangent: Vector2, gradient: Double): Vector2 = js.native
  def sizeInterpolateFunction(startValue: Size, endValue: Size, gradient: Double): Size = js.native
  def color3InterpolateFunction(startValue: Color3, endValue: Color3, gradient: Double): Color3 = js.native
  def matrixInterpolateFunction(startValue: Matrix, endValue: Matrix, gradient: Double): Matrix = js.native
  override def clone(): Animation = js.native
  def setKeys(values: js.Array[js.Any]): Unit = js.native
  def setValue(currentValue: js.Any, blend: Boolean = ???): Unit = js.native
  def goToFrame(frame: Double): Unit = js.native
  def animate(delay: Double, from: Double, to: Double, loop: Boolean, speedRatio: Double, blend: Boolean = ???): Boolean = js.native
  def serialize(): js.Dynamic = js.native
}

@js.native
@JSGlobal("BABYLON.Animation")
object Animation extends js.Object {
  def CreateAndStartAnimation(name: String, node: Node, targetProperty: String, framePerSecond: Double, totalFrame: Double, from: js.Any, to: js.Any, loopMode: Double = ???, easingFunction: EasingFunction = ???, onAnimationEnd: js.Function0[Unit] = ???): Animatable = js.native
  def CreateMergeAndStartAnimation(name: String, node: Node, targetProperty: String, framePerSecond: Double, totalFrame: Double, from: js.Any, to: js.Any, loopMode: Double = ???, easingFunction: EasingFunction = ???, onAnimationEnd: js.Function0[Unit] = ???): Animatable = js.native
  def ANIMATIONTYPE_FLOAT: Double = js.native
  def ANIMATIONTYPE_VECTOR3: Double = js.native
  def ANIMATIONTYPE_VECTOR2: Double = js.native
  def ANIMATIONTYPE_SIZE: Double = js.native
  def ANIMATIONTYPE_QUATERNION: Double = js.native
  def ANIMATIONTYPE_MATRIX: Double = js.native
  def ANIMATIONTYPE_COLOR3: Double = js.native
  def ANIMATIONLOOPMODE_RELATIVE: Double = js.native
  def ANIMATIONLOOPMODE_CYCLE: Double = js.native
  def ANIMATIONLOOPMODE_CONSTANT: Double = js.native
  def Parse(parsedAnimation: js.Any): Animation = js.native
  def AppendSerializedAnimations(source: IAnimatable, destination: js.Any): js.Dynamic = js.native
}

@js.native
trait IEasingFunction extends js.Object {
  def ease(gradient: Double): Double = js.native
}

@js.native
@JSGlobal("BABYLON.EasingFunction")
class EasingFunction extends IEasingFunction {
  def setEasingMode(easingMode: Double): Unit = js.native
  def getEasingMode(): Double = js.native
  def easeInCore(gradient: Double): Double = js.native
  override def ease(gradient: Double): Double = js.native
}

@js.native
@JSGlobal("BABYLON.EasingFunction")
object EasingFunction extends js.Object {
  def EASINGMODE_EASEIN: Double = js.native
  def EASINGMODE_EASEOUT: Double = js.native
  def EASINGMODE_EASEINOUT: Double = js.native
}

@js.native
@JSGlobal("BABYLON.CircleEase")
class CircleEase extends EasingFunction with IEasingFunction {
  override def easeInCore(gradient: Double): Double = js.native
}

@js.native
@JSGlobal("BABYLON.BackEase")
class BackEase extends EasingFunction with IEasingFunction {
  def this(amplitude: Double = ???) = this()
  var amplitude: Double = js.native
  override def easeInCore(gradient: Double): Double = js.native
}

@js.native
@JSGlobal("BABYLON.BounceEase")
class BounceEase extends EasingFunction with IEasingFunction {
  def this(bounces: Double = ???, bounciness: Double = ???) = this()
  var bounces: Double = js.native
  var bounciness: Double = js.native
  override def easeInCore(gradient: Double): Double = js.native
}

@js.native
@JSGlobal("BABYLON.CubicEase")
class CubicEase extends EasingFunction with IEasingFunction {
  override def easeInCore(gradient: Double): Double = js.native
}

@js.native
@JSGlobal("BABYLON.ElasticEase")
class ElasticEase extends EasingFunction with IEasingFunction {
  def this(oscillations: Double = ???, springiness: Double = ???) = this()
  var oscillations: Double = js.native
  var springiness: Double = js.native
  override def easeInCore(gradient: Double): Double = js.native
}

@js.native
@JSGlobal("BABYLON.ExponentialEase")
class ExponentialEase extends EasingFunction with IEasingFunction {
  def this(exponent: Double = ???) = this()
  var exponent: Double = js.native
  override def easeInCore(gradient: Double): Double = js.native
}

@js.native
@JSGlobal("BABYLON.PowerEase")
class PowerEase extends EasingFunction with IEasingFunction {
  def this(power: Double = ???) = this()
  var power: Double = js.native
  override def easeInCore(gradient: Double): Double = js.native
}

@js.native
@JSGlobal("BABYLON.QuadraticEase")
class QuadraticEase extends EasingFunction with IEasingFunction {
  override def easeInCore(gradient: Double): Double = js.native
}

@js.native
@JSGlobal("BABYLON.QuarticEase")
class QuarticEase extends EasingFunction with IEasingFunction {
  override def easeInCore(gradient: Double): Double = js.native
}

@js.native
@JSGlobal("BABYLON.QuinticEase")
class QuinticEase extends EasingFunction with IEasingFunction {
  override def easeInCore(gradient: Double): Double = js.native
}

@js.native
@JSGlobal("BABYLON.SineEase")
class SineEase extends EasingFunction with IEasingFunction {
  override def easeInCore(gradient: Double): Double = js.native
}

@js.native
@JSGlobal("BABYLON.BezierCurveEase")
class BezierCurveEase extends EasingFunction with IEasingFunction {
  def this(x1: Double = ???, y1: Double = ???, x2: Double = ???, y2: Double = ???) = this()
  var x1: Double = js.native
  var y1: Double = js.native
  var x2: Double = js.native
  var y2: Double = js.native
  override def easeInCore(gradient: Double): Double = js.native
}

@js.native
@JSGlobal("BABYLON.Analyser")
class Analyser extends js.Object {
  def this(scene: Scene) = this()
  var SMOOTHING: Double = js.native
  var FFT_SIZE: Double = js.native
  var BARGRAPHAMPLITUDE: Double = js.native
  var DEBUGCANVASPOS: js.Any = js.native
  var DEBUGCANVASSIZE: js.Any = js.native
  def getFrequencyBinCount(): Double = js.native
  def getByteFrequencyData(): Uint8Array = js.native
  def getByteTimeDomainData(): Uint8Array = js.native
  def getFloatFrequencyData(): Uint8Array = js.native
  def drawDebugCanvas(): Unit = js.native
  def stopDebugCanvas(): Unit = js.native
  def connectAudioNodes(inputAudioNode: AudioNode, outputAudioNode: AudioNode): Unit = js.native
  def dispose(): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.AudioEngine")
class AudioEngine extends js.Object {
  var canUseWebAudio: Boolean = js.native
  var masterGain: GainNode = js.native
  var WarnedWebAudioUnsupported: Boolean = js.native
  var unlocked: Boolean = js.native
  var onAudioUnlocked: js.Function0[Any] = js.native
  var isMP3supported: Boolean = js.native
  var isOGGsupported: Boolean = js.native
  def audioContext: AudioContext = js.native
  def dispose(): Unit = js.native
  def getGlobalVolume(): Double = js.native
  def setGlobalVolume(newVolume: Double): Unit = js.native
  def connectToAnalyser(analyser: Analyser): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.Sound")
class Sound extends js.Object {
  def this(name: String, urlOrArrayBuffer: js.Any, scene: Scene, readyToPlayCallback: js.Function0[Unit] = ???, options: js.Any = ???) = this()
  var name: String = js.native
  var autoplay: Boolean = js.native
  var loop: Boolean = js.native
  var useCustomAttenuation: Boolean = js.native
  var soundTrackId: Double = js.native
  var spatialSound: Boolean = js.native
  var refDistance: Double = js.native
  var rolloffFactor: Double = js.native
  var maxDistance: Double = js.native
  var distanceModel: String = js.native
  var onended: js.Function0[Any] = js.native
  var isPlaying: Boolean = js.native
  var isPaused: Boolean = js.native
  def dispose(): Unit = js.native
  def isReady(): Boolean = js.native
  def setAudioBuffer(audioBuffer: AudioBuffer): Unit = js.native
  def updateOptions(options: js.Any): Unit = js.native
  def switchPanningModelToHRTF(): Unit = js.native
  def switchPanningModelToEqualPower(): Unit = js.native
  def connectToSoundTrackAudioNode(soundTrackAudioNode: AudioNode): Unit = js.native
  def setDirectionalCone(coneInnerAngle: Double, coneOuterAngle: Double, coneOuterGain: Double): Unit = js.native
  def setPosition(newPosition: Vector3): Unit = js.native
  def setLocalDirectionToMesh(newLocalDirection: Vector3): Unit = js.native
  def updateDistanceFromListener(): Unit = js.native
  def setAttenuationFunction(callback: js.Function5[Double, Double, Double, Double, Double, Double]): Unit = js.native
  def play(time: Double = ???, offset: Double = ???): Unit = js.native
  def stop(time: Double = ???): Unit = js.native
  def pause(): Unit = js.native
  def setVolume(newVolume: Double, time: Double = ???): Unit = js.native
  def setPlaybackRate(newPlaybackRate: Double): Unit = js.native
  def getVolume(): Double = js.native
  def attachToMesh(meshToConnectTo: AbstractMesh): Unit = js.native
  def detachFromMesh(): Unit = js.native
  override def clone(): Sound = js.native
  def getAudioBuffer(): AudioBuffer = js.native
  def serialize(): js.Dynamic = js.native
}

@js.native
@JSGlobal("BABYLON.Sound")
object Sound extends js.Object {
  def Parse(parsedSound: js.Any, scene: Scene, rootUrl: String, sourceSound: Sound = ???): Sound = js.native
}

@js.native
@JSGlobal("BABYLON.SoundTrack")
class SoundTrack extends js.Object {
  def this(scene: Scene, options: js.Any = ???) = this()
  var id: Double = js.native
  var soundCollection: js.Array[Sound] = js.native
  def dispose(): Unit = js.native
  def AddSound(sound: Sound): Unit = js.native
  def RemoveSound(sound: Sound): Unit = js.native
  def setVolume(newVolume: Double): Unit = js.native
  def switchPanningModelToHRTF(): Unit = js.native
  def switchPanningModelToEqualPower(): Unit = js.native
  def connectToAnalyser(analyser: Analyser): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.Bone")
class Bone extends Node {
  def this(name: String, skeleton: Skeleton, parentBone: Bone = ???, matrix: Matrix = ???, restPose: Matrix = ???) = this()

  var children: js.Array[Bone] = js.native

  var length: Double = js.native
  def getSkeleton(): Skeleton = js.native
  def getParent(): Bone = js.native
  def setParent(parent: Bone, updateDifferenceMatrix: Boolean = ???): Unit = js.native
  def getLocalMatrix(): Matrix = js.native
  def getBaseMatrix(): Matrix = js.native
  def getRestPose(): Matrix = js.native
  def returnToRest(): Unit = js.native
  override def getWorldMatrix(): Matrix = js.native
  def getInvertedAbsoluteTransform(): Matrix = js.native
  def getAbsoluteTransform(): Matrix = js.native
  var position: Vector3 = js.native
  var rotation: Vector3 = js.native
  var rotationQuaternion: Quaternion = js.native
  var scaling: Vector3 = js.native
  def updateMatrix(matrix: Matrix, updateDifferenceMatrix: Boolean = ???): Unit = js.native
  def markAsDirty(): Unit = js.native
  def copyAnimationRange(source: Bone, rangeName: String, frameOffset: Double, rescaleAsRequired: Boolean = ???, skelDimensionsRatio: Vector3 = ???): Boolean = js.native
  def translate(vec: Vector3, space: Space = ???, mesh: AbstractMesh = ???): Unit = js.native
  def setPosition(position: Vector3, space: Space = ???, mesh: AbstractMesh = ???): Unit = js.native
  def setAbsolutePosition(position: Vector3, mesh: AbstractMesh = ???): Unit = js.native
  def setScale(x: Double, y: Double, z: Double, scaleChildren: Boolean = ???): Unit = js.native
  def scale(x: Double, y: Double, z: Double, scaleChildren: Boolean = ???): Unit = js.native
  def setYawPitchRoll(yaw: Double, pitch: Double, roll: Double, space: Space = ???, mesh: AbstractMesh = ???): Unit = js.native
  def rotate(axis: Vector3, amount: Double, space: Space = ???, mesh: AbstractMesh = ???): Unit = js.native
  def setAxisAngle(axis: Vector3, angle: Double, space: Space = ???, mesh: AbstractMesh = ???): Unit = js.native
  def setRotation(rotation: Vector3, space: Space = ???, mesh: AbstractMesh = ???): Unit = js.native
  def setRotationQuaternion(quat: Quaternion, space: Space = ???, mesh: AbstractMesh = ???): Unit = js.native
  def setRotationMatrix(rotMat: Matrix, space: Space = ???, mesh: AbstractMesh = ???): Unit = js.native
  def getScale(): Vector3 = js.native
  def getScaleToRef(result: Vector3): Unit = js.native
  def getPosition(space: Space = ???, mesh: AbstractMesh = ???): Vector3 = js.native
  def getPositionToRef(space: Space, mesh: AbstractMesh, result: Vector3): Unit = js.native
  def getAbsolutePosition(mesh: AbstractMesh = ???): Vector3 = js.native
  def getAbsolutePositionToRef(mesh: AbstractMesh, result: Vector3): Unit = js.native
  def computeAbsoluteTransforms(): Unit = js.native
  def getDirection(localAxis: Vector3, mesh: AbstractMesh = ???): Vector3 = js.native
  def getDirectionToRef(localAxis: Vector3, mesh: AbstractMesh, result: Vector3): Unit = js.native
  def getRotation(space: Space = ???, mesh: AbstractMesh = ???): Vector3 = js.native
  def getRotationToRef(space: Space, mesh: AbstractMesh, result: Vector3): Unit = js.native
  def getRotationQuaternion(space: Space = ???, mesh: AbstractMesh = ???): Quaternion = js.native
  def getRotationQuaternionToRef(space: Space, mesh: AbstractMesh, result: Quaternion): Unit = js.native
  def getRotationMatrix(space: Space, mesh: AbstractMesh): Matrix = js.native
  def getRotationMatrixToRef(space: Space, mesh: AbstractMesh, result: Matrix): Unit = js.native
  def getAbsolutePositionFromLocal(position: Vector3, mesh: AbstractMesh = ???): Vector3 = js.native
  def getAbsolutePositionFromLocalToRef(position: Vector3, mesh: AbstractMesh, result: Vector3): Unit = js.native
  def getLocalPositionFromAbsolute(position: Vector3, mesh: AbstractMesh = ???): Vector3 = js.native
  def getLocalPositionFromAbsoluteToRef(position: Vector3, mesh: AbstractMesh, result: Vector3): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.BoneIKController")
class BoneIKController extends js.Object {
  def this(mesh: AbstractMesh, bone: Bone, options: js.Any = ???) = this()
  var targetMesh: AbstractMesh = js.native
  var poleTargetMesh: AbstractMesh = js.native
  var poleTargetBone: Bone = js.native
  var targetPosition: Vector3 = js.native
  var poleTargetPosition: Vector3 = js.native
  var poleTargetLocalOffset: Vector3 = js.native
  var poleAngle: Double = js.native
  var mesh: AbstractMesh = js.native
  var slerpAmount: Double = js.native
  var maxAngle: Double = js.native
  def update(): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.BoneLookController")
class BoneLookController extends js.Object {
  def this(mesh: AbstractMesh, bone: Bone, target: Vector3, options: js.Any = ???) = this()
  var target: Vector3 = js.native
  var mesh: AbstractMesh = js.native
  var bone: Bone = js.native
  var upAxis: Vector3 = js.native
  var upAxisSpace: Space = js.native
  var adjustYaw: Double = js.native
  var adjustPitch: Double = js.native
  var adjustRoll: Double = js.native
  var slerpAmount: Double = js.native
  var minYaw: Double = js.native
  var maxYaw: Double = js.native
  var minPitch: Double = js.native
  var maxPitch: Double = js.native
  def update(): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.Skeleton")
class Skeleton extends js.Object {
  def this(name: String, id: String, scene: Scene) = this()
  var name: String = js.native
  var id: String = js.native
  var bones: js.Array[Bone] = js.native
  var dimensionsAtRest: Vector3 = js.native
  var needInitialSkinMatrix: Boolean = js.native
  var onBeforeComputeObservable: Observable[Skeleton] = js.native
  def getTransformMatrices(mesh: AbstractMesh): Float32Array = js.native
  def getScene(): Scene = js.native
  def toString(fullDetails: Boolean = ???): String = js.native
  def getBoneIndexByName(name: String): Double = js.native
  def createAnimationRange(name: String, from: Double, to: Double): Unit = js.native
  def deleteAnimationRange(name: String, deleteFrames: Boolean = ???): Unit = js.native
  def getAnimationRange(name: String): AnimationRange = js.native
  def getAnimationRanges(): js.Array[AnimationRange] = js.native
  def copyAnimationRange(source: Skeleton, name: String, rescaleAsRequired: Boolean = ???): Boolean = js.native
  def returnToRest(): Unit = js.native
  def beginAnimation(name: String, loop: Boolean = ???, speedRatio: Double = ???, onAnimationEnd: js.Function0[Unit] = ???): Animatable = js.native
  def prepare(): Unit = js.native
  def getAnimatables(): js.Array[IAnimatable] = js.native
  def clone(name: String, id: String): Skeleton = js.native
  def enableBlending(blendingSpeed: Double = ???): Unit = js.native
  def dispose(): Unit = js.native
  def serialize(): js.Dynamic = js.native
  def computeAbsoluteTransforms(forceUpdate: Boolean = ???): Unit = js.native
  def getPoseMatrix(): Matrix = js.native
}

@js.native
@JSGlobal("BABYLON.Skeleton")
object Skeleton extends js.Object {
  def Parse(parsedSkeleton: js.Any, scene: Scene): Skeleton = js.native
}

@js.native
@JSGlobal("BABYLON.ArcRotateCamera")
class ArcRotateCamera extends TargetCamera {
  def this(name: String, alpha: Double, beta: Double, radius: Double, target: Vector3, scene: Scene) = this()
  var alpha: Double = js.native
  var beta: Double = js.native
  var radius: Double = js.native
  protected var _target: Vector3 = js.native
  protected var _targetHost: AbstractMesh = js.native
  var target: Vector3 = js.native
  var inertialAlphaOffset: Double = js.native
  var inertialBetaOffset: Double = js.native
  var inertialRadiusOffset: Double = js.native
  var lowerAlphaLimit: js.Any = js.native
  var upperAlphaLimit: js.Any = js.native
  var lowerBetaLimit: Double = js.native
  var upperBetaLimit: Double = js.native
  var lowerRadiusLimit: js.Any = js.native
  var upperRadiusLimit: js.Any = js.native
  var inertialPanningX: Double = js.native
  var inertialPanningY: Double = js.native
  var panningInertia: Double = js.native
  var angularSensibilityX: Double = js.native
  var angularSensibilityY: Double = js.native
  var pinchPrecision: Double = js.native
  var panningSensibility: Double = js.native
  var keysUp: js.Array[Double] = js.native
  var keysDown: js.Array[Double] = js.native
  var keysLeft: js.Array[Double] = js.native
  var keysRight: js.Array[Double] = js.native
  var wheelPrecision: Double = js.native
  var zoomOnFactor: Double = js.native
  var targetScreenOffset: Vector2 = js.native
  var allowUpsideDown: Boolean = js.native

  var panningAxis: Vector3 = js.native
  protected var _localDirection: Vector3 = js.native
  protected var _transformedDirection: Vector3 = js.native
  var onCollide: js.Function1[AbstractMesh, Unit] = js.native
  var checkCollisions: Boolean = js.native
  var collisionRadius: Vector3 = js.native
  protected var _collider: Collider = js.native
  protected var _previousPosition: Vector3 = js.native
  protected var _collisionVelocity: Vector3 = js.native
  protected var _newPosition: Vector3 = js.native
  protected var _previousAlpha: Double = js.native
  protected var _previousBeta: Double = js.native
  protected var _previousRadius: Double = js.native
  protected var _collisionTriggered: Boolean = js.native
  protected var _targetBoundingCenter: Vector3 = js.native
  override def detachControl(element: HTMLElement): Unit = js.native
  def rebuildAnglesAndRadius(): Unit = js.native
  def setPosition(position: Vector3): Unit = js.native
  def setTarget(target: AbstractMesh | Vector3, toBoundingCenter: Boolean = ???, allowSamePosition: Boolean = ???): Unit = js.native
  protected var _onCollisionPositionChange: js.Function3[Double, Vector3, AbstractMesh, Unit] = js.native
  def zoomOn(meshes: js.Array[AbstractMesh] = ???, doNotUpdateMaxZ: Boolean = ???): Unit = js.native
  def focusOn(meshesOrMinMaxVectorAndDistance: js.Any, doNotUpdateMaxZ: Boolean = ???): Unit = js.native
  override def createRigCamera(name: String, cameraIndex: Double): Camera = js.native
  override def dispose(): Unit = js.native
  override def getClassName(): String = js.native
}

@js.native
@JSGlobal("BABYLON.ArcRotateCameraInputsManager")
class ArcRotateCameraInputsManager extends CameraInputsManager[ArcRotateCamera] {
  def this(camera: ArcRotateCamera) = this()
  def addMouseWheel(): ArcRotateCameraInputsManager = js.native
  def addPointers(): ArcRotateCameraInputsManager = js.native
  def addKeyboard(): ArcRotateCameraInputsManager = js.native
  def addGamepad(): ArcRotateCameraInputsManager = js.native
  def addVRDeviceOrientation(): ArcRotateCameraInputsManager = js.native
}

@js.native
@JSGlobal("BABYLON.Camera")
class Camera extends Node {
  def this(name: String, position: Vector3, scene: Scene) = this()
  var inputs: CameraInputsManager[Camera] = js.native
  var position: Vector3 = js.native
  var upVector: Vector3 = js.native
  var orthoLeft: js.Any = js.native
  var orthoRight: js.Any = js.native
  var orthoBottom: js.Any = js.native
  var orthoTop: js.Any = js.native
  var fov: Double = js.native
  var minZ: Double = js.native
  var maxZ: Double = js.native
  var inertia: Double = js.native
  var mode: Double = js.native
  var isIntermediate: Boolean = js.native
  var viewport: Viewport = js.native
  var layerMask: Double = js.native
  var fovMode: Double = js.native
  var cameraRigMode: Double = js.native
  var interaxialDistance: Double = js.native
  var isStereoscopicSideBySide: Boolean = js.native
  protected var _webvrViewMatrix: Matrix = js.native
  var customRenderTargets: js.Array[RenderTargetTexture] = js.native
  override def getClassName(): String = js.native
  def toString(fullDetails: Boolean = ???): String = js.native
  def globalPosition: Vector3 = js.native
  def getActiveMeshes(): SmartArray[Mesh] = js.native
  def isActiveMesh(mesh: Mesh): Boolean = js.native
  def attachControl(element: HTMLElement, noPreventDefault: Boolean = ???): Unit = js.native
  def detachControl(element: HTMLElement): Unit = js.native
  def update(): Unit = js.native
  def rigCameras: js.Array[Camera] = js.native
  def rigPostProcess: PostProcess = js.native
  def attachPostProcess(postProcess: PostProcess, insertAt: Double = ???): Double = js.native
  def detachPostProcess(postProcess: PostProcess, atIndices: js.Any = ???): js.Array[Double] = js.native
  override def getWorldMatrix(): Matrix = js.native
  def getViewMatrix(force: Boolean = ???): Matrix = js.native
  def freezeProjectionMatrix(projection: Matrix = ???): Unit = js.native
  def unfreezeProjectionMatrix(): Unit = js.native
  def getProjectionMatrix(force: Boolean = ???): Matrix = js.native
  def getTranformationMatrix(): Matrix = js.native
  def isInFrustum(target: ICullable): Boolean = js.native
  def isCompletelyInFrustum(target: ICullable): Boolean = js.native
  def getForwardRay(length: Double = ???, transform: Matrix = ???, origin: Vector3 = ???): Ray = js.native
  override def dispose(): Unit = js.native
  def leftCamera: FreeCamera = js.native
  def rightCamera: FreeCamera = js.native
  def getLeftTarget(): Vector3 = js.native
  def getRightTarget(): Vector3 = js.native
  def setCameraRigMode(mode: Double, rigParams: js.Any): Unit = js.native
  def setCameraRigParameter(name: String, value: js.Any): Unit = js.native
  def createRigCamera(name: String, cameraIndex: Double): Camera = js.native
  def serialize(): js.Dynamic = js.native
  def clone(name: String): Camera = js.native
  def getDirection(localAxis: Vector3): Vector3 = js.native
  def getDirectionToRef(localAxis: Vector3, result: Vector3): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.Camera")
object Camera extends js.Object {
  def PERSPECTIVE_CAMERA: Double = js.native
  def ORTHOGRAPHIC_CAMERA: Double = js.native
  def FOVMODE_VERTICAL_FIXED: Double = js.native
  def FOVMODE_HORIZONTAL_FIXED: Double = js.native
  def RIG_MODE_NONE: Double = js.native
  def RIG_MODE_STEREOSCOPIC_ANAGLYPH: Double = js.native
  def RIG_MODE_STEREOSCOPIC_SIDEBYSIDE_PARALLEL: Double = js.native
  def RIG_MODE_STEREOSCOPIC_SIDEBYSIDE_CROSSEYED: Double = js.native
  def RIG_MODE_STEREOSCOPIC_OVERUNDER: Double = js.native
  def RIG_MODE_VR: Double = js.native
  def RIG_MODE_WEBVR: Double = js.native
  var ForceAttachControlToAlwaysPreventDefault: Boolean = js.native
  def GetConstructorFromName(`type`: String, name: String, scene: Scene, interaxial_distance: Double = ???, isStereoscopicSideBySide: Boolean = ???): js.Function0[Camera] = js.native
  def Parse(parsedCamera: js.Any, scene: Scene): Camera = js.native
}

@js.native
@JSGlobal("BABYLON.CameraInputTypes")
object CameraInputTypes extends js.Object {
}

@js.native
trait ICameraInput[TCamera <: Camera] extends js.Object {
  var camera: TCamera = js.native
  def getTypeName(): String = js.native
  def getSimpleName(): String = js.native
  var attachControl: js.Function2[HTMLElement, Boolean, Unit] = js.native
  var detachControl: js.Function1[HTMLElement, Unit] = js.native
  var checkInputs: js.Function0[Unit] = js.native
}

@js.native
trait CameraInputsMap[TCamera <: Camera] extends js.Object {
  @JSBracketAccess
  def apply(name: String): ICameraInput[TCamera] = js.native
  @JSBracketAccess
  def update(name: String, v: ICameraInput[TCamera]): Unit = js.native
  @JSBracketAccess
  def apply(idx: Double): ICameraInput[TCamera] = js.native
  @JSBracketAccess
  def update(idx: Double, v: ICameraInput[TCamera]): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.CameraInputsManager")
class CameraInputsManager[TCamera <: Camera] extends js.Object {
  def this(camera: TCamera) = this()
  var attached: CameraInputsMap[TCamera] = js.native
  var attachedElement: HTMLElement = js.native
  var noPreventDefault: Boolean = js.native
  var camera: TCamera = js.native
  var checkInputs: js.Function0[Unit] = js.native
  def add(input: ICameraInput[TCamera]): Unit = js.native
  def remove(inputToRemove: ICameraInput[TCamera]): Unit = js.native
  def removeByType(inputType: String): Unit = js.native
  def attachInput(input: ICameraInput[TCamera]): Unit = js.native
  def attachElement(element: HTMLElement, noPreventDefault: Boolean = ???): Unit = js.native
  def detachElement(element: HTMLElement): Unit = js.native
  def rebuildInputCheck(): Unit = js.native
  def clear(): Unit = js.native
  def serialize(serializedCamera: js.Any): Unit = js.native
  def parse(parsedCamera: js.Any): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.DeviceOrientationCamera")
class DeviceOrientationCamera extends FreeCamera {
  def this(name: String, position: Vector3, scene: Scene) = this()
  override def getClassName(): String = js.native
  def resetToCurrentRotation(axis: Axis = ???): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.FollowCamera")
class FollowCamera extends TargetCamera {
  def this(name: String, position: Vector3, scene: Scene, lockedTarget: AbstractMesh = ???) = this()
  var radius: Double = js.native
  var rotationOffset: Double = js.native
  var heightOffset: Double = js.native
  var cameraAcceleration: Double = js.native
  var maxCameraSpeed: Double = js.native

  override def getClassName(): String = js.native
}

@js.native
@JSGlobal("BABYLON.ArcFollowCamera")
class ArcFollowCamera extends TargetCamera {
  def this(name: String, alpha: Double, beta: Double, radius: Double, target: AbstractMesh, scene: Scene) = this()
  var alpha: Double = js.native
  var beta: Double = js.native
  var radius: Double = js.native
  var target: AbstractMesh = js.native
  override def getClassName(): String = js.native
}

@js.native
@JSGlobal("BABYLON.FreeCamera")
class FreeCamera extends TargetCamera {
  def this(name: String, position: Vector3, scene: Scene) = this()
  var ellipsoid: Vector3 = js.native
  var checkCollisions: Boolean = js.native
  var applyGravity: Boolean = js.native

  var angularSensibility: Double = js.native
  var keysUp: js.Array[Double] = js.native
  var keysDown: js.Array[Double] = js.native
  var keysLeft: js.Array[Double] = js.native
  var keysRight: js.Array[Double] = js.native
  var onCollide: js.Function1[AbstractMesh, Unit] = js.native
  override def attachControl(element: HTMLElement, noPreventDefault: Boolean = ???): Unit = js.native
  override def detachControl(element: HTMLElement): Unit = js.native
  var collisionMask: Double = js.native
  override def dispose(): Unit = js.native
  override def getClassName(): String = js.native
}

@js.native
@JSGlobal("BABYLON.FreeCameraInputsManager")
class FreeCameraInputsManager extends CameraInputsManager[FreeCamera] {
  def this(camera: FreeCamera) = this()
  def addKeyboard(): FreeCameraInputsManager = js.native
  def addMouse(touchEnabled: Boolean = ???): FreeCameraInputsManager = js.native
  def addGamepad(): FreeCameraInputsManager = js.native
  def addDeviceOrientation(): FreeCameraInputsManager = js.native
  def addTouch(): FreeCameraInputsManager = js.native
  def addVirtualJoystick(): FreeCameraInputsManager = js.native
}

@js.native
@JSGlobal("BABYLON.GamepadCamera")
class GamepadCamera extends UniversalCamera {
  def this(name: String, position: Vector3, scene: Scene) = this()


  override def getClassName(): String = js.native
}

@js.native
@JSGlobal("BABYLON.AnaglyphFreeCamera")
class AnaglyphFreeCamera extends FreeCamera {
  def this(name: String, position: Vector3, interaxialDistance: Double, scene: Scene) = this()
  override def getClassName(): String = js.native
}

@js.native
@JSGlobal("BABYLON.AnaglyphArcRotateCamera")
class AnaglyphArcRotateCamera extends ArcRotateCamera {
  def this(name: String, alpha: Double, beta: Double, radius: Double, target: js.Any, interaxialDistance: Double, scene: Scene) = this()
  override def getClassName(): String = js.native
}

@js.native
@JSGlobal("BABYLON.AnaglyphGamepadCamera")
class AnaglyphGamepadCamera extends GamepadCamera {
  def this(name: String, position: Vector3, interaxialDistance: Double, scene: Scene) = this()
  override def getClassName(): String = js.native
}

@js.native
@JSGlobal("BABYLON.AnaglyphUniversalCamera")
class AnaglyphUniversalCamera extends UniversalCamera {
  def this(name: String, position: Vector3, interaxialDistance: Double, scene: Scene) = this()
  override def getClassName(): String = js.native
}

@js.native
@JSGlobal("BABYLON.StereoscopicFreeCamera")
class StereoscopicFreeCamera extends FreeCamera {
  def this(name: String, position: Vector3, interaxialDistance: Double, isStereoscopicSideBySide: Boolean, scene: Scene) = this()
  override def getClassName(): String = js.native
}

@js.native
@JSGlobal("BABYLON.StereoscopicArcRotateCamera")
class StereoscopicArcRotateCamera extends ArcRotateCamera {
  def this(name: String, alpha: Double, beta: Double, radius: Double, target: js.Any, interaxialDistance: Double, isStereoscopicSideBySide: Boolean, scene: Scene) = this()
  override def getClassName(): String = js.native
}

@js.native
@JSGlobal("BABYLON.StereoscopicGamepadCamera")
class StereoscopicGamepadCamera extends GamepadCamera {
  def this(name: String, position: Vector3, interaxialDistance: Double, isStereoscopicSideBySide: Boolean, scene: Scene) = this()
  override def getClassName(): String = js.native
}

@js.native
@JSGlobal("BABYLON.StereoscopicUniversalCamera")
class StereoscopicUniversalCamera extends UniversalCamera {
  def this(name: String, position: Vector3, interaxialDistance: Double, isStereoscopicSideBySide: Boolean, scene: Scene) = this()
  override def getClassName(): String = js.native
}

@js.native
@JSGlobal("BABYLON.TargetCamera")
class TargetCamera extends Camera {
  def this(name: String, position: Vector3, scene: Scene) = this()
  var cameraDirection: Vector3 = js.native
  var cameraRotation: Vector2 = js.native
  var rotation: Vector3 = js.native
  var rotationQuaternion: Quaternion = js.native
  var speed: Double = js.native
  var noRotationConstraint: Boolean = js.native
  var lockedTarget: js.Any = js.native
  def getFrontPosition(distance: Double): Vector3 = js.native
  def setTarget(target: Vector3): Unit = js.native
  def getTarget(): Vector3 = js.native
  override def createRigCamera(name: String, cameraIndex: Double): Camera = js.native
  override def getClassName(): String = js.native
}

@js.native
@JSGlobal("BABYLON.TouchCamera")
class TouchCamera extends FreeCamera {
  def this(name: String, position: Vector3, scene: Scene) = this()
  var touchAngularSensibility: Double = js.native
  var touchMoveSensibility: Double = js.native
  override def getClassName(): String = js.native
}

@js.native
@JSGlobal("BABYLON.UniversalCamera")
class UniversalCamera extends TouchCamera {
  def this(name: String, position: Vector3, scene: Scene) = this()
  var gamepadAngularSensibility: Double = js.native
  var gamepadMoveSensibility: Double = js.native
  override def getClassName(): String = js.native
}

@js.native
@JSGlobal("BABYLON.VirtualJoysticksCamera")
class VirtualJoysticksCamera extends FreeCamera {
  def this(name: String, position: Vector3, scene: Scene) = this()
  override def getClassName(): String = js.native
}

@js.native
@JSGlobal("BABYLON.Collider")
class Collider extends js.Object {
  var radius: Vector3 = js.native
  var retry: Double = js.native
  var velocity: Vector3 = js.native
  var basePoint: Vector3 = js.native
  var epsilon: Double = js.native
  var collisionFound: Boolean = js.native
  var velocityWorldLength: Double = js.native
  var basePointWorld: Vector3 = js.native
  var velocityWorld: Vector3 = js.native
  var normalizedVelocity: Vector3 = js.native
  var initialVelocity: Vector3 = js.native
  var initialPosition: Vector3 = js.native
  var nearestDistance: Double = js.native
  var intersectionPoint: Vector3 = js.native
  var collidedMesh: AbstractMesh = js.native
  var collisionMask: Double = js.native
}

@js.native
trait ICollisionCoordinator extends js.Object {
  def getNewPosition(position: Vector3, velocity: Vector3, collider: Collider, maximumRetry: Double, excludedMesh: AbstractMesh, onNewPosition: js.Function3[Double, Vector3, AbstractMesh, Unit], collisionIndex: Double): Unit = js.native
  def init(scene: Scene): Unit = js.native
  def destroy(): Unit = js.native
  def onMeshAdded(mesh: AbstractMesh): js.Dynamic = js.native
  def onMeshUpdated(mesh: AbstractMesh): js.Dynamic = js.native
  def onMeshRemoved(mesh: AbstractMesh): js.Dynamic = js.native
  def onGeometryAdded(geometry: Geometry): js.Dynamic = js.native
  def onGeometryUpdated(geometry: Geometry): js.Dynamic = js.native
  def onGeometryDeleted(geometry: Geometry): js.Dynamic = js.native
}

@js.native
trait SerializedMesh extends js.Object {
  var id: String = js.native
  var name: String = js.native
  var uniqueId: Double = js.native
  var geometryId: String = js.native
  var sphereCenter: js.Array[Double] = js.native
  var sphereRadius: Double = js.native
  var boxMinimum: js.Array[Double] = js.native
  var boxMaximum: js.Array[Double] = js.native
  var worldMatrixFromCache: js.Any = js.native
  var subMeshes: js.Array[SerializedSubMesh] = js.native
  var checkCollisions: Boolean = js.native
}

@js.native
trait SerializedSubMesh extends js.Object {
  var position: Double = js.native
  var verticesStart: Double = js.native
  var verticesCount: Double = js.native
  var indexStart: Double = js.native
  var indexCount: Double = js.native
  var hasMaterial: Boolean = js.native
  var sphereCenter: js.Array[Double] = js.native
  var sphereRadius: Double = js.native
  var boxMinimum: js.Array[Double] = js.native
  var boxMaximum: js.Array[Double] = js.native
}

@js.native
trait SerializedGeometry extends js.Object {
  var id: String = js.native
  var positions: Float32Array = js.native
  var indices: Uint32Array = js.native
  var normals: Float32Array = js.native
}

@js.native
trait BabylonMessage extends js.Object {
  var taskType: WorkerTaskType = js.native
  var payload: InitPayload | CollidePayload | UpdatePayload = js.native
}

@js.native
trait SerializedColliderToWorker extends js.Object {
  var position: js.Array[Double] = js.native
  var velocity: js.Array[Double] = js.native
  var radius: js.Array[Double] = js.native
}

@js.native
sealed trait WorkerTaskType extends js.Object {
}

@js.native
@JSGlobal("BABYLON.WorkerTaskType")
object WorkerTaskType extends js.Object {
  var INIT: WorkerTaskType = js.native
  var UPDATE: WorkerTaskType = js.native
  var COLLIDE: WorkerTaskType = js.native
  @JSBracketAccess
  def apply(value: WorkerTaskType): String = js.native
}

@js.native
trait WorkerReply extends js.Object {
  var error: WorkerReplyType = js.native
  var taskType: WorkerTaskType = js.native
  var payload: js.Any = js.native
}

@js.native
trait CollisionReplyPayload extends js.Object {
  var newPosition: js.Array[Double] = js.native
  var collisionId: Double = js.native
  var collidedMeshUniqueId: Double = js.native
}

@js.native
trait InitPayload extends js.Object {
}

@js.native
trait CollidePayload extends js.Object {
  var collisionId: Double = js.native
  var collider: SerializedColliderToWorker = js.native
  var maximumRetry: Double = js.native
  var excludedMeshUniqueId: Double = js.native
}

@js.native
trait UpdatePayload extends js.Object {
  var updatedMeshes: js.Any = js.native
  var updatedGeometries: js.Dictionary[SerializedGeometry] = js.native
  var removedMeshes: js.Array[Double] = js.native
  var removedGeometries: js.Array[String] = js.native
}

@js.native
sealed trait WorkerReplyType extends js.Object {
}

@js.native
@JSGlobal("BABYLON.WorkerReplyType")
object WorkerReplyType extends js.Object {
  var SUCCESS: WorkerReplyType = js.native
  var UNKNOWN_ERROR: WorkerReplyType = js.native
  @JSBracketAccess
  def apply(value: WorkerReplyType): String = js.native
}

@js.native
@JSGlobal("BABYLON.CollisionCoordinatorWorker")
class CollisionCoordinatorWorker extends ICollisionCoordinator {
  override def getNewPosition(position: Vector3, velocity: Vector3, collider: Collider, maximumRetry: Double, excludedMesh: AbstractMesh, onNewPosition: js.Function3[Double, Vector3, AbstractMesh, Unit], collisionIndex: Double): Unit = js.native
  override def init(scene: Scene): Unit = js.native
  override def destroy(): Unit = js.native

  var onMeshUpdated: js.Function1[AbstractMesh, Unit] = js.native


  var onGeometryUpdated: js.Function1[Geometry, Unit] = js.native

}

@js.native
@JSGlobal("BABYLON.CollisionCoordinatorWorker")
object CollisionCoordinatorWorker extends js.Object {
  var SerializeMesh: js.Function1[AbstractMesh, SerializedMesh] = js.native
  var SerializeGeometry: js.Function1[Geometry, SerializedGeometry] = js.native
}

@js.native
@JSGlobal("BABYLON.CollisionCoordinatorLegacy")
class CollisionCoordinatorLegacy extends ICollisionCoordinator {
  override def getNewPosition(position: Vector3, velocity: Vector3, collider: Collider, maximumRetry: Double, excludedMesh: AbstractMesh, onNewPosition: js.Function3[Double, Vector3, AbstractMesh, Unit], collisionIndex: Double): Unit = js.native
  override def init(scene: Scene): Unit = js.native
  override def destroy(): Unit = js.native






}

@js.native
@JSGlobal("BABYLON.CollisionCache")
class CollisionCache extends js.Object {
  def getMeshes(): js.Any = js.native
  def getGeometries(): js.Any = js.native
  def getMesh(id: js.Any): SerializedMesh = js.native
  def addMesh(mesh: SerializedMesh): Unit = js.native
  def removeMesh(uniqueId: Double): Unit = js.native
  def getGeometry(id: String): SerializedGeometry = js.native
  def addGeometry(geometry: SerializedGeometry): Unit = js.native
  def removeGeometry(id: String): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.CollideWorker")
class CollideWorker extends js.Object {
  def this(collider: Collider, _collisionCache: CollisionCache, finalPosition: Vector3) = this()
  var collider: Collider = js.native
  def collideWithWorld(position: Vector3, velocity: Vector3, maximumRetry: Double, excludedMeshUniqueId: Double = ???): Unit = js.native
}

@js.native
trait ICollisionDetector extends js.Object {
  def onInit(payload: InitPayload): Unit = js.native
  def onUpdate(payload: UpdatePayload): Unit = js.native
  def onCollision(payload: CollidePayload): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.CollisionDetectorTransferable")
class CollisionDetectorTransferable extends ICollisionDetector {
  override def onInit(payload: InitPayload): Unit = js.native
  override def onUpdate(payload: UpdatePayload): Unit = js.native
  override def onCollision(payload: CollidePayload): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.IntersectionInfo")
class IntersectionInfo extends js.Object {
  def this(bu: Double, bv: Double, distance: Double) = this()
  var bu: Double = js.native
  var bv: Double = js.native
  var distance: Double = js.native
  var faceId: Double = js.native
  var subMeshId: Double = js.native
}

@js.native
@JSGlobal("BABYLON.PickingInfo")
class PickingInfo extends js.Object {
  var hit: Boolean = js.native
  var distance: Double = js.native
  var pickedPoint: Vector3 = js.native
  var pickedMesh: AbstractMesh = js.native
  var bu: Double = js.native
  var bv: Double = js.native
  var faceId: Double = js.native
  var subMeshId: Double = js.native
  var pickedSprite: Sprite = js.native
  def getNormal(useWorldCoordinates: Boolean = ???, useVerticesNormals: Boolean = ???): Vector3 = js.native
  def getTextureCoordinates(): Vector2 = js.native
}

package Debug {

@js.native
@JSGlobal("BABYLON.Debug.AxesViewer")
class AxesViewer extends js.Object {
  def this(scene: Scene, scaleLines: Double = ???) = this()
  var scene: Scene = js.native
  var scaleLines: Double = js.native
  def update(position: Vector3, xaxis: Vector3, yaxis: Vector3, zaxis: Vector3): Unit = js.native
  def dispose(): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.Debug.BoneAxesViewer")
class BoneAxesViewer extends Debug.AxesViewer {
  def this(scene: Scene, bone: Bone, mesh: Mesh, scaleLines: Double = ???) = this()
  var mesh: Mesh = js.native
  var bone: Bone = js.native
  var pos: Vector3 = js.native
  var xaxis: Vector3 = js.native
  var yaxis: Vector3 = js.native
  var zaxis: Vector3 = js.native
  def update(): Unit = js.native
  override def dispose(): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.Debug.PhysicsViewer")
class PhysicsViewer extends js.Object {
  def this(scene: Scene) = this()
  protected var _impostors: js.Array[PhysicsImpostor] = js.native
  protected var _meshes: js.Array[AbstractMesh] = js.native
  protected var _scene: Scene = js.native
  protected var _numMeshes: Double = js.native
  protected var _physicsEnginePlugin: IPhysicsEnginePlugin = js.native
  def showImpostor(impostor: PhysicsImpostor): Unit = js.native
  def hideImpostor(impostor: PhysicsImpostor): Unit = js.native
  def dispose(): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.Debug.SkeletonViewer")
class SkeletonViewer extends js.Object {
  def this(skeleton: Skeleton, mesh: AbstractMesh, scene: Scene, autoUpdateBonesMatrices: Boolean = ???, renderingGroupId: Double = ???) = this()
  var skeleton: Skeleton = js.native
  var mesh: AbstractMesh = js.native
  var autoUpdateBonesMatrices: Boolean = js.native
  var renderingGroupId: Double = js.native
  var color: Color3 = js.native
  var isEnabled: Boolean = js.native
  def update(): Unit = js.native
  def dispose(): Unit = js.native
}

}

@js.native
@JSGlobal("BABYLON.DebugLayer")
class DebugLayer extends js.Object {
  def this(scene: Scene) = this()
  def isVisible(): Boolean = js.native
  def hide(): Unit = js.native
  def show(config: js.Any = ???): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.DebugLayer")
object DebugLayer extends js.Object {
  var InspectorURL: String = js.native
}

@js.native
@JSGlobal("BABYLON.RayHelper")
class RayHelper extends js.Object {
  def this(ray: Ray) = this()
  var ray: Ray = js.native
  def show(scene: Scene, color: Color3): Unit = js.native
  def hide(): Unit = js.native
  def attachToMesh(mesh: AbstractMesh, meshSpaceDirection: Vector3 = ???, meshSpaceOrigin: Vector3 = ???, length: Double = ???): Unit = js.native
  def detachFromMesh(): Unit = js.native
  def dispose(): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.RayHelper")
object RayHelper extends js.Object {
  def CreateAndShow(ray: Ray, scene: Scene, color: Color3): RayHelper = js.native
}

@js.native
@JSGlobal("BABYLON.BoundingBox")
class BoundingBox extends ICullable {
  def this(minimum: Vector3, maximum: Vector3) = this()
  var minimum: Vector3 = js.native
  var maximum: Vector3 = js.native
  var vectors: js.Array[Vector3] = js.native
  var center: Vector3 = js.native
  var centerWorld: Vector3 = js.native
  var extendSize: Vector3 = js.native
  var extendSizeWorld: Vector3 = js.native
  var directions: js.Array[Vector3] = js.native
  var vectorsWorld: js.Array[Vector3] = js.native
  var minimumWorld: Vector3 = js.native
  var maximumWorld: Vector3 = js.native
  def getWorldMatrix(): Matrix = js.native
  def setWorldMatrix(matrix: Matrix): BoundingBox = js.native
  override def isInFrustum(frustumPlanes: js.Array[Plane]): Boolean = js.native
  override def isCompletelyInFrustum(frustumPlanes: js.Array[Plane]): Boolean = js.native
  def intersectsPoint(point: Vector3): Boolean = js.native
  def intersectsSphere(sphere: BoundingSphere): Boolean = js.native
  def intersectsMinMax(min: Vector3, max: Vector3): Boolean = js.native
}

@js.native
@JSGlobal("BABYLON.BoundingBox")
object BoundingBox extends js.Object {
  def Intersects(box0: BoundingBox, box1: BoundingBox): Boolean = js.native
  def IntersectsSphere(minPoint: Vector3, maxPoint: Vector3, sphereCenter: Vector3, sphereRadius: Double): Boolean = js.native
  def IsCompletelyInFrustum(boundingVectors: js.Array[Vector3], frustumPlanes: js.Array[Plane]): Boolean = js.native
  def IsInFrustum(boundingVectors: js.Array[Vector3], frustumPlanes: js.Array[Plane]): Boolean = js.native
}

@js.native
trait ICullable extends js.Object {
  def isInFrustum(frustumPlanes: js.Array[Plane]): Boolean = js.native
  def isCompletelyInFrustum(frustumPlanes: js.Array[Plane]): Boolean = js.native
}

@js.native
@JSGlobal("BABYLON.BoundingInfo")
class BoundingInfo extends ICullable {
  def this(minimum: Vector3, maximum: Vector3) = this()
  var minimum: Vector3 = js.native
  var maximum: Vector3 = js.native
  var boundingBox: BoundingBox = js.native
  var boundingSphere: BoundingSphere = js.native
  var isLocked: Boolean = js.native
  def update(world: Matrix): Unit = js.native
  override def isInFrustum(frustumPlanes: js.Array[Plane]): Boolean = js.native
  override def isCompletelyInFrustum(frustumPlanes: js.Array[Plane]): Boolean = js.native
  def intersectsPoint(point: Vector3): Boolean = js.native
  def intersects(boundingInfo: BoundingInfo, precise: Boolean): Boolean = js.native
}

@js.native
@JSGlobal("BABYLON.BoundingSphere")
class BoundingSphere extends js.Object {
  def this(minimum: Vector3, maximum: Vector3) = this()
  var minimum: Vector3 = js.native
  var maximum: Vector3 = js.native
  var center: Vector3 = js.native
  var radius: Double = js.native
  var centerWorld: Vector3 = js.native
  var radiusWorld: Double = js.native
  def isInFrustum(frustumPlanes: js.Array[Plane]): Boolean = js.native
  def intersectsPoint(point: Vector3): Boolean = js.native
}

@js.native
@JSGlobal("BABYLON.BoundingSphere")
object BoundingSphere extends js.Object {
  def Intersects(sphere0: BoundingSphere, sphere1: BoundingSphere): Boolean = js.native
}

@js.native
@JSGlobal("BABYLON.Ray")
class Ray extends js.Object {
  def this(origin: Vector3, direction: Vector3, length: Double = ???) = this()
  var origin: Vector3 = js.native
  var direction: Vector3 = js.native
  var length: Double = js.native
  def intersectsBoxMinMax(minimum: Vector3, maximum: Vector3): Boolean = js.native
  def intersectsBox(box: BoundingBox): Boolean = js.native
  def intersectsSphere(sphere: BoundingSphere): Boolean = js.native
  def intersectsTriangle(vertex0: Vector3, vertex1: Vector3, vertex2: Vector3): IntersectionInfo = js.native
  def intersectsPlane(plane: Plane): Double = js.native
  def intersectsMesh(mesh: AbstractMesh, fastCheck: Boolean = ???): PickingInfo = js.native
  def intersectsMeshes(meshes: js.Array[AbstractMesh], fastCheck: Boolean = ???, results: js.Array[PickingInfo] = ???): js.Array[PickingInfo] = js.native
  def intersectionSegment(sega: Vector3, segb: Vector3, threshold: Double): Double = js.native
}

@js.native
@JSGlobal("BABYLON.Ray")
object Ray extends js.Object {
  def CreateNew(x: Double, y: Double, viewportWidth: Double, viewportHeight: Double, world: Matrix, view: Matrix, projection: Matrix): Ray = js.native
  def CreateNewFromTo(origin: Vector3, end: Vector3, world: Matrix = ???): Ray = js.native
  def Transform(ray: Ray, matrix: Matrix): Ray = js.native
  def TransformToRef(ray: Ray, matrix: Matrix, result: Ray): Unit = js.native
}

@js.native
trait IHighlightLayerOptions extends js.Object {
  var mainTextureRatio: Double = js.native
  var mainTextureFixedSize: Double = js.native
  var blurTextureSizeRatio: Double = js.native
  var blurVerticalSize: Double = js.native
  var blurHorizontalSize: Double = js.native
  var alphaBlendingMode: Double = js.native
  var camera: Camera = js.native
}

@js.native
@JSGlobal("BABYLON.HighlightLayer")
class HighlightLayer extends js.Object {
  def this(name: String, scene: Scene, options: IHighlightLayerOptions = ???) = this()
  var name: String = js.native
  var innerGlow: Boolean = js.native
  var outerGlow: Boolean = js.native
  var isEnabled: Boolean = js.native
  var blurHorizontalSize: Double = js.native
  var blurVerticalSize: Double = js.native
  def camera: Camera = js.native
  var onDisposeObservable: Observable[HighlightLayer] = js.native
  var onBeforeRenderMainTextureObservable: Observable[HighlightLayer] = js.native
  var onBeforeBlurObservable: Observable[HighlightLayer] = js.native
  var onAfterBlurObservable: Observable[HighlightLayer] = js.native
  var onBeforeComposeObservable: Observable[HighlightLayer] = js.native
  var onAfterComposeObservable: Observable[HighlightLayer] = js.native
  var onSizeChangedObservable: Observable[HighlightLayer] = js.native
  def render(): Unit = js.native
  def addExcludedMesh(mesh: Mesh): Unit = js.native
  def removeExcludedMesh(mesh: Mesh): Unit = js.native
  def addMesh(mesh: Mesh, color: Color3, glowEmissiveOnly: Boolean = ???): Unit = js.native
  def removeMesh(mesh: Mesh): Unit = js.native
  def shouldRender(): Boolean = js.native
  def dispose(): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.HighlightLayer")
object HighlightLayer extends js.Object {
  var neutralColor: Color4 = js.native
  var glowingMeshStencilReference: Double = js.native
  var normalMeshStencilReference: Double = js.native
}

@js.native
@JSGlobal("BABYLON.Layer")
class Layer extends js.Object {
  def this(name: String, imgUrl: String, scene: Scene, isBackground: Boolean = ???, color: Color4 = ???) = this()
  var name: String = js.native
  var texture: Texture = js.native
  var isBackground: Boolean = js.native
  var color: Color4 = js.native
  var scale: Vector2 = js.native
  var offset: Vector2 = js.native
  var alphaBlendingMode: Double = js.native
  var alphaTest: Boolean = js.native
  var layerMask: Double = js.native
  var onDisposeObservable: Observable[Layer] = js.native
  var onDispose: js.Function0[Unit] = js.native
  var onBeforeRenderObservable: Observable[Layer] = js.native
  var onBeforeRender: js.Function0[Unit] = js.native
  var onAfterRenderObservable: Observable[Layer] = js.native
  var onAfterRender: js.Function0[Unit] = js.native
  def render(): Unit = js.native
  def dispose(): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.LensFlare")
class LensFlare extends js.Object {
  def this(size: Double, position: Double, color: js.Any, imgUrl: String, system: LensFlareSystem) = this()
  var size: Double = js.native
  var position: Double = js.native
  var color: Color3 = js.native
  var texture: Texture = js.native
  var alphaMode: Double = js.native
  var dispose: js.Function0[Unit] = js.native
}

@js.native
@JSGlobal("BABYLON.LensFlareSystem")
class LensFlareSystem extends js.Object {
  def this(name: String, emitter: js.Any, scene: Scene) = this()
  var name: String = js.native
  var lensFlares: js.Array[LensFlare] = js.native
  var borderLimit: Double = js.native
  var viewportBorder: Double = js.native
  var meshesSelectionPredicate: js.Function1[Mesh, Boolean] = js.native
  var layerMask: Double = js.native
  var id: String = js.native
  var isEnabled: Boolean = js.native
  def getScene(): Scene = js.native
  def getEmitter(): js.Dynamic = js.native
  def setEmitter(newEmitter: js.Any): Unit = js.native
  def getEmitterPosition(): Vector3 = js.native
  def computeEffectivePosition(globalViewport: Viewport): Boolean = js.native
  def render(): Boolean = js.native
  def dispose(): Unit = js.native
  def serialize(): js.Dynamic = js.native
}

@js.native
@JSGlobal("BABYLON.LensFlareSystem")
object LensFlareSystem extends js.Object {
  def Parse(parsedLensFlareSystem: js.Any, scene: Scene, rootUrl: String): LensFlareSystem = js.native
}

@js.native
@JSGlobal("BABYLON.DirectionalLight")
class DirectionalLight extends ShadowLight {
  def this(name: String, direction: Vector3, scene: Scene) = this()
  var shadowFrustumSize: Double = js.native
  var shadowOrthoScale: Double = js.native
  var autoUpdateExtends: Boolean = js.native
  override def getClassName(): String = js.native
  override def getTypeID(): Double = js.native

  override def getDepthMinZ(activeCamera: Camera): Double = js.native
  override def getDepthMaxZ(activeCamera: Camera): Double = js.native
}

@js.native
@JSGlobal("BABYLON.HemisphericLight")
class HemisphericLight extends Light {
  def this(name: String, direction: Vector3, scene: Scene) = this()
  var groundColor: Color3 = js.native
  var direction: Vector3 = js.native
  override def getClassName(): String = js.native
  def setDirectionToTarget(target: Vector3): Vector3 = js.native
  override def getShadowGenerator(): ShadowGenerator = js.native

  override def getTypeID(): Double = js.native
}

@js.native
@JSGlobal("BABYLON.Light")
class Light extends Node {
  def this(name: String, scene: Scene) = this()
  var diffuse: Color3 = js.native
  var specular: Color3 = js.native
  var intensity: Double = js.native
  var range: Double = js.native
  var intensityMode: Double = js.native
  var radius: Double = js.native
  var renderPriority: Double = js.native
  var shadowEnabled: Boolean = js.native
  var includedOnlyMeshes: js.Array[AbstractMesh] = js.native
  var excludedMeshes: js.Array[AbstractMesh] = js.native
  var excludeWithLayerMask: Double = js.native
  var includeOnlyWithLayerMask: Double = js.native
  var lightmapMode: Double = js.native
  override def getClassName(): String = js.native
  def toString(fullDetails: Boolean = ???): String = js.native
  override def setEnabled(value: Boolean): Unit = js.native
  def getShadowGenerator(): IShadowGenerator = js.native
  def getAbsolutePosition(): Vector3 = js.native
  def transferToEffect(effect: Effect, lightIndex: String): Unit = js.native
  def canAffectMesh(mesh: AbstractMesh): Boolean = js.native
  override def getWorldMatrix(): Matrix = js.native
  override def dispose(): Unit = js.native
  def getTypeID(): Double = js.native
  def getScaledIntensity(): Double = js.native
  def clone(name: String): Light = js.native
  def serialize(): js.Dynamic = js.native
}

@js.native
@JSGlobal("BABYLON.Light")
object Light extends js.Object {
  def LIGHTMAP_DEFAULT: Double = js.native
  def LIGHTMAP_SPECULAR: Double = js.native
  def LIGHTMAP_SHADOWSONLY: Double = js.native
  def INTENSITYMODE_AUTOMATIC: Double = js.native
  def INTENSITYMODE_LUMINOUSPOWER: Double = js.native
  def INTENSITYMODE_LUMINOUSINTENSITY: Double = js.native
  def INTENSITYMODE_ILLUMINANCE: Double = js.native
  def INTENSITYMODE_LUMINANCE: Double = js.native
  def LIGHTTYPEID_POINTLIGHT: Double = js.native
  def LIGHTTYPEID_DIRECTIONALLIGHT: Double = js.native
  def LIGHTTYPEID_SPOTLIGHT: Double = js.native
  def LIGHTTYPEID_HEMISPHERICLIGHT: Double = js.native
  def compareLightsPriority(a: Light, b: Light): Double = js.native
  def GetConstructorFromName(`type`: Double, name: String, scene: Scene): js.Function0[Light] = js.native
  def Parse(parsedLight: js.Any, scene: Scene): Light = js.native
}

@js.native
@JSGlobal("BABYLON.PointLight")
class PointLight extends ShadowLight {
  def this(name: String, position: Vector3, scene: Scene) = this()
  var shadowAngle: Double = js.native

  override def getClassName(): String = js.native
  override def getTypeID(): Double = js.native
  override def needCube(): Boolean = js.native
  override def getShadowDirection(faceIndex: Double = ???): Vector3 = js.native

}

@js.native
trait IShadowLight extends Light {

  var position: Vector3 = js.native
  var direction: Vector3 = js.native
  var transformedPosition: Vector3 = js.native
  var transformedDirection: Vector3 = js.native

  var shadowMinZ: Double = js.native
  var shadowMaxZ: Double = js.native
  def computeTransformedInformation(): Boolean = js.native
  override def getScene(): Scene = js.native
  var customProjectionMatrixBuilder: js.Function3[Matrix, js.Array[AbstractMesh], Matrix, Unit] = js.native
  def setShadowProjectionMatrix(matrix: Matrix, viewMatrix: Matrix, renderList: js.Array[AbstractMesh]): IShadowLight = js.native
  def getDepthScale(): Double = js.native
  def needCube(): Boolean = js.native
  def needProjectionMatrixCompute(): Boolean = js.native
  def forceProjectionMatrixCompute(): Unit = js.native
  def getShadowDirection(faceIndex: Double = ???): Vector3 = js.native
  def getDepthMinZ(activeCamera: Camera): Double = js.native
  def getDepthMaxZ(activeCamera: Camera): Double = js.native
}

@js.native
@JSGlobal("BABYLON.ShadowLight")
abstract class ShadowLight extends Light with IShadowLight {

  protected var _direction: Vector3 = js.native






  override def computeTransformedInformation(): Boolean = js.native
  override def getDepthScale(): Double = js.native
  override def getShadowDirection(faceIndex: Double = ???): Vector3 = js.native
  override def getAbsolutePosition(): Vector3 = js.native
  def setDirectionToTarget(target: Vector3): Vector3 = js.native
  def getRotation(): Vector3 = js.native
  override def needCube(): Boolean = js.native
  override def needProjectionMatrixCompute(): Boolean = js.native
  override def forceProjectionMatrixCompute(): Unit = js.native
  override def getDepthMinZ(activeCamera: Camera): Double = js.native
  override def getDepthMaxZ(activeCamera: Camera): Double = js.native
  override def setShadowProjectionMatrix(matrix: Matrix, viewMatrix: Matrix, renderList: js.Array[AbstractMesh]): IShadowLight = js.native
}

@js.native
@JSGlobal("BABYLON.SpotLight")
class SpotLight extends ShadowLight {
  def this(name: String, position: Vector3, direction: Vector3, angle: Double, exponent: Double, scene: Scene) = this()
  var angle: Double = js.native
  var shadowAngleScale: Double = js.native
  var exponent: Double = js.native
  override def getClassName(): String = js.native
  override def getTypeID(): Double = js.native

}

@js.native
@JSGlobal("BABYLON.ColorCurves")
class ColorCurves extends js.Object {
  var globalHue: Double = js.native
  var globalDensity: Double = js.native
  var globalSaturation: Double = js.native
  var highlightsHue: Double = js.native
  var highlightsDensity: Double = js.native
  var highlightsSaturation: Double = js.native
  var highlightsExposure: Double = js.native
  var midtonesHue: Double = js.native
  var midtonesDensity: Double = js.native
  var midtonesSaturation: Double = js.native
  var midtonesExposure: Double = js.native
  var shadowsHue: Double = js.native
  var shadowsDensity: Double = js.native
  var shadowsSaturation: Double = js.native
  var shadowsExposure: Double = js.native
  override def clone(): ColorCurves = js.native
  def serialize(): js.Dynamic = js.native
}

@js.native
@JSGlobal("BABYLON.ColorCurves")
object ColorCurves extends js.Object {
  def Bind(colorCurves: ColorCurves, effect: Effect, positiveUniform: String = ???, neutralUniform: String = ???, negativeUniform: String = ???): Unit = js.native
  def PrepareUniforms(uniformsList: js.Array[String]): Unit = js.native
  def Parse(source: js.Any): ColorCurves = js.native
}

@js.native
@JSGlobal("BABYLON.EffectFallbacks")
class EffectFallbacks extends js.Object {
  def addFallback(rank: Double, define: String): Unit = js.native
  def addCPUSkinningFallback(rank: Double, mesh: AbstractMesh): Unit = js.native
  def isMoreFallbacks: Boolean = js.native
  def reduce(currentDefines: String): String = js.native
}

@js.native
@JSGlobal("BABYLON.EffectCreationOptions")
class EffectCreationOptions extends js.Object {
  var attributes: js.Array[String] = js.native
  var uniformsNames: js.Array[String] = js.native
  var uniformBuffersNames: js.Array[String] = js.native
  var samplers: js.Array[String] = js.native
  var defines: js.Any = js.native
  var fallbacks: EffectFallbacks = js.native
  var onCompiled: js.Function1[Effect, Unit] = js.native
  var onError: js.Function2[Effect, String, Unit] = js.native
  var indexParameters: js.Any = js.native
  var maxSimultaneousLights: Double = js.native
}

@js.native
@JSGlobal("BABYLON.Effect")
class Effect extends js.Object {
  def this(baseName: js.Any, attributesNamesOrOptions: js.Array[String] | EffectCreationOptions, uniformsNamesOrEngine: js.Array[String] | Engine, samplers: js.Array[String] = ???, engine: Engine = ???, defines: String = ???, fallbacks: EffectFallbacks = ???, onCompiled: js.Function1[Effect, Unit] = ???, onError: js.Function2[Effect, String, Unit] = ???, indexParameters: js.Any = ???) = this()
  var name: js.Any = js.native
  var defines: String = js.native
  var onCompiled: js.Function1[Effect, Unit] = js.native
  var onError: js.Function2[Effect, String, Unit] = js.native
  var onBind: js.Function1[Effect, Unit] = js.native
  var uniqueId: Double = js.native
  var onCompileObservable: Observable[Effect] = js.native
  var onErrorObservable: Observable[Effect] = js.native
  var onBindObservable: Observable[Effect] = js.native
  def key: String = js.native
  def isReady(): Boolean = js.native
  def getEngine(): Engine = js.native
  def getProgram(): WebGLProgram = js.native
  def getAttributesNames(): js.Array[String] = js.native
  def getAttributeLocation(index: Double): Double = js.native
  def getAttributeLocationByName(name: String): Double = js.native
  def getAttributesCount(): Double = js.native
  def getUniformIndex(uniformName: String): Double = js.native
  def getUniform(uniformName: String): WebGLUniformLocation = js.native
  def getSamplers(): js.Array[String] = js.native
  def getCompilationError(): String = js.native
  def getVertexShaderSource(): String = js.native
  def getFragmentShaderSource(): String = js.native
  def executeWhenCompiled(func: js.Function1[Effect, Unit]): Unit = js.native
  def isSupported: Boolean = js.native
  def setTexture(channel: String, texture: BaseTexture): Unit = js.native
  def setTextureArray(channel: String, textures: js.Array[BaseTexture]): Unit = js.native
  def setTextureFromPostProcess(channel: String, postProcess: PostProcess): Unit = js.native
  def bindUniformBuffer(buffer: WebGLBuffer, name: String): Unit = js.native
  def bindUniformBlock(blockName: String, index: Double): Unit = js.native
  def setIntArray(uniformName: String, array: Int32Array): Effect = js.native
  def setIntArray2(uniformName: String, array: Int32Array): Effect = js.native
  def setIntArray3(uniformName: String, array: Int32Array): Effect = js.native
  def setIntArray4(uniformName: String, array: Int32Array): Effect = js.native
  def setFloatArray(uniformName: String, array: Float32Array): Effect = js.native
  def setFloatArray2(uniformName: String, array: Float32Array): Effect = js.native
  def setFloatArray3(uniformName: String, array: Float32Array): Effect = js.native
  def setFloatArray4(uniformName: String, array: Float32Array): Effect = js.native
  def setArray(uniformName: String, array: js.Array[Double]): Effect = js.native
  def setArray2(uniformName: String, array: js.Array[Double]): Effect = js.native
  def setArray3(uniformName: String, array: js.Array[Double]): Effect = js.native
  def setArray4(uniformName: String, array: js.Array[Double]): Effect = js.native
  def setMatrices(uniformName: String, matrices: Float32Array): Effect = js.native
  def setMatrix(uniformName: String, matrix: Matrix): Effect = js.native
  def setMatrix3x3(uniformName: String, matrix: Float32Array): Effect = js.native
  def setMatrix2x2(uniformName: String, matrix: Float32Array): Effect = js.native
  def setFloat(uniformName: String, value: Double): Effect = js.native
  def setBool(uniformName: String, bool: Boolean): Effect = js.native
  def setVector2(uniformName: String, vector2: Vector2): Effect = js.native
  def setFloat2(uniformName: String, x: Double, y: Double): Effect = js.native
  def setVector3(uniformName: String, vector3: Vector3): Effect = js.native
  def setFloat3(uniformName: String, x: Double, y: Double, z: Double): Effect = js.native
  def setVector4(uniformName: String, vector4: Vector4): Effect = js.native
  def setFloat4(uniformName: String, x: Double, y: Double, z: Double, w: Double): Effect = js.native
  def setColor3(uniformName: String, color3: Color3): Effect = js.native
  def setColor4(uniformName: String, color3: Color3, alpha: Double): Effect = js.native
}

@js.native
@JSGlobal("BABYLON.Effect")
object Effect extends js.Object {
}

@js.native
@JSGlobal("BABYLON.FresnelParameters")
class FresnelParameters extends js.Object {
  var isEnabled: Boolean = js.native
  var leftColor: Color3 = js.native
  var rightColor: Color3 = js.native
  var bias: Double = js.native
  var power: Double = js.native
  override def clone(): FresnelParameters = js.native
  def serialize(): js.Dynamic = js.native
}

@js.native
@JSGlobal("BABYLON.FresnelParameters")
object FresnelParameters extends js.Object {
  def Parse(parsedFresnelParameters: js.Any): FresnelParameters = js.native
}

@js.native
trait IImageProcessingConfigurationDefines extends js.Object {
  var IMAGEPROCESSING: Boolean = js.native
  var VIGNETTE: Boolean = js.native
  var VIGNETTEBLENDMODEMULTIPLY: Boolean = js.native
  var VIGNETTEBLENDMODEOPAQUE: Boolean = js.native
  var TONEMAPPING: Boolean = js.native
  var CONTRAST: Boolean = js.native
  var EXPOSURE: Boolean = js.native
  var COLORCURVES: Boolean = js.native
  var COLORGRADING: Boolean = js.native
  var SAMPLER3DGREENDEPTH: Boolean = js.native
  var SAMPLER3DBGRMAP: Boolean = js.native
  var IMAGEPROCESSINGPOSTPROCESS: Boolean = js.native
}

@js.native
@JSGlobal("BABYLON.ImageProcessingConfiguration")
class ImageProcessingConfiguration extends js.Object {
  var colorCurves: ColorCurves = js.native
  var colorCurvesEnabled: Boolean = js.native
  var colorGradingTexture: BaseTexture = js.native
  var colorGradingEnabled: Boolean = js.native
  var colorGradingWithGreenDepth: Boolean = js.native
  var colorGradingBGR: Boolean = js.native
  var exposure: Double = js.native
  var toneMappingEnabled: Boolean = js.native
  protected var _contrast: Double = js.native
  var contrast: Double = js.native
  var vignetteStretch: Double = js.native
  var vignetteCentreX: Double = js.native
  var vignetteCentreY: Double = js.native
  var vignetteWeight: Double = js.native
  var vignetteColor: Color4 = js.native
  var vignetteCameraFov: Double = js.native
  var vignetteBlendMode: Double = js.native
  var vignetteEnabled: Boolean = js.native
  var applyByPostProcess: Boolean = js.native
  var onUpdateParameters: Observable[ImageProcessingConfiguration] = js.native
  def prepareDefines(defines: IImageProcessingConfigurationDefines): Unit = js.native
  def isReady(): Boolean = js.native
  def bind(effect: Effect, aspectRatio: Double = ???): Unit = js.native
  override def clone(): ImageProcessingConfiguration = js.native
  def serialize(): js.Dynamic = js.native
}

@js.native
@JSGlobal("BABYLON.ImageProcessingConfiguration")
object ImageProcessingConfiguration extends js.Object {
  def PrepareUniforms(uniforms: js.Array[String], defines: IImageProcessingConfigurationDefines): Unit = js.native
  def PrepareSamplers(samplersList: js.Array[String], defines: IImageProcessingConfigurationDefines): Unit = js.native
  def Parse(source: js.Any): ImageProcessingConfiguration = js.native
  def VIGNETTEMODE_MULTIPLY: Double = js.native
  def VIGNETTEMODE_OPAQUE: Double = js.native
}

@js.native
@JSGlobal("BABYLON.MaterialDefines")
class MaterialDefines extends js.Object {
  def isDirty: Boolean = js.native
  def markAsProcessed(): Unit = js.native
  def markAsUnprocessed(): Unit = js.native
  def markAllAsDirty(): Unit = js.native
  def markAsImageProcessingDirty(): Unit = js.native
  def markAsLightDirty(): Unit = js.native
  def markAsAttributesDirty(): Unit = js.native
  def markAsTexturesDirty(): Unit = js.native
  def markAsFresnelDirty(): Unit = js.native
  def markAsMiscDirty(): Unit = js.native
  def rebuild(): Unit = js.native
  def isEqual(other: MaterialDefines): Boolean = js.native
  def cloneTo(other: MaterialDefines): Unit = js.native
  def reset(): Unit = js.native
  override def toString(): String = js.native
}

@js.native
@JSGlobal("BABYLON.Material")
class Material extends js.Object {
  def this(name: String, scene: Scene, doNotAdd: Boolean = ???) = this()
  var id: String = js.native
  var name: String = js.native
  var checkReadyOnEveryCall: Boolean = js.native
  var checkReadyOnlyOnce: Boolean = js.native
  var state: String = js.native
  var alpha: Double = js.native
  protected var _backFaceCulling: Boolean = js.native
  var backFaceCulling: Boolean = js.native
  var sideOrientation: Double = js.native
  var onCompiled: js.Function1[Effect, Unit] = js.native
  var onError: js.Function2[Effect, String, Unit] = js.native
  var getRenderTargetTextures: js.Function0[SmartArray[RenderTargetTexture]] = js.native
  var doNotSerialize: Boolean = js.native
  var storeEffectOnSubMeshes: Boolean = js.native
  var onDisposeObservable: Observable[Material] = js.native
  var onDispose: js.Function0[Unit] = js.native
  var onBindObservable: Observable[AbstractMesh] = js.native
  var onBind: js.Function1[AbstractMesh, Unit] = js.native
  var onUnBindObservable: Observable[Material] = js.native
  var alphaMode: Double = js.native
  var disableDepthWrite: Boolean = js.native
  var fogEnabled: Boolean = js.native
  var pointSize: Double = js.native
  var zOffset: Double = js.native
  var wireframe: Boolean = js.native
  var pointsCloud: Boolean = js.native
  var fillMode: Double = js.native
  protected var _uniformBuffer: UniformBuffer = js.native
  def toString(fullDetails: Boolean = ???): String = js.native
  def getClassName(): String = js.native
  def isFrozen: Boolean = js.native
  def freeze(): Unit = js.native
  def unfreeze(): Unit = js.native
  def isReady(mesh: AbstractMesh = ???, useInstances: Boolean = ???): Boolean = js.native
  def isReadyForSubMesh(mesh: AbstractMesh, subMesh: BaseSubMesh, useInstances: Boolean = ???): Boolean = js.native
  def getEffect(): Effect = js.native
  def getScene(): Scene = js.native
  def needAlphaBlending(): Boolean = js.native
  def needAlphaTesting(): Boolean = js.native
  def getAlphaTestTexture(): BaseTexture = js.native
  def markDirty(): Unit = js.native
  def bind(world: Matrix, mesh: Mesh = ???): Unit = js.native
  def bindForSubMesh(world: Matrix, mesh: Mesh, subMesh: SubMesh): Unit = js.native
  def bindOnlyWorldMatrix(world: Matrix): Unit = js.native
  def bindSceneUniformBuffer(effect: Effect, sceneUbo: UniformBuffer): Unit = js.native
  def bindView(effect: Effect): Unit = js.native
  def bindViewProjection(effect: Effect): Unit = js.native
  def unbind(): Unit = js.native
  def getActiveTextures(): js.Array[BaseTexture] = js.native
  def hasTexture(texture: BaseTexture): Boolean = js.native
  def clone(name: String): Material = js.native
  def getBindedMeshes(): js.Array[AbstractMesh] = js.native
  def forceCompilation(mesh: AbstractMesh, onCompiled: js.Function1[Material, Unit], options: js.Any = ???): Unit = js.native
  def markAsDirty(flag: Double): Unit = js.native
  def dispose(forceDisposeEffect: Boolean = ???, forceDisposeTextures: Boolean = ???): Unit = js.native
  def serialize(): js.Dynamic = js.native
}

@js.native
@JSGlobal("BABYLON.Material")
object Material extends js.Object {
  def TriangleFillMode: Double = js.native
  def WireFrameFillMode: Double = js.native
  def PointFillMode: Double = js.native
  def ClockWiseSideOrientation: Double = js.native
  def CounterClockWiseSideOrientation: Double = js.native
  def TextureDirtyFlag: Double = js.native
  def LightDirtyFlag: Double = js.native
  def FresnelDirtyFlag: Double = js.native
  def AttributesDirtyFlag: Double = js.native
  def MiscDirtyFlag: Double = js.native
  def ParseMultiMaterial(parsedMultiMaterial: js.Any, scene: Scene): MultiMaterial = js.native
  def Parse(parsedMaterial: js.Any, scene: Scene, rootUrl: String): js.Dynamic = js.native
}

@js.native
@JSGlobal("BABYLON.MaterialHelper")
class MaterialHelper extends js.Object {
}

@js.native
@JSGlobal("BABYLON.MaterialHelper")
object MaterialHelper extends js.Object {
  def PrepareDefinesForMergedUV(texture: BaseTexture, defines: MaterialDefines, key: String): Unit = js.native
  def BindTextureMatrix(texture: BaseTexture, uniformBuffer: UniformBuffer, key: String): Unit = js.native
  def PrepareDefinesForMisc(mesh: AbstractMesh, scene: Scene, useLogarithmicDepth: Boolean, pointsCloud: js.Any, fogEnabled: Boolean, defines: MaterialDefines): Unit = js.native
  def PrepareDefinesForFrameBoundValues(scene: Scene, engine: Engine, defines: MaterialDefines, useInstances: Boolean, forceAlphaTest: Boolean = ???): Unit = js.native
  def PrepareDefinesForAttributes(mesh: AbstractMesh, defines: MaterialDefines, useVertexColor: Boolean, useBones: Boolean, useMorphTargets: Boolean = ???): Boolean = js.native
  def PrepareDefinesForLights(scene: Scene, mesh: AbstractMesh, defines: MaterialDefines, specularSupported: Boolean, maxSimultaneousLights: Double = ???, disableLighting: Boolean = ???): Boolean = js.native
  def PrepareUniformsAndSamplersList(uniformsListOrOptions: js.Array[String] | EffectCreationOptions, samplersList: js.Array[String] = ???, defines: MaterialDefines = ???, maxSimultaneousLights: Double = ???): Unit = js.native
  def HandleFallbacksForShadows(defines: MaterialDefines, fallbacks: EffectFallbacks, maxSimultaneousLights: Double = ???): Unit = js.native
  def PrepareAttributesForMorphTargets(attribs: js.Array[String], mesh: AbstractMesh, defines: MaterialDefines): Unit = js.native
  def PrepareAttributesForBones(attribs: js.Array[String], mesh: AbstractMesh, defines: MaterialDefines, fallbacks: EffectFallbacks): Unit = js.native
  def PrepareAttributesForInstances(attribs: js.Array[String], defines: MaterialDefines): Unit = js.native
  def BindLightShadow(light: Light, scene: Scene, mesh: AbstractMesh, lightIndex: String, effect: Effect): Unit = js.native
  def BindLightProperties(light: Light, effect: Effect, lightIndex: Double): Unit = js.native
  def BindLights(scene: Scene, mesh: AbstractMesh, effect: Effect, defines: MaterialDefines, maxSimultaneousLights: Double = ???, usePhysicalLightFalloff: Boolean = ???): Unit = js.native
  def BindFogParameters(scene: Scene, mesh: AbstractMesh, effect: Effect): Unit = js.native
  def BindBonesParameters(mesh: AbstractMesh, effect: Effect): Unit = js.native
  def BindMorphTargetParameters(abstractMesh: AbstractMesh, effect: Effect): Unit = js.native
  def BindLogDepth(defines: MaterialDefines, effect: Effect, scene: Scene): Unit = js.native
  def BindClipPlane(effect: Effect, scene: Scene): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.MultiMaterial")
class MultiMaterial extends Material {
  def this(name: String, scene: Scene) = this()
  var subMaterials: js.Array[Material] = js.native
  def getSubMaterial(index: js.Any): Material = js.native
  override def getActiveTextures(): js.Array[BaseTexture] = js.native
  override def getClassName(): String = js.native
  def clone(name: String, cloneChildren: Boolean = ???): MultiMaterial = js.native
  override def serialize(): js.Dynamic = js.native
}

@js.native
@JSGlobal("BABYLON.PushMaterial")
class PushMaterial extends Material {
  def this(name: String, scene: Scene) = this()
  protected var _activeEffect: Effect = js.native
  override def getEffect(): Effect = js.native
  override def isReady(mesh: AbstractMesh = ???, useInstances: Boolean = ???): Boolean = js.native
  override def bindOnlyWorldMatrix(world: Matrix): Unit = js.native
  override def bind(world: Matrix, mesh: Mesh = ???): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.ShaderMaterial")
class ShaderMaterial extends Material {
  def this(name: String, scene: Scene, shaderPath: js.Any, options: js.Any) = this()
  override def getClassName(): String = js.native
  override def needAlphaBlending(): Boolean = js.native
  override def needAlphaTesting(): Boolean = js.native
  def setTexture(name: String, texture: Texture): ShaderMaterial = js.native
  def setTextureArray(name: String, textures: js.Array[Texture]): ShaderMaterial = js.native
  def setFloat(name: String, value: Double): ShaderMaterial = js.native
  def setFloats(name: String, value: js.Array[Double]): ShaderMaterial = js.native
  def setColor3(name: String, value: Color3): ShaderMaterial = js.native
  def setColor4(name: String, value: Color4): ShaderMaterial = js.native
  def setVector2(name: String, value: Vector2): ShaderMaterial = js.native
  def setVector3(name: String, value: Vector3): ShaderMaterial = js.native
  def setVector4(name: String, value: Vector4): ShaderMaterial = js.native
  def setMatrix(name: String, value: Matrix): ShaderMaterial = js.native
  def setMatrix3x3(name: String, value: Float32Array): ShaderMaterial = js.native
  def setMatrix2x2(name: String, value: Float32Array): ShaderMaterial = js.native
  def setArray3(name: String, value: js.Array[Double]): ShaderMaterial = js.native
  override def isReady(mesh: AbstractMesh = ???, useInstances: Boolean = ???): Boolean = js.native
  override def bindOnlyWorldMatrix(world: Matrix): Unit = js.native
  override def bind(world: Matrix, mesh: Mesh = ???): Unit = js.native
  override def getActiveTextures(): js.Array[BaseTexture] = js.native
  override def hasTexture(texture: BaseTexture): Boolean = js.native
  override def clone(name: String): ShaderMaterial = js.native
  override def dispose(forceDisposeEffect: Boolean = ???, forceDisposeTextures: Boolean = ???): Unit = js.native
  override def serialize(): js.Dynamic = js.native
}

@js.native
@JSGlobal("BABYLON.ShaderMaterial")
object ShaderMaterial extends js.Object {
  def Parse(source: js.Any, scene: Scene, rootUrl: String): ShaderMaterial = js.native
}

@js.native
@JSGlobal("BABYLON.StandardMaterialDefines")
class StandardMaterialDefines extends MaterialDefines with IImageProcessingConfigurationDefines {
  var MAINUV1: Boolean = js.native
  var MAINUV2: Boolean = js.native
  var DIFFUSE: Boolean = js.native
  var DIFFUSEDIRECTUV: Double = js.native
  var AMBIENT: Boolean = js.native
  var AMBIENTDIRECTUV: Double = js.native
  var OPACITY: Boolean = js.native
  var OPACITYDIRECTUV: Double = js.native
  var OPACITYRGB: Boolean = js.native
  var REFLECTION: Boolean = js.native
  var EMISSIVE: Boolean = js.native
  var EMISSIVEDIRECTUV: Double = js.native
  var SPECULAR: Boolean = js.native
  var SPECULARDIRECTUV: Double = js.native
  var BUMP: Boolean = js.native
  var BUMPDIRECTUV: Double = js.native
  var PARALLAX: Boolean = js.native
  var PARALLAXOCCLUSION: Boolean = js.native
  var SPECULAROVERALPHA: Boolean = js.native
  var CLIPPLANE: Boolean = js.native
  var ALPHATEST: Boolean = js.native
  var ALPHAFROMDIFFUSE: Boolean = js.native
  var POINTSIZE: Boolean = js.native
  var FOG: Boolean = js.native
  var SPECULARTERM: Boolean = js.native
  var DIFFUSEFRESNEL: Boolean = js.native
  var OPACITYFRESNEL: Boolean = js.native
  var REFLECTIONFRESNEL: Boolean = js.native
  var REFRACTIONFRESNEL: Boolean = js.native
  var EMISSIVEFRESNEL: Boolean = js.native
  var FRESNEL: Boolean = js.native
  var NORMAL: Boolean = js.native
  var UV1: Boolean = js.native
  var UV2: Boolean = js.native
  var VERTEXCOLOR: Boolean = js.native
  var VERTEXALPHA: Boolean = js.native
  var NUM_BONE_INFLUENCERS: Double = js.native
  var BonesPerMesh: Double = js.native
  var INSTANCES: Boolean = js.native
  var GLOSSINESS: Boolean = js.native
  var ROUGHNESS: Boolean = js.native
  var EMISSIVEASILLUMINATION: Boolean = js.native
  var LINKEMISSIVEWITHDIFFUSE: Boolean = js.native
  var REFLECTIONFRESNELFROMSPECULAR: Boolean = js.native
  var LIGHTMAP: Boolean = js.native
  var LIGHTMAPDIRECTUV: Double = js.native
  var USELIGHTMAPASSHADOWMAP: Boolean = js.native
  var REFLECTIONMAP_3D: Boolean = js.native
  var REFLECTIONMAP_SPHERICAL: Boolean = js.native
  var REFLECTIONMAP_PLANAR: Boolean = js.native
  var REFLECTIONMAP_CUBIC: Boolean = js.native
  var REFLECTIONMAP_PROJECTION: Boolean = js.native
  var REFLECTIONMAP_SKYBOX: Boolean = js.native
  var REFLECTIONMAP_EXPLICIT: Boolean = js.native
  var REFLECTIONMAP_EQUIRECTANGULAR: Boolean = js.native
  var REFLECTIONMAP_EQUIRECTANGULAR_FIXED: Boolean = js.native
  var REFLECTIONMAP_MIRROREDEQUIRECTANGULAR_FIXED: Boolean = js.native
  var INVERTCUBICMAP: Boolean = js.native
  var LOGARITHMICDEPTH: Boolean = js.native
  var REFRACTION: Boolean = js.native
  var REFRACTIONMAP_3D: Boolean = js.native
  var REFLECTIONOVERALPHA: Boolean = js.native
  var INVERTNORMALMAPX: Boolean = js.native
  var INVERTNORMALMAPY: Boolean = js.native
  var TWOSIDEDLIGHTING: Boolean = js.native
  var SHADOWFLOAT: Boolean = js.native
  var MORPHTARGETS: Boolean = js.native
  var MORPHTARGETS_NORMAL: Boolean = js.native
  var MORPHTARGETS_TANGENT: Boolean = js.native
  var NUM_MORPH_INFLUENCERS: Double = js.native
  var USERIGHTHANDEDSYSTEM: Boolean = js.native












  def setReflectionMode(modeToEnable: String): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.StandardMaterial")
class StandardMaterial extends PushMaterial {
  def this(name: String, scene: Scene) = this()
  var diffuseTexture: BaseTexture = js.native
  var ambientTexture: BaseTexture = js.native
  var opacityTexture: BaseTexture = js.native
  var reflectionTexture: BaseTexture = js.native
  var emissiveTexture: BaseTexture = js.native
  var specularTexture: BaseTexture = js.native
  var bumpTexture: BaseTexture = js.native
  var lightmapTexture: BaseTexture = js.native
  var refractionTexture: BaseTexture = js.native
  var ambientColor: Color3 = js.native
  var diffuseColor: Color3 = js.native
  var specularColor: Color3 = js.native
  var emissiveColor: Color3 = js.native
  var specularPower: Double = js.native
  var useAlphaFromDiffuseTexture: Boolean = js.native
  var useEmissiveAsIllumination: Boolean = js.native
  var linkEmissiveWithDiffuse: Boolean = js.native
  var useSpecularOverAlpha: Boolean = js.native
  var useReflectionOverAlpha: Boolean = js.native
  var disableLighting: Boolean = js.native
  var useParallax: Boolean = js.native
  var useParallaxOcclusion: Boolean = js.native
  var parallaxScaleBias: Double = js.native
  var roughness: Double = js.native
  var indexOfRefraction: Double = js.native
  var invertRefractionY: Boolean = js.native
  var useLightmapAsShadowmap: Boolean = js.native
  var diffuseFresnelParameters: FresnelParameters = js.native
  var opacityFresnelParameters: FresnelParameters = js.native
  var reflectionFresnelParameters: FresnelParameters = js.native
  var refractionFresnelParameters: FresnelParameters = js.native
  var emissiveFresnelParameters: FresnelParameters = js.native
  var useReflectionFresnelFromSpecular: Boolean = js.native
  var useGlossinessFromSpecularMapAlpha: Boolean = js.native
  var maxSimultaneousLights: Double = js.native
  var invertNormalMapX: Boolean = js.native
  var invertNormalMapY: Boolean = js.native
  var twoSidedLighting: Boolean = js.native
  protected var _imageProcessingConfiguration: ImageProcessingConfiguration = js.native
  var imageProcessingConfiguration: ImageProcessingConfiguration = js.native
  var cameraColorCurvesEnabled: Boolean = js.native
  var cameraColorGradingEnabled: Boolean = js.native
  var cameraToneMappingEnabled: Boolean = js.native
  var cameraExposure: Double = js.native
  var cameraContrast: Double = js.native
  var cameraColorGradingTexture: BaseTexture = js.native
  var customShaderNameResolve: js.Function5[String, js.Array[String], js.Array[String], js.Array[String], StandardMaterialDefines, String] = js.native
  protected var _renderTargets: SmartArray[RenderTargetTexture] = js.native
  protected var _worldViewProjectionMatrix: Matrix = js.native
  protected var _globalAmbientColor: Color3 = js.native
  protected var _useLogarithmicDepth: Boolean = js.native
  override def getClassName(): String = js.native
  var useLogarithmicDepth: Boolean = js.native
  override def needAlphaBlending(): Boolean = js.native
  override def needAlphaTesting(): Boolean = js.native
  override def getAlphaTestTexture(): BaseTexture = js.native
  def buildUniformLayout(): Unit = js.native
  override def unbind(): Unit = js.native
  override def bindForSubMesh(world: Matrix, mesh: Mesh, subMesh: SubMesh): Unit = js.native
  def getAnimatables(): js.Array[IAnimatable] = js.native
  override def getActiveTextures(): js.Array[BaseTexture] = js.native
  override def hasTexture(texture: BaseTexture): Boolean = js.native
  override def dispose(forceDisposeEffect: Boolean = ???, forceDisposeTextures: Boolean = ???): Unit = js.native
  override def clone(name: String): StandardMaterial = js.native
  override def serialize(): js.Dynamic = js.native
}

@js.native
@JSGlobal("BABYLON.StandardMaterial")
object StandardMaterial extends js.Object {
  def Parse(source: js.Any, scene: Scene, rootUrl: String): StandardMaterial = js.native
  var DiffuseTextureEnabled: Boolean = js.native
  var AmbientTextureEnabled: Boolean = js.native
  var OpacityTextureEnabled: Boolean = js.native
  var ReflectionTextureEnabled: Boolean = js.native
  var EmissiveTextureEnabled: Boolean = js.native
  var SpecularTextureEnabled: Boolean = js.native
  var BumpTextureEnabled: Boolean = js.native
  var LightmapTextureEnabled: Boolean = js.native
  var RefractionTextureEnabled: Boolean = js.native
  var ColorGradingTextureEnabled: Boolean = js.native
  var FresnelEnabled: Boolean = js.native
}

@js.native
@JSGlobal("BABYLON.UniformBuffer")
class UniformBuffer extends js.Object {
  def this(engine: Engine, data: js.Array[Double] = ???, dynamic: Boolean = ???) = this()
  var updateMatrix3x3: js.Function2[String, Float32Array, Unit] = js.native
  var updateMatrix2x2: js.Function2[String, Float32Array, Unit] = js.native
  var updateFloat: js.Function2[String, Double, Unit] = js.native
  var updateFloat2: js.Function4[String, Double, Double, String, Unit] = js.native
  var updateFloat3: js.Function5[String, Double, Double, Double, String, Unit] = js.native
  var updateFloat4: js.Function6[String, Double, Double, Double, Double, String, Unit] = js.native
  var updateMatrix: js.Function2[String, Matrix, Unit] = js.native
  var updateVector3: js.Function2[String, Vector3, Unit] = js.native
  var updateVector4: js.Function2[String, Vector4, Unit] = js.native
  var updateColor3: js.Function3[String, Color3, String, Unit] = js.native
  var updateColor4: js.Function4[String, Color3, Double, String, Unit] = js.native
  def useUbo: Boolean = js.native
  def isSync: Boolean = js.native
  def isDynamic(): Boolean = js.native
  def getData(): Float32Array = js.native
  def getBuffer(): WebGLBuffer = js.native
  def addUniform(name: String, size: Double | js.Array[Double]): Unit = js.native
  def addMatrix(name: String, mat: Matrix): Unit = js.native
  def addFloat2(name: String, x: Double, y: Double): Unit = js.native
  def addFloat3(name: String, x: Double, y: Double, z: Double): Unit = js.native
  def addColor3(name: String, color: Color3): Unit = js.native
  def addColor4(name: String, color: Color3, alpha: Double): Unit = js.native
  def addVector3(name: String, vector: Vector3): Unit = js.native
  def addMatrix3x3(name: String): Unit = js.native
  def addMatrix2x2(name: String): Unit = js.native
  def create(): Unit = js.native
  def update(): Unit = js.native
  def updateUniform(uniformName: String, data: js.Array[Double] | Float32Array, size: Double): Unit = js.native
  def setTexture(name: String, texture: BaseTexture): Unit = js.native
  def updateUniformDirectly(uniformName: String, data: js.Array[Double] | Float32Array): Unit = js.native
  def bindToEffect(effect: Effect, name: String): Unit = js.native
  def dispose(): Unit = js.native
}

@js.native
trait ILoadingScreen extends js.Object {
  var displayLoadingUI: js.Function0[Unit] = js.native
  var hideLoadingUI: js.Function0[Unit] = js.native
  var loadingUIBackgroundColor: String = js.native
  var loadingUIText: String = js.native
}

@js.native
@JSGlobal("BABYLON.DefaultLoadingScreen")
class DefaultLoadingScreen extends ILoadingScreen {
  def this(_renderingCanvas: HTMLCanvasElement, _loadingText: String = ???, _loadingDivBackgroundColor: String = ???) = this()




}

@js.native
trait ISceneLoaderPluginExtensions extends js.Object {
  @JSBracketAccess
  def apply(extension: String): js.Any = js.native
  @JSBracketAccess
  def update(extension: String, v: js.Any): Unit = js.native
}

@js.native
trait ISceneLoaderPlugin extends js.Object {
  var extensions: String | ISceneLoaderPluginExtensions = js.native
  var importMesh: js.Function7[js.Any, Scene, js.Any, String, js.Array[AbstractMesh], js.Array[ParticleSystem], js.Array[Skeleton], Boolean] = js.native
  var load: js.Function3[Scene, String, String, Boolean] = js.native
  var canDirectLoad: js.Function1[String, Boolean] = js.native
}

@js.native
trait ISceneLoaderPluginAsync extends js.Object {
  var extensions: String | ISceneLoaderPluginExtensions = js.native
  var importMeshAsync: js.Function6[js.Any, Scene, js.Any, String, js.Function3[js.Array[AbstractMesh], js.Array[ParticleSystem], js.Array[Skeleton], Unit], js.Function0[Unit], Unit] = js.native
  var loadAsync: js.Function5[Scene, String, String, js.Function0[Unit], js.Function0[Unit], Unit] = js.native
  var canDirectLoad: js.Function1[String, Boolean] = js.native
}

@js.native
@JSGlobal("BABYLON.SceneLoader")
class SceneLoader extends js.Object {
}

@js.native
@JSGlobal("BABYLON.SceneLoader")
object SceneLoader extends js.Object {
  def NO_LOGGING: Double = js.native
  def MINIMAL_LOGGING: Double = js.native
  def SUMMARY_LOGGING: Double = js.native
  def DETAILED_LOGGING: Double = js.native
  var ForceFullSceneLoadingForIncremental: Boolean = js.native
  var ShowLoadingScreen: Boolean = js.native
  var loggingLevel: Double = js.native
  def GetPluginForExtension(extension: String): ISceneLoaderPlugin | ISceneLoaderPluginAsync = js.native
  def RegisterPlugin(plugin: ISceneLoaderPlugin | ISceneLoaderPluginAsync): Unit = js.native
  def ImportMesh(meshesNames: js.Any, rootUrl: String, sceneFilename: String, scene: Scene, onsuccess: js.Function3[js.Array[AbstractMesh], js.Array[ParticleSystem], js.Array[Skeleton], Unit] = ???, progressCallBack: js.Function0[Unit] = ???, onerror: js.Function3[Scene, String, js.Any, Unit] = ???): Unit = js.native
  def Load(rootUrl: String, sceneFilename: js.Any, engine: Engine, onsuccess: js.Function1[Scene, Unit] = ???, progressCallBack: js.Any = ???, onerror: js.Function1[Scene, Unit] = ???): Unit = js.native
  def Append(rootUrl: String, sceneFilename: js.Any, scene: Scene, onsuccess: js.Function1[Scene, Unit] = ???, progressCallBack: js.Any = ???, onerror: js.Function1[Scene, Unit] = ???): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.SIMDHelper")
class SIMDHelper extends js.Object {
}

@js.native
@JSGlobal("BABYLON.SIMDHelper")
object SIMDHelper extends js.Object {
  def IsEnabled: Boolean = js.native
  def DisableSIMD(): Unit = js.native
  def EnableSIMD(): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.MathTools")
class MathTools extends js.Object {
}

@js.native
@JSGlobal("BABYLON.MathTools")
object MathTools extends js.Object {
  def WithinEpsilon(a: Double, b: Double, epsilon: Double = ???): Boolean = js.native
  def ToHex(i: Double): String = js.native
  def Sign(value: Double): Double = js.native
  def Clamp(value: Double, min: Double = ???, max: Double = ???): Double = js.native
  def Log2(value: Double): Double = js.native
}

@js.native
@JSGlobal("BABYLON.Scalar")
class Scalar extends js.Object {
}

@js.native
@JSGlobal("BABYLON.Scalar")
object Scalar extends js.Object {
  def Lerp(start: Double, end: Double, amount: Double): Double = js.native
  def Hermite(value1: Double, tangent1: Double, value2: Double, tangent2: Double, amount: Double): Double = js.native
}

@js.native
@JSGlobal("BABYLON.Color3")
class Color3 extends js.Object {
  def this(r: Double = ???, g: Double = ???, b: Double = ???) = this()
  var r: Double = js.native
  var g: Double = js.native
  var b: Double = js.native
  override def toString(): String = js.native
  def getClassName(): String = js.native
  def getHashCode(): Double = js.native
  def toArray(array: js.Array[Double] | Float32Array, index: Double = ???): Color3 = js.native
  def toColor4(alpha: Double = ???): Color4 = js.native
  def asArray(): js.Array[Double] = js.native
  def toLuminance(): Double = js.native
  def multiply(otherColor: Color3): Color3 = js.native
  def multiplyToRef(otherColor: Color3, result: Color3): Color3 = js.native
  def equals(otherColor: Color3): Boolean = js.native
  def equalsFloats(r: Double, g: Double, b: Double): Boolean = js.native
  def scale(scale: Double): Color3 = js.native
  def scaleToRef(scale: Double, result: Color3): Color3 = js.native
  def add(otherColor: Color3): Color3 = js.native
  def addToRef(otherColor: Color3, result: Color3): Color3 = js.native
  def subtract(otherColor: Color3): Color3 = js.native
  def subtractToRef(otherColor: Color3, result: Color3): Color3 = js.native
  override def clone(): Color3 = js.native
  def copyFrom(source: Color3): Color3 = js.native
  def copyFromFloats(r: Double, g: Double, b: Double): Color3 = js.native
  def set(r: Double, g: Double, b: Double): Color3 = js.native
  def toHexString(): String = js.native
  def toLinearSpace(): Color3 = js.native
  def toLinearSpaceToRef(convertedColor: Color3): Color3 = js.native
  def toGammaSpace(): Color3 = js.native
  def toGammaSpaceToRef(convertedColor: Color3): Color3 = js.native
}

@js.native
@JSGlobal("BABYLON.Color3")
object Color3 extends js.Object {
  def FromHexString(hex: String): Color3 = js.native
  def FromArray(array: js.Array[Double], offset: Double = ???): Color3 = js.native
  def FromInts(r: Double, g: Double, b: Double): Color3 = js.native
  def Lerp(start: Color3, end: Color3, amount: Double): Color3 = js.native
  def Red(): Color3 = js.native
  def Green(): Color3 = js.native
  def Blue(): Color3 = js.native
  def Black(): Color3 = js.native
  def White(): Color3 = js.native
  def Purple(): Color3 = js.native
  def Magenta(): Color3 = js.native
  def Yellow(): Color3 = js.native
  def Gray(): Color3 = js.native
  def Random(): Color3 = js.native
}

@js.native
@JSGlobal("BABYLON.Color4")
class Color4 extends js.Object {
  def this(r: Double, g: Double, b: Double, a: Double) = this()
  var r: Double = js.native
  var g: Double = js.native
  var b: Double = js.native
  var a: Double = js.native
  def addInPlace(right: js.Any): Color4 = js.native
  def asArray(): js.Array[Double] = js.native
  def toArray(array: js.Array[Double], index: Double = ???): Color4 = js.native
  def add(right: Color4): Color4 = js.native
  def subtract(right: Color4): Color4 = js.native
  def subtractToRef(right: Color4, result: Color4): Color4 = js.native
  def scale(scale: Double): Color4 = js.native
  def scaleToRef(scale: Double, result: Color4): Color4 = js.native
  def multiply(color: Color4): Color4 = js.native
  def multiplyToRef(color: Color4, result: Color4): Color4 = js.native
  override def toString(): String = js.native
  def getClassName(): String = js.native
  def getHashCode(): Double = js.native
  override def clone(): Color4 = js.native
  def copyFrom(source: Color4): Color4 = js.native
  def copyFromFloats(r: Double, g: Double, b: Double, a: Double): Color4 = js.native
  def set(r: Double, g: Double, b: Double, a: Double): Color4 = js.native
  def toHexString(): String = js.native
}

@js.native
@JSGlobal("BABYLON.Color4")
object Color4 extends js.Object {
  def FromHexString(hex: String): Color4 = js.native
  def Lerp(left: Color4, right: Color4, amount: Double): Color4 = js.native
  def LerpToRef(left: Color4, right: Color4, amount: Double, result: Color4): Unit = js.native
  def FromArray(array: js.Array[Double], offset: Double = ???): Color4 = js.native
  def FromInts(r: Double, g: Double, b: Double, a: Double): Color4 = js.native
  def CheckColors4(colors: js.Array[Double], count: Double): js.Array[Double] = js.native
}

@js.native
@JSGlobal("BABYLON.Vector2")
class Vector2 extends js.Object {
  def this(x: Double, y: Double) = this()
  var x: Double = js.native
  var y: Double = js.native
  override def toString(): String = js.native
  def getClassName(): String = js.native
  def getHashCode(): Double = js.native
  def toArray(array: js.Array[Double] | Float32Array, index: Double = ???): Vector2 = js.native
  def asArray(): js.Array[Double] = js.native
  def copyFrom(source: Vector2): Vector2 = js.native
  def copyFromFloats(x: Double, y: Double): Vector2 = js.native
  def set(x: Double, y: Double): Vector2 = js.native
  def add(otherVector: Vector2): Vector2 = js.native
  def addToRef(otherVector: Vector2, result: Vector2): Vector2 = js.native
  def addInPlace(otherVector: Vector2): Vector2 = js.native
  def addVector3(otherVector: Vector3): Vector2 = js.native
  def subtract(otherVector: Vector2): Vector2 = js.native
  def subtractToRef(otherVector: Vector2, result: Vector2): Vector2 = js.native
  def subtractInPlace(otherVector: Vector2): Vector2 = js.native
  def multiplyInPlace(otherVector: Vector2): Vector2 = js.native
  def multiply(otherVector: Vector2): Vector2 = js.native
  def multiplyToRef(otherVector: Vector2, result: Vector2): Vector2 = js.native
  def multiplyByFloats(x: Double, y: Double): Vector2 = js.native
  def divide(otherVector: Vector2): Vector2 = js.native
  def divideToRef(otherVector: Vector2, result: Vector2): Vector2 = js.native
  def negate(): Vector2 = js.native
  def scaleInPlace(scale: Double): Vector2 = js.native
  def scale(scale: Double): Vector2 = js.native
  def equals(otherVector: Vector2): Boolean = js.native
  def equalsWithEpsilon(otherVector: Vector2, epsilon: Double = ???): Boolean = js.native
  def length(): Double = js.native
  def lengthSquared(): Double = js.native
  def normalize(): Vector2 = js.native
  override def clone(): Vector2 = js.native
}

@js.native
@JSGlobal("BABYLON.Vector2")
object Vector2 extends js.Object {
  def Zero(): Vector2 = js.native
  def One(): Vector2 = js.native
  def FromArray(array: js.Array[Double], offset: Double = ???): Vector2 = js.native
  def FromArrayToRef(array: js.Array[Double], offset: Double, result: Vector2): Unit = js.native
  def CatmullRom(value1: Vector2, value2: Vector2, value3: Vector2, value4: Vector2, amount: Double): Vector2 = js.native
  def Clamp(value: Vector2, min: Vector2, max: Vector2): Vector2 = js.native
  def Hermite(value1: Vector2, tangent1: Vector2, value2: Vector2, tangent2: Vector2, amount: Double): Vector2 = js.native
  def Lerp(start: Vector2, end: Vector2, amount: Double): Vector2 = js.native
  def Dot(left: Vector2, right: Vector2): Double = js.native
  def Normalize(vector: Vector2): Vector2 = js.native
  def Minimize(left: Vector2, right: Vector2): Vector2 = js.native
  def Maximize(left: Vector2, right: Vector2): Vector2 = js.native
  def Transform(vector: Vector2, transformation: Matrix): Vector2 = js.native
  def TransformToRef(vector: Vector2, transformation: Matrix, result: Vector2): Unit = js.native
  def PointInTriangle(p: Vector2, p0: Vector2, p1: Vector2, p2: Vector2): Boolean = js.native
  def Distance(value1: Vector2, value2: Vector2): Double = js.native
  def DistanceSquared(value1: Vector2, value2: Vector2): Double = js.native
  def Center(value1: Vector2, value2: Vector2): Vector2 = js.native
  def DistanceOfPointFromSegment(p: Vector2, segA: Vector2, segB: Vector2): Double = js.native
}

@js.native
@JSGlobal("BABYLON.Vector3")
class Vector3 extends js.Object {
  def this(x: Double, y: Double, z: Double) = this()
  var x: Double = js.native
  var y: Double = js.native
  var z: Double = js.native
  override def toString(): String = js.native
  def getClassName(): String = js.native
  def getHashCode(): Double = js.native
  def asArray(): js.Array[Double] = js.native
  def toArray(array: js.Array[Double] | Float32Array, index: Double = ???): Vector3 = js.native
  def toQuaternion(): Quaternion = js.native
  def addInPlace(otherVector: Vector3): Vector3 = js.native
  def add(otherVector: Vector3): Vector3 = js.native
  def addToRef(otherVector: Vector3, result: Vector3): Vector3 = js.native
  def subtractInPlace(otherVector: Vector3): Vector3 = js.native
  def subtract(otherVector: Vector3): Vector3 = js.native
  def subtractToRef(otherVector: Vector3, result: Vector3): Vector3 = js.native
  def subtractFromFloats(x: Double, y: Double, z: Double): Vector3 = js.native
  def subtractFromFloatsToRef(x: Double, y: Double, z: Double, result: Vector3): Vector3 = js.native
  def negate(): Vector3 = js.native
  def scaleInPlace(scale: Double): Vector3 = js.native
  def scale(scale: Double): Vector3 = js.native
  def scaleToRef(scale: Double, result: Vector3): Vector3 = js.native
  def equals(otherVector: Vector3): Boolean = js.native
  def equalsWithEpsilon(otherVector: Vector3, epsilon: Double = ???): Boolean = js.native
  def equalsToFloats(x: Double, y: Double, z: Double): Boolean = js.native
  def multiplyInPlace(otherVector: Vector3): Vector3 = js.native
  def multiply(otherVector: Vector3): Vector3 = js.native
  def multiplyToRef(otherVector: Vector3, result: Vector3): Vector3 = js.native
  def multiplyByFloats(x: Double, y: Double, z: Double): Vector3 = js.native
  def divide(otherVector: Vector3): Vector3 = js.native
  def divideToRef(otherVector: Vector3, result: Vector3): Vector3 = js.native
  def MinimizeInPlace(other: Vector3): Vector3 = js.native
  def MaximizeInPlace(other: Vector3): Vector3 = js.native
  def length(): Double = js.native
  def lengthSquared(): Double = js.native
  def normalize(): Vector3 = js.native
  override def clone(): Vector3 = js.native
  def copyFrom(source: Vector3): Vector3 = js.native
  def copyFromFloats(x: Double, y: Double, z: Double): Vector3 = js.native
  def set(x: Double, y: Double, z: Double): Vector3 = js.native
}

@js.native
@JSGlobal("BABYLON.Vector3")
object Vector3 extends js.Object {
  def GetClipFactor(vector0: Vector3, vector1: Vector3, axis: Vector3, size: js.Any): Double = js.native
  def FromArray(array: js.Array[Double], offset: Double = ???): Vector3 = js.native
  def FromFloatArray(array: Float32Array, offset: Double = ???): Vector3 = js.native
  def FromArrayToRef(array: js.Array[Double], offset: Double, result: Vector3): Unit = js.native
  def FromFloatArrayToRef(array: Float32Array, offset: Double, result: Vector3): Unit = js.native
  def FromFloatsToRef(x: Double, y: Double, z: Double, result: Vector3): Unit = js.native
  def Zero(): Vector3 = js.native
  def One(): Vector3 = js.native
  def Up(): Vector3 = js.native
  def Forward(): Vector3 = js.native
  def Right(): Vector3 = js.native
  def Left(): Vector3 = js.native
  def TransformCoordinates(vector: Vector3, transformation: Matrix): Vector3 = js.native
  def TransformCoordinatesToRef(vector: Vector3, transformation: Matrix, result: Vector3): Unit = js.native
  def TransformCoordinatesFromFloatsToRef(x: Double, y: Double, z: Double, transformation: Matrix, result: Vector3): Unit = js.native
  def TransformNormal(vector: Vector3, transformation: Matrix): Vector3 = js.native
  def TransformNormalToRef(vector: Vector3, transformation: Matrix, result: Vector3): Unit = js.native
  def TransformNormalFromFloatsToRef(x: Double, y: Double, z: Double, transformation: Matrix, result: Vector3): Unit = js.native
  def CatmullRom(value1: Vector3, value2: Vector3, value3: Vector3, value4: Vector3, amount: Double): Vector3 = js.native
  def Clamp(value: Vector3, min: Vector3, max: Vector3): Vector3 = js.native
  def Hermite(value1: Vector3, tangent1: Vector3, value2: Vector3, tangent2: Vector3, amount: Double): Vector3 = js.native
  def Lerp(start: Vector3, end: Vector3, amount: Double): Vector3 = js.native
  def LerpToRef(start: Vector3, end: Vector3, amount: Double, result: Vector3): Unit = js.native
  def Dot(left: Vector3, right: Vector3): Double = js.native
  def Cross(left: Vector3, right: Vector3): Vector3 = js.native
  def CrossToRef(left: Vector3, right: Vector3, result: Vector3): Unit = js.native
  def Normalize(vector: Vector3): Vector3 = js.native
  def NormalizeToRef(vector: Vector3, result: Vector3): Unit = js.native
  def Project(vector: Vector3, world: Matrix, transform: Matrix, viewport: Viewport): Vector3 = js.native
  def UnprojectFromTransform(source: Vector3, viewportWidth: Double, viewportHeight: Double, world: Matrix, transform: Matrix): Vector3 = js.native
  def Unproject(source: Vector3, viewportWidth: Double, viewportHeight: Double, world: Matrix, view: Matrix, projection: Matrix): Vector3 = js.native
  def Minimize(left: Vector3, right: Vector3): Vector3 = js.native
  def Maximize(left: Vector3, right: Vector3): Vector3 = js.native
  def Distance(value1: Vector3, value2: Vector3): Double = js.native
  def DistanceSquared(value1: Vector3, value2: Vector3): Double = js.native
  def Center(value1: Vector3, value2: Vector3): Vector3 = js.native
  def RotationFromAxis(axis1: Vector3, axis2: Vector3, axis3: Vector3): Vector3 = js.native
  def RotationFromAxisToRef(axis1: Vector3, axis2: Vector3, axis3: Vector3, ref: Vector3): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.Vector4")
class Vector4 extends js.Object {
  def this(x: Double, y: Double, z: Double, w: Double) = this()
  var x: Double = js.native
  var y: Double = js.native
  var z: Double = js.native
  var w: Double = js.native
  override def toString(): String = js.native
  def getClassName(): String = js.native
  def getHashCode(): Double = js.native
  def asArray(): js.Array[Double] = js.native
  def toArray(array: js.Array[Double] | Float32Array, index: Double = ???): Vector4 = js.native
  def addInPlace(otherVector: Vector4): Vector4 = js.native
  def add(otherVector: Vector4): Vector4 = js.native
  def addToRef(otherVector: Vector4, result: Vector4): Vector4 = js.native
  def subtractInPlace(otherVector: Vector4): Vector4 = js.native
  def subtract(otherVector: Vector4): Vector4 = js.native
  def subtractToRef(otherVector: Vector4, result: Vector4): Vector4 = js.native
  def subtractFromFloats(x: Double, y: Double, z: Double, w: Double): Vector4 = js.native
  def subtractFromFloatsToRef(x: Double, y: Double, z: Double, w: Double, result: Vector4): Vector4 = js.native
  def negate(): Vector4 = js.native
  def scaleInPlace(scale: Double): Vector4 = js.native
  def scale(scale: Double): Vector4 = js.native
  def scaleToRef(scale: Double, result: Vector4): Vector4 = js.native
  def equals(otherVector: Vector4): Boolean = js.native
  def equalsWithEpsilon(otherVector: Vector4, epsilon: Double = ???): Boolean = js.native
  def equalsToFloats(x: Double, y: Double, z: Double, w: Double): Boolean = js.native
  def multiplyInPlace(otherVector: Vector4): Vector4 = js.native
  def multiply(otherVector: Vector4): Vector4 = js.native
  def multiplyToRef(otherVector: Vector4, result: Vector4): Vector4 = js.native
  def multiplyByFloats(x: Double, y: Double, z: Double, w: Double): Vector4 = js.native
  def divide(otherVector: Vector4): Vector4 = js.native
  def divideToRef(otherVector: Vector4, result: Vector4): Vector4 = js.native
  def MinimizeInPlace(other: Vector4): Vector4 = js.native
  def MaximizeInPlace(other: Vector4): Vector4 = js.native
  def length(): Double = js.native
  def lengthSquared(): Double = js.native
  def normalize(): Vector4 = js.native
  def toVector3(): Vector3 = js.native
  override def clone(): Vector4 = js.native
  def copyFrom(source: Vector4): Vector4 = js.native
  def copyFromFloats(x: Double, y: Double, z: Double, w: Double): Vector4 = js.native
  def set(x: Double, y: Double, z: Double, w: Double): Vector4 = js.native
}

@js.native
@JSGlobal("BABYLON.Vector4")
object Vector4 extends js.Object {
  def FromArray(array: js.Array[Double], offset: Double = ???): Vector4 = js.native
  def FromArrayToRef(array: js.Array[Double], offset: Double, result: Vector4): Unit = js.native
  def FromFloatArrayToRef(array: Float32Array, offset: Double, result: Vector4): Unit = js.native
  def FromFloatsToRef(x: Double, y: Double, z: Double, w: Double, result: Vector4): Unit = js.native
  def Zero(): Vector4 = js.native
  def One(): Vector4 = js.native
  def Normalize(vector: Vector4): Vector4 = js.native
  def NormalizeToRef(vector: Vector4, result: Vector4): Unit = js.native
  def Minimize(left: Vector4, right: Vector4): Vector4 = js.native
  def Maximize(left: Vector4, right: Vector4): Vector4 = js.native
  def Distance(value1: Vector4, value2: Vector4): Double = js.native
  def DistanceSquared(value1: Vector4, value2: Vector4): Double = js.native
  def Center(value1: Vector4, value2: Vector4): Vector4 = js.native
  def TransformNormal(vector: Vector4, transformation: Matrix): Vector4 = js.native
  def TransformNormalToRef(vector: Vector4, transformation: Matrix, result: Vector4): Unit = js.native
  def TransformNormalFromFloatsToRef(x: Double, y: Double, z: Double, w: Double, transformation: Matrix, result: Vector4): Unit = js.native
}

@js.native
trait ISize extends js.Object {
  var width: Double = js.native
  var height: Double = js.native
}

@js.native
@JSGlobal("BABYLON.Size")
class Size extends ISize {
  def this(width: Double, height: Double) = this()


  override def toString(): String = js.native
  def getClassName(): String = js.native
  def getHashCode(): Double = js.native
  def copyFrom(src: Size): Unit = js.native
  def copyFromFloats(width: Double, height: Double): Size = js.native
  def set(width: Double, height: Double): Size = js.native
  def multiplyByFloats(w: Double, h: Double): Size = js.native
  override def clone(): Size = js.native
  def equals(other: Size): Boolean = js.native
  def surface: Double = js.native
  def add(otherSize: Size): Size = js.native
  def subtract(otherSize: Size): Size = js.native
}

@js.native
@JSGlobal("BABYLON.Size")
object Size extends js.Object {
  def Zero(): Size = js.native
  def Lerp(start: Size, end: Size, amount: Double): Size = js.native
}

@js.native
@JSGlobal("BABYLON.Quaternion")
class Quaternion extends js.Object {
  def this(x: Double = ???, y: Double = ???, z: Double = ???, w: Double = ???) = this()
  var x: Double = js.native
  var y: Double = js.native
  var z: Double = js.native
  var w: Double = js.native
  override def toString(): String = js.native
  def getClassName(): String = js.native
  def getHashCode(): Double = js.native
  def asArray(): js.Array[Double] = js.native
  def equals(otherQuaternion: Quaternion): Boolean = js.native
  override def clone(): Quaternion = js.native
  def copyFrom(other: Quaternion): Quaternion = js.native
  def copyFromFloats(x: Double, y: Double, z: Double, w: Double): Quaternion = js.native
  def set(x: Double, y: Double, z: Double, w: Double): Quaternion = js.native
  def add(other: Quaternion): Quaternion = js.native
  def subtract(other: Quaternion): Quaternion = js.native
  def scale(value: Double): Quaternion = js.native
  def multiply(q1: Quaternion): Quaternion = js.native
  def multiplyToRef(q1: Quaternion, result: Quaternion): Quaternion = js.native
  def multiplyInPlace(q1: Quaternion): Quaternion = js.native
  def conjugateToRef(ref: Quaternion): Quaternion = js.native
  def conjugateInPlace(): Quaternion = js.native
  def conjugate(): Quaternion = js.native
  def length(): Double = js.native
  def normalize(): Quaternion = js.native
  def toEulerAngles(order: String = ???): Vector3 = js.native
  def toEulerAnglesToRef(result: Vector3, order: String = ???): Quaternion = js.native
  def toRotationMatrix(result: Matrix): Quaternion = js.native
  def fromRotationMatrix(matrix: Matrix): Quaternion = js.native
}

@js.native
@JSGlobal("BABYLON.Quaternion")
object Quaternion extends js.Object {
  def FromRotationMatrix(matrix: Matrix): Quaternion = js.native
  def FromRotationMatrixToRef(matrix: Matrix, result: Quaternion): Unit = js.native
  def Zero(): Quaternion = js.native
  def Inverse(q: Quaternion): Quaternion = js.native
  def Identity(): Quaternion = js.native
  def IsIdentity(quaternion: Quaternion): Boolean = js.native
  def RotationAxis(axis: Vector3, angle: Double): Quaternion = js.native
  def RotationAxisToRef(axis: Vector3, angle: Double, result: Quaternion): Quaternion = js.native
  def FromArray(array: js.Array[Double], offset: Double = ???): Quaternion = js.native
  def RotationYawPitchRoll(yaw: Double, pitch: Double, roll: Double): Quaternion = js.native
  def RotationYawPitchRollToRef(yaw: Double, pitch: Double, roll: Double, result: Quaternion): Unit = js.native
  def RotationAlphaBetaGamma(alpha: Double, beta: Double, gamma: Double): Quaternion = js.native
  def RotationAlphaBetaGammaToRef(alpha: Double, beta: Double, gamma: Double, result: Quaternion): Unit = js.native
  def RotationQuaternionFromAxis(axis1: Vector3, axis2: Vector3, axis3: Vector3, ref: Quaternion): Quaternion = js.native
  def RotationQuaternionFromAxisToRef(axis1: Vector3, axis2: Vector3, axis3: Vector3, ref: Quaternion): Unit = js.native
  def Slerp(left: Quaternion, right: Quaternion, amount: Double): Quaternion = js.native
  def SlerpToRef(left: Quaternion, right: Quaternion, amount: Double, result: Quaternion): Unit = js.native
  def Hermite(value1: Quaternion, tangent1: Quaternion, value2: Quaternion, tangent2: Quaternion, amount: Double): Quaternion = js.native
}

@js.native
@JSGlobal("BABYLON.Matrix")
class Matrix extends js.Object {
  var updateFlag: Double = js.native
  var m: Float32Array = js.native
  def isIdentity(considerAsTextureMatrix: Boolean = ???): Boolean = js.native
  def determinant(): Double = js.native
  def toArray(): Float32Array = js.native
  def asArray(): Float32Array = js.native
  def invert(): Matrix = js.native
  def reset(): Matrix = js.native
  def add(other: Matrix): Matrix = js.native
  def addToRef(other: Matrix, result: Matrix): Matrix = js.native
  def addToSelf(other: Matrix): Matrix = js.native
  def invertToRef(other: Matrix): Matrix = js.native
  def setTranslationFromFloats(x: Double, y: Double, z: Double): Matrix = js.native
  def setTranslation(vector3: Vector3): Matrix = js.native
  def getTranslation(): Vector3 = js.native
  def getTranslationToRef(result: Vector3): Matrix = js.native
  def removeRotationAndScaling(): Matrix = js.native
  def multiply(other: Matrix): Matrix = js.native
  def copyFrom(other: Matrix): Matrix = js.native
  def copyToArray(array: Float32Array, offset: Double = ???): Matrix = js.native
  def multiplyToRef(other: Matrix, result: Matrix): Matrix = js.native
  def multiplyToArray(other: Matrix, result: Float32Array, offset: Double): Matrix = js.native
  def equals(value: Matrix): Boolean = js.native
  override def clone(): Matrix = js.native
  def getClassName(): String = js.native
  def getHashCode(): Double = js.native
  def decompose(scale: Vector3, rotation: Quaternion, translation: Vector3): Boolean = js.native
  def getRotationMatrix(): Matrix = js.native
  def getRotationMatrixToRef(result: Matrix): Matrix = js.native
  def getRow(index: Double): Vector4 = js.native
  def setRow(index: Double, row: Vector4): Matrix = js.native
  def setRowFromFloats(index: Double, x: Double, y: Double, z: Double, w: Double): Matrix = js.native
}

@js.native
@JSGlobal("BABYLON.Matrix")
object Matrix extends js.Object {
  def FromArray(array: js.Array[Double], offset: Double = ???): Matrix = js.native
  def FromArrayToRef(array: js.Array[Double], offset: Double, result: Matrix): Unit = js.native
  def FromFloat32ArrayToRefScaled(array: Float32Array, offset: Double, scale: Double, result: Matrix): Unit = js.native
  def FromValuesToRef(initialM11: Double, initialM12: Double, initialM13: Double, initialM14: Double, initialM21: Double, initialM22: Double, initialM23: Double, initialM24: Double, initialM31: Double, initialM32: Double, initialM33: Double, initialM34: Double, initialM41: Double, initialM42: Double, initialM43: Double, initialM44: Double, result: Matrix): Unit = js.native
  def FromValues(initialM11: Double, initialM12: Double, initialM13: Double, initialM14: Double, initialM21: Double, initialM22: Double, initialM23: Double, initialM24: Double, initialM31: Double, initialM32: Double, initialM33: Double, initialM34: Double, initialM41: Double, initialM42: Double, initialM43: Double, initialM44: Double): Matrix = js.native
  def Compose(scale: Vector3, rotation: Quaternion, translation: Vector3): Matrix = js.native
  def ComposeToRef(scale: Vector3, rotation: Quaternion, translation: Vector3, result: Matrix): Unit = js.native
  def Identity(): Matrix = js.native
  def IdentityToRef(result: Matrix): Unit = js.native
  def Zero(): Matrix = js.native
  def RotationX(angle: Double): Matrix = js.native
  def Invert(source: Matrix): Matrix = js.native
  def RotationXToRef(angle: Double, result: Matrix): Unit = js.native
  def RotationY(angle: Double): Matrix = js.native
  def RotationYToRef(angle: Double, result: Matrix): Unit = js.native
  def RotationZ(angle: Double): Matrix = js.native
  def RotationZToRef(angle: Double, result: Matrix): Unit = js.native
  def RotationAxis(axis: Vector3, angle: Double): Matrix = js.native
  def RotationAxisToRef(axis: Vector3, angle: Double, result: Matrix): Unit = js.native
  def RotationYawPitchRoll(yaw: Double, pitch: Double, roll: Double): Matrix = js.native
  def RotationYawPitchRollToRef(yaw: Double, pitch: Double, roll: Double, result: Matrix): Unit = js.native
  def Scaling(x: Double, y: Double, z: Double): Matrix = js.native
  def ScalingToRef(x: Double, y: Double, z: Double, result: Matrix): Unit = js.native
  def Translation(x: Double, y: Double, z: Double): Matrix = js.native
  def TranslationToRef(x: Double, y: Double, z: Double, result: Matrix): Unit = js.native
  def Lerp(startValue: Matrix, endValue: Matrix, gradient: Double): Matrix = js.native
  def DecomposeLerp(startValue: Matrix, endValue: Matrix, gradient: Double): Matrix = js.native
  def LookAtLH(eye: Vector3, target: Vector3, up: Vector3): Matrix = js.native
  def LookAtLHToRef(eye: Vector3, target: Vector3, up: Vector3, result: Matrix): Unit = js.native
  def LookAtRH(eye: Vector3, target: Vector3, up: Vector3): Matrix = js.native
  def LookAtRHToRef(eye: Vector3, target: Vector3, up: Vector3, result: Matrix): Unit = js.native
  def OrthoLH(width: Double, height: Double, znear: Double, zfar: Double): Matrix = js.native
  def OrthoLHToRef(width: Double, height: Double, znear: Double, zfar: Double, result: Matrix): Unit = js.native
  def OrthoOffCenterLH(left: Double, right: Double, bottom: Double, top: Double, znear: Double, zfar: Double): Matrix = js.native
  def OrthoOffCenterLHToRef(left: Double, right: Double, bottom: Double, top: Double, znear: Double, zfar: Double, result: Matrix): Unit = js.native
  def OrthoOffCenterRH(left: Double, right: Double, bottom: Double, top: Double, znear: Double, zfar: Double): Matrix = js.native
  def OrthoOffCenterRHToRef(left: Double, right: js.Any, bottom: Double, top: Double, znear: Double, zfar: Double, result: Matrix): Unit = js.native
  def PerspectiveLH(width: Double, height: Double, znear: Double, zfar: Double): Matrix = js.native
  def PerspectiveFovLH(fov: Double, aspect: Double, znear: Double, zfar: Double): Matrix = js.native
  def PerspectiveFovLHToRef(fov: Double, aspect: Double, znear: Double, zfar: Double, result: Matrix, isVerticalFovFixed: Boolean = ???): Unit = js.native
  def PerspectiveFovRH(fov: Double, aspect: Double, znear: Double, zfar: Double): Matrix = js.native
  def PerspectiveFovRHToRef(fov: Double, aspect: Double, znear: Double, zfar: Double, result: Matrix, isVerticalFovFixed: Boolean = ???): Unit = js.native
  def PerspectiveFovWebVRToRef(fov: js.Any, znear: Double, zfar: Double, result: Matrix, rightHanded: Boolean = ???): Unit = js.native
  def GetFinalMatrix(viewport: Viewport, world: Matrix, view: Matrix, projection: Matrix, zmin: Double, zmax: Double): Matrix = js.native
  def GetAsMatrix2x2(matrix: Matrix): Float32Array = js.native
  def GetAsMatrix3x3(matrix: Matrix): Float32Array = js.native
  def Transpose(matrix: Matrix): Matrix = js.native
  def Reflection(plane: Plane): Matrix = js.native
  def ReflectionToRef(plane: Plane, result: Matrix): Unit = js.native
  def FromXYZAxesToRef(xaxis: Vector3, yaxis: Vector3, zaxis: Vector3, result: Matrix): Unit = js.native
  def FromQuaternionToRef(quat: Quaternion, result: Matrix): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.Plane")
class Plane extends js.Object {
  def this(a: Double, b: Double, c: Double, d: Double) = this()
  var normal: Vector3 = js.native
  var d: Double = js.native
  def asArray(): js.Array[Double] = js.native
  override def clone(): Plane = js.native
  def getClassName(): String = js.native
  def getHashCode(): Double = js.native
  def normalize(): Plane = js.native
  def transform(transformation: Matrix): Plane = js.native
  def dotCoordinate(point: js.Any): Double = js.native
  def copyFromPoints(point1: Vector3, point2: Vector3, point3: Vector3): Plane = js.native
  def isFrontFacingTo(direction: Vector3, epsilon: Double): Boolean = js.native
  def signedDistanceTo(point: Vector3): Double = js.native
}

@js.native
@JSGlobal("BABYLON.Plane")
object Plane extends js.Object {
  def FromArray(array: js.Array[Double]): Plane = js.native
  def FromPoints(point1: js.Any, point2: js.Any, point3: js.Any): Plane = js.native
  def FromPositionAndNormal(origin: Vector3, normal: Vector3): Plane = js.native
  def SignedDistanceToPlaneFromPositionAndNormal(origin: Vector3, normal: Vector3, point: Vector3): Double = js.native
}

@js.native
@JSGlobal("BABYLON.Viewport")
class Viewport extends js.Object {
  def this(x: Double, y: Double, width: Double, height: Double) = this()
  var x: Double = js.native
  var y: Double = js.native
  var width: Double = js.native
  var height: Double = js.native
  def toGlobal(renderWidthOrEngine: Double | Engine, renderHeight: Double): Viewport = js.native
  override def clone(): Viewport = js.native
}

@js.native
@JSGlobal("BABYLON.Frustum")
class Frustum extends js.Object {
}

@js.native
@JSGlobal("BABYLON.Frustum")
object Frustum extends js.Object {
  def GetPlanes(transform: Matrix): js.Array[Plane] = js.native
  def GetPlanesToRef(transform: Matrix, frustumPlanes: js.Array[Plane]): Unit = js.native
}

@js.native
sealed trait Space extends js.Object {
}

@js.native
@JSGlobal("BABYLON.Space")
object Space extends js.Object {
  var LOCAL: Space = js.native
  var WORLD: Space = js.native
  var BONE: Space = js.native
  @JSBracketAccess
  def apply(value: Space): String = js.native
}

@js.native
@JSGlobal("BABYLON.Axis")
class Axis extends js.Object {
}

@js.native
@JSGlobal("BABYLON.Axis")
object Axis extends js.Object {
  var X: Vector3 = js.native
  var Y: Vector3 = js.native
  var Z: Vector3 = js.native
}

@js.native
@JSGlobal("BABYLON.BezierCurve")
class BezierCurve extends js.Object {
}

@js.native
@JSGlobal("BABYLON.BezierCurve")
object BezierCurve extends js.Object {
  def interpolate(t: Double, x1: Double, y1: Double, x2: Double, y2: Double): Double = js.native
}

@js.native
sealed trait Orientation extends js.Object {
}

@js.native
@JSGlobal("BABYLON.Orientation")
object Orientation extends js.Object {
  var CW: Orientation = js.native
  var CCW: Orientation = js.native
  @JSBracketAccess
  def apply(value: Orientation): String = js.native
}

@js.native
@JSGlobal("BABYLON.Angle")
class Angle extends js.Object {
  def this(radians: Double) = this()
  var degrees: js.Function0[Double] = js.native
  var radians: js.Function0[Double] = js.native
}

@js.native
@JSGlobal("BABYLON.Angle")
object Angle extends js.Object {
  def BetweenTwoPoints(a: Vector2, b: Vector2): Angle = js.native
  def FromRadians(radians: Double): Angle = js.native
  def FromDegrees(degrees: Double): Angle = js.native
}

@js.native
@JSGlobal("BABYLON.Arc2")
class Arc2 extends js.Object {
  def this(startPoint: Vector2, midPoint: Vector2, endPoint: Vector2) = this()
  var startPoint: Vector2 = js.native
  var midPoint: Vector2 = js.native
  var endPoint: Vector2 = js.native
  var centerPoint: Vector2 = js.native
  var radius: Double = js.native
  var angle: Angle = js.native
  var startAngle: Angle = js.native
  var orientation: Orientation = js.native
}

@js.native
@JSGlobal("BABYLON.Path2")
class Path2 extends js.Object {
  def this(x: Double, y: Double) = this()
  var closed: Boolean = js.native
  def addLineTo(x: Double, y: Double): Path2 = js.native
  def addArcTo(midX: Double, midY: Double, endX: Double, endY: Double, numberOfSegments: Double = ???): Path2 = js.native
  def close(): Path2 = js.native
  def length(): Double = js.native
  def getPoints(): js.Array[Vector2] = js.native
  def getPointAtLengthPosition(normalizedLengthPosition: Double): Vector2 = js.native
}

@js.native
@JSGlobal("BABYLON.Path2")
object Path2 extends js.Object {
  def StartingAt(x: Double, y: Double): Path2 = js.native
}

@js.native
@JSGlobal("BABYLON.Path3D")
class Path3D extends js.Object {
  def this(path: js.Array[Vector3], firstNormal: Vector3 = ???, raw: Boolean = ???) = this()
  var path: js.Array[Vector3] = js.native
  def getCurve(): js.Array[Vector3] = js.native
  def getTangents(): js.Array[Vector3] = js.native
  def getNormals(): js.Array[Vector3] = js.native
  def getBinormals(): js.Array[Vector3] = js.native
  def getDistances(): js.Array[Double] = js.native
  def update(path: js.Array[Vector3], firstNormal: Vector3 = ???): Path3D = js.native
}

@js.native
@JSGlobal("BABYLON.Curve3")
class Curve3 extends js.Object {
  def this(points: js.Array[Vector3]) = this()
  def getPoints(): js.Array[Vector3] = js.native
  def length(): Double = js.native
  def continue(curve: Curve3): Curve3 = js.native
}

@js.native
@JSGlobal("BABYLON.Curve3")
object Curve3 extends js.Object {
  def CreateQuadraticBezier(v0: Vector3, v1: Vector3, v2: Vector3, nbPoints: Double): Curve3 = js.native
  def CreateCubicBezier(v0: Vector3, v1: Vector3, v2: Vector3, v3: Vector3, nbPoints: Double): Curve3 = js.native
  def CreateHermiteSpline(p1: Vector3, t1: Vector3, p2: Vector3, t2: Vector3, nbPoints: Double): Curve3 = js.native
  def CreateCatmullRomSpline(points: js.Array[Vector3], nbPoints: Double): Curve3 = js.native
}

@js.native
@JSGlobal("BABYLON.PositionNormalVertex")
class PositionNormalVertex extends js.Object {
  def this(position: Vector3 = ???, normal: Vector3 = ???) = this()
  var position: Vector3 = js.native
  var normal: Vector3 = js.native
  override def clone(): PositionNormalVertex = js.native
}

@js.native
@JSGlobal("BABYLON.PositionNormalTextureVertex")
class PositionNormalTextureVertex extends js.Object {
  def this(position: Vector3 = ???, normal: Vector3 = ???, uv: Vector2 = ???) = this()
  var position: Vector3 = js.native
  var normal: Vector3 = js.native
  var uv: Vector2 = js.native
  override def clone(): PositionNormalTextureVertex = js.native
}

@js.native
@JSGlobal("BABYLON.Tmp")
class Tmp extends js.Object {
}

@js.native
@JSGlobal("BABYLON.Tmp")
object Tmp extends js.Object {
  var Color3: js.Array[Color3] = js.native
  var Vector2: js.Array[Vector2] = js.native
  var Vector3: js.Array[Vector3] = js.native
  var Vector4: js.Array[Vector4] = js.native
  var Quaternion: js.Array[Quaternion] = js.native
  var Matrix: js.Array[Matrix] = js.native
}

@js.native
@JSGlobal("BABYLON.SphericalPolynomial")
class SphericalPolynomial extends js.Object {
  var x: Vector3 = js.native
  var y: Vector3 = js.native
  var z: Vector3 = js.native
  var xx: Vector3 = js.native
  var yy: Vector3 = js.native
  var zz: Vector3 = js.native
  var xy: Vector3 = js.native
  var yz: Vector3 = js.native
  var zx: Vector3 = js.native
  def addAmbient(color: Color3): Unit = js.native
  def scale(scale: Double): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.SphericalPolynomial")
object SphericalPolynomial extends js.Object {
  def getSphericalPolynomialFromHarmonics(harmonics: SphericalHarmonics): SphericalPolynomial = js.native
}

@js.native
@JSGlobal("BABYLON.SphericalHarmonics")
class SphericalHarmonics extends js.Object {
  var L00: Vector3 = js.native
  var L1_1: Vector3 = js.native
  var L10: Vector3 = js.native
  var L11: Vector3 = js.native
  var L2_2: Vector3 = js.native
  var L2_1: Vector3 = js.native
  var L20: Vector3 = js.native
  var L21: Vector3 = js.native
  var L22: Vector3 = js.native
  def addLight(direction: Vector3, color: Color3, deltaSolidAngle: Double): Unit = js.native
  def scale(scale: Double): Unit = js.native
  def convertIncidentRadianceToIrradiance(): Unit = js.native
  def convertIrradianceToLambertianRadiance(): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.SphericalHarmonics")
object SphericalHarmonics extends js.Object {
  def getsphericalHarmonicsFromPolynomial(polynomial: SphericalPolynomial): SphericalHarmonics = js.native
}

@js.native
@JSGlobal("BABYLON.AbstractMesh")
class AbstractMesh extends Node with ICullable with IGetSetVerticesData {
  def this(name: String, scene: Scene) = this()
  def facetNb: Double = js.native
  var partitioningSubdivisions: Double = js.native
  var partitioningBBoxRatio: Double = js.native
  def isFacetDataEnabled: Boolean = js.native
  var onCollideObservable: Observable[AbstractMesh] = js.native
  var onCollide: js.Function0[Unit] = js.native
  var onCollisionPositionChangeObservable: Observable[Vector3] = js.native
  var onCollisionPositionChange: js.Function0[Unit] = js.native
  var onAfterWorldMatrixUpdateObservable: Observable[AbstractMesh] = js.native
  var definedFacingForward: Boolean = js.native
  var position: Vector3 = js.native
  var billboardMode: Double = js.native
  var visibility: Double = js.native
  var alphaIndex: Double = js.native
  var infiniteDistance: Boolean = js.native
  var isVisible: Boolean = js.native
  var isPickable: Boolean = js.native
  var showBoundingBox: Boolean = js.native
  var showSubMeshesBoundingBox: Boolean = js.native
  var isBlocker: Boolean = js.native
  var renderingGroupId: Double = js.native
  var material: Material = js.native
  var receiveShadows: Boolean = js.native
  var renderOutline: Boolean = js.native
  var outlineColor: Color3 = js.native
  var outlineWidth: Double = js.native
  var renderOverlay: Boolean = js.native
  var overlayColor: Color3 = js.native
  var overlayAlpha: Double = js.native
  var hasVertexAlpha: Boolean = js.native
  var useVertexColors: Boolean = js.native
  var computeBonesUsingShaders: Boolean = js.native
  var numBoneInfluencers: Double = js.native
  var applyFog: Boolean = js.native
  var scalingDeterminant: Double = js.native
  var useOctreeForRenderingSelection: Boolean = js.native
  var useOctreeForPicking: Boolean = js.native
  var useOctreeForCollisions: Boolean = js.native
  var layerMask: Double = js.native
  var alwaysSelectAsActiveMesh: Boolean = js.native
  var actionManager: ActionManager = js.native
  var physicsImpostor: PhysicsImpostor = js.native
  var ellipsoid: Vector3 = js.native
  var ellipsoidOffset: Vector3 = js.native
  var collisionMask: Double = js.native
  var collisionGroup: Double = js.native
  var edgesWidth: Double = js.native
  var edgesColor: Color4 = js.native
  var subMeshes: js.Array[SubMesh] = js.native
  var skeleton: Skeleton = js.native
  override def getClassName(): String = js.native
  def toString(fullDetails: Boolean = ???): String = js.native
  var rotation: Vector3 = js.native
  var scaling: Vector3 = js.native
  var rotationQuaternion: Quaternion = js.native
  def updatePoseMatrix(matrix: Matrix): AbstractMesh = js.native
  def getPoseMatrix(): Matrix = js.native
  def disableEdgesRendering(): AbstractMesh = js.native
  def enableEdgesRendering(epsilon: Double = ???, checkVerticesInsteadOfIndices: Boolean = ???): AbstractMesh = js.native
  def isBlocked: Boolean = js.native
  def getLOD(camera: Camera): AbstractMesh = js.native
  def getTotalVertices(): Double = js.native
  def getIndices(): IndicesArray = js.native
  def getVerticesData(kind: String): js.Array[Double] | Float32Array = js.native

  def setIndices(indices: IndicesArray, totalVertices: Double = ???): Mesh = js.native
  override def isVerticesDataPresent(kind: String): Boolean = js.native
  def getBoundingInfo(): BoundingInfo = js.native
  def setBoundingInfo(boundingInfo: BoundingInfo): AbstractMesh = js.native
  def useBones: Boolean = js.native
  override def getWorldMatrix(): Matrix = js.native
  def worldMatrixFromCache: Matrix = js.native
  def absolutePosition: Vector3 = js.native
  def freezeWorldMatrix(): AbstractMesh = js.native
  def unfreezeWorldMatrix(): this.type = js.native
  def isWorldMatrixFrozen: Boolean = js.native
  def rotate(axis: Vector3, amount: Double, space: Space = ???): AbstractMesh = js.native
  def rotateAround(point: Vector3, axis: Vector3, amount: Double): AbstractMesh = js.native
  def translate(axis: Vector3, distance: Double, space: Space = ???): AbstractMesh = js.native
  def addRotation(x: Double, y: Double, z: Double): AbstractMesh = js.native
  def getAbsolutePosition(): Vector3 = js.native
  def setAbsolutePosition(absolutePosition: Vector3): AbstractMesh = js.native
  def movePOV(amountRight: Double, amountUp: Double, amountForward: Double): AbstractMesh = js.native
  def calcMovePOV(amountRight: Double, amountUp: Double, amountForward: Double): Vector3 = js.native
  def rotatePOV(flipBack: Double, twirlClockwise: Double, tiltRight: Double): AbstractMesh = js.native
  def calcRotatePOV(flipBack: Double, twirlClockwise: Double, tiltRight: Double): Vector3 = js.native
  def setPivotMatrix(matrix: Matrix): AbstractMesh = js.native
  def getPivotMatrix(): Matrix = js.native
  def markAsDirty(property: String): AbstractMesh = js.native
  def computeWorldMatrix(force: Boolean = ???): Matrix = js.native
  def registerAfterWorldMatrixUpdate(func: js.Function1[AbstractMesh, Unit]): AbstractMesh = js.native
  def unregisterAfterWorldMatrixUpdate(func: js.Function1[AbstractMesh, Unit]): AbstractMesh = js.native
  def setPositionWithLocalVector(vector3: Vector3): AbstractMesh = js.native
  def getPositionExpressedInLocalSpace(): Vector3 = js.native
  def locallyTranslate(vector3: Vector3): AbstractMesh = js.native
  def lookAt(targetPoint: Vector3, yawCor: Double = ???, pitchCor: Double = ???, rollCor: Double = ???, space: Space = ???): AbstractMesh = js.native
  def attachToBone(bone: Bone, affectedMesh: AbstractMesh): AbstractMesh = js.native
  def detachFromBone(): AbstractMesh = js.native
  override def isInFrustum(frustumPlanes: js.Array[Plane]): Boolean = js.native
  override def isCompletelyInFrustum(frustumPlanes: js.Array[Plane]): Boolean = js.native
  def intersectsMesh(mesh: AbstractMesh | SolidParticle, precise: Boolean = ???): Boolean = js.native
  def intersectsPoint(point: Vector3): Boolean = js.native
  def getPhysicsImpostor(): PhysicsImpostor = js.native
  def getPositionInCameraSpace(camera: Camera = ???): Vector3 = js.native
  def getDistanceToCamera(camera: Camera = ???): Double = js.native
  def applyImpulse(force: Vector3, contactPoint: Vector3): AbstractMesh = js.native
  def setPhysicsLinkWith(otherMesh: Mesh, pivot1: Vector3, pivot2: Vector3, options: js.Any = ???): AbstractMesh = js.native
  var checkCollisions: Boolean = js.native
  def moveWithCollisions(velocity: Vector3): AbstractMesh = js.native
  def createOrUpdateSubmeshesOctree(maxCapacity: Double = ???, maxDepth: Double = ???): Octree[SubMesh] = js.native
  def intersects(ray: Ray, fastCheck: Boolean = ???): PickingInfo = js.native
  def clone(name: String, newParent: Node = ???, doNotCloneChildren: Boolean = ???): AbstractMesh = js.native
  def releaseSubMeshes(): AbstractMesh = js.native
  def dispose(doNotRecurse: Boolean = ???): Unit = js.native
  def getDirection(localAxis: Vector3): Vector3 = js.native
  def getDirectionToRef(localAxis: Vector3, result: Vector3): AbstractMesh = js.native
  def setPivotPoint(point: Vector3, space: Space = ???): AbstractMesh = js.native
  def getPivotPoint(): Vector3 = js.native
  def getPivotPointToRef(result: Vector3): AbstractMesh = js.native
  def getAbsolutePivotPoint(): Vector3 = js.native
  def setParent(mesh: AbstractMesh): AbstractMesh = js.native
  def addChild(mesh: AbstractMesh): AbstractMesh = js.native
  def removeChild(mesh: AbstractMesh): AbstractMesh = js.native
  def getAbsolutePivotPointToRef(result: Vector3): AbstractMesh = js.native
  def updateFacetData(): AbstractMesh = js.native
  def getFacetLocalNormals(): js.Array[Vector3] = js.native
  def getFacetLocalPositions(): js.Array[Vector3] = js.native
  def getFacetLocalPartitioning(): js.Array[js.Array[Double]] = js.native
  def getFacetPosition(i: Double): Vector3 = js.native
  def getFacetPositionToRef(i: Double, ref: Vector3): AbstractMesh = js.native
  def getFacetNormal(i: Double): Vector3 = js.native
  def getFacetNormalToRef(i: Double, ref: Vector3): this.type = js.native
  def getFacetsAtLocalCoordinates(x: Double, y: Double, z: Double): js.Array[Double] = js.native
  def getClosestFacetAtCoordinates(x: Double, y: Double, z: Double, projected: Vector3 = ???, checkFace: Boolean = ???, facing: Boolean = ???): Double = js.native
  def getClosestFacetAtLocalCoordinates(x: Double, y: Double, z: Double, projected: Vector3 = ???, checkFace: Boolean = ???, facing: Boolean = ???): Double = js.native
  def getFacetDataParameters(): js.Dynamic = js.native
  def disableFacetData(): AbstractMesh = js.native
  def createNormals(updatable: Boolean): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.AbstractMesh")
object AbstractMesh extends js.Object {
  def BILLBOARDMODE_NONE: Double = js.native
  def BILLBOARDMODE_X: Double = js.native
  def BILLBOARDMODE_Y: Double = js.native
  def BILLBOARDMODE_Z: Double = js.native
  def BILLBOARDMODE_ALL: Double = js.native
}

@js.native
@JSGlobal("BABYLON.Buffer")
class Buffer extends js.Object {
  def this(engine: js.Any, data: js.Array[Double] | Float32Array, updatable: Boolean, stride: Double, postponeInternalCreation: Boolean = ???, instanced: Boolean = ???) = this()
  def createVertexBuffer(kind: String, offset: Double, size: Double, stride: Double = ???): VertexBuffer = js.native
  def isUpdatable(): Boolean = js.native
  def getData(): js.Array[Double] | Float32Array = js.native
  def getBuffer(): WebGLBuffer = js.native
  def getStrideSize(): Double = js.native
  def getIsInstanced(): Boolean = js.native
  var instanceDivisor: Double = js.native
  def create(data: js.Array[Double] | Float32Array = ???): Unit = js.native
  def update(data: js.Array[Double] | Float32Array): Unit = js.native
  def updateDirectly(data: Float32Array, offset: Double, vertexCount: Double = ???): Unit = js.native
  def dispose(): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.CSG")
class CSG extends js.Object {
  var matrix: Matrix = js.native
  var position: Vector3 = js.native
  var rotation: Vector3 = js.native
  var rotationQuaternion: Quaternion = js.native
  var scaling: Vector3 = js.native
  override def clone(): CSG = js.native
  def union(csg: CSG): CSG = js.native
  def unionInPlace(csg: CSG): Unit = js.native
  def subtract(csg: CSG): CSG = js.native
  def subtractInPlace(csg: CSG): Unit = js.native
  def intersect(csg: CSG): CSG = js.native
  def intersectInPlace(csg: CSG): Unit = js.native
  def inverse(): CSG = js.native
  def inverseInPlace(): Unit = js.native
  def copyTransformAttributes(csg: CSG): CSG = js.native
  def buildMeshGeometry(name: String, scene: Scene, keepSubMeshes: Boolean): Mesh = js.native
  def toMesh(name: String, material: Material, scene: Scene, keepSubMeshes: Boolean): Mesh = js.native
}

@js.native
@JSGlobal("BABYLON.CSG")
object CSG extends js.Object {
  def FromMesh(mesh: Mesh): CSG = js.native
}

@js.native
@JSGlobal("BABYLON.Geometry")
class Geometry extends IGetSetVerticesData {
  def this(id: String, scene: Scene, vertexData: VertexData = ???, updatable: Boolean = ???, mesh: Mesh = ???) = this()
  var id: String = js.native
  var delayLoadState: Double = js.native
  var delayLoadingFile: String = js.native
  var onGeometryUpdated: js.Function2[Geometry, String, Unit] = js.native
  var boundingBias: Vector2 = js.native
  def extend: js.Any = js.native
  def getScene(): Scene = js.native
  def getEngine(): Engine = js.native
  def isReady(): Boolean = js.native
  def doNotSerialize: Boolean = js.native
  def setAllVerticesData(vertexData: VertexData, updatable: Boolean = ???): Unit = js.native
  def setVerticesData(kind: String, data: js.Array[Double] | Float32Array, updatable: Boolean = ???, stride: Double = ???): Unit = js.native
  def removeVerticesData(kind: String): Unit = js.native
  def setVerticesBuffer(buffer: VertexBuffer): Unit = js.native
  def updateVerticesDataDirectly(kind: String, data: Float32Array, offset: Double): Unit = js.native
  def getTotalVertices(): Double = js.native
  override def getVerticesData(kind: String, copyWhenShared: Boolean = ???, forceCopy: Boolean = ???): js.Array[Double] | Float32Array = js.native
  def getVertexBuffer(kind: String): VertexBuffer = js.native
  def getVertexBuffers(): js.Dictionary[VertexBuffer] = js.native
  override def isVerticesDataPresent(kind: String): Boolean = js.native
  def getVerticesDataKinds(): js.Array[String] = js.native
  def setIndices(indices: IndicesArray, totalVertices: Double = ???): Unit = js.native
  def getTotalIndices(): Double = js.native
  override def getIndices(copyWhenShared: Boolean = ???): IndicesArray = js.native
  def getIndexBuffer(): WebGLBuffer = js.native
  def releaseForMesh(mesh: Mesh, shouldDispose: Boolean = ???): Unit = js.native
  def applyToMesh(mesh: Mesh): Unit = js.native
  def load(scene: Scene, onLoaded: js.Function0[Unit] = ???): Unit = js.native
  def toLeftHanded(): Unit = js.native
  def isDisposed(): Boolean = js.native
  def dispose(): Unit = js.native
  def copy(id: String): Geometry = js.native
  def serialize(): js.Dynamic = js.native
  def serializeVerticeData(): js.Dynamic = js.native
}

@js.native
@JSGlobal("BABYLON.Geometry")
object Geometry extends js.Object {
  def ExtractFromMesh(mesh: Mesh, id: String): Geometry = js.native
  def RandomId(): String = js.native
  def ImportGeometry(parsedGeometry: js.Any, mesh: Mesh): Unit = js.native
  def Parse(parsedVertexData: js.Any, scene: Scene, rootUrl: String): Geometry = js.native
}

package GeometryPACKAGE {

package Primitives {

@js.native
@JSGlobal("BABYLON.Geometry.Primitives._Primitive")
class _Primitive extends Geometry {
  def this(id: String, scene: Scene, _canBeRegenerated: Boolean = ???, mesh: Mesh = ???) = this()
  def canBeRegenerated(): Boolean = js.native
  def regenerate(): Unit = js.native
  def asNewGeometry(id: String): Geometry = js.native
  override def setAllVerticesData(vertexData: VertexData, updatable: Boolean = ???): Unit = js.native
  override def copy(id: String): Geometry = js.native
  override def serialize(): js.Dynamic = js.native
}

@js.native
@JSGlobal("BABYLON.Geometry.Primitives.Ribbon")
class Ribbon extends _Primitive {
  def this(id: String, scene: Scene, pathArray: js.Array[js.Array[Vector3]], closeArray: Boolean, closePath: Boolean, offset: Double, canBeRegenerated: Boolean = ???, mesh: Mesh = ???, side: Double = ???) = this()
  var pathArray: js.Array[js.Array[Vector3]] = js.native
  var closeArray: Boolean = js.native
  var closePath: Boolean = js.native
  var offset: Double = js.native
  var side: Double = js.native
  override def copy(id: String): Geometry = js.native
}

@js.native
@JSGlobal("BABYLON.Geometry.Primitives.Box")
class Box extends _Primitive {
  def this(id: String, scene: Scene, size: Double, canBeRegenerated: Boolean = ???, mesh: Mesh = ???, side: Double = ???) = this()
  var size: Double = js.native
  var side: Double = js.native
  override def copy(id: String): Geometry = js.native
  override def serialize(): js.Dynamic = js.native
}

@js.native
@JSGlobal("BABYLON.Geometry.Primitives.Box")
object Box extends js.Object {
  def Parse(parsedBox: js.Any, scene: Scene): Box = js.native
}

@js.native
@JSGlobal("BABYLON.Geometry.Primitives.Sphere")
class Sphere extends _Primitive {
  def this(id: String, scene: Scene, segments: Double, diameter: Double, canBeRegenerated: Boolean = ???, mesh: Mesh = ???, side: Double = ???) = this()
  var segments: Double = js.native
  var diameter: Double = js.native
  var side: Double = js.native
  override def copy(id: String): Geometry = js.native
  override def serialize(): js.Dynamic = js.native
}

@js.native
@JSGlobal("BABYLON.Geometry.Primitives.Sphere")
object Sphere extends js.Object {
  def Parse(parsedSphere: js.Any, scene: Scene): GeometryPACKAGE.Primitives.Sphere = js.native
}

@js.native
@JSGlobal("BABYLON.Geometry.Primitives.Disc")
class Disc extends _Primitive {
  def this(id: String, scene: Scene, radius: Double, tessellation: Double, canBeRegenerated: Boolean = ???, mesh: Mesh = ???, side: Double = ???) = this()
  var radius: Double = js.native
  var tessellation: Double = js.native
  var side: Double = js.native
  override def copy(id: String): Geometry = js.native
}

@js.native
@JSGlobal("BABYLON.Geometry.Primitives.Cylinder")
class Cylinder extends _Primitive {
  def this(id: String, scene: Scene, height: Double, diameterTop: Double, diameterBottom: Double, tessellation: Double, subdivisions: Double = ???, canBeRegenerated: Boolean = ???, mesh: Mesh = ???, side: Double = ???) = this()
  var height: Double = js.native
  var diameterTop: Double = js.native
  var diameterBottom: Double = js.native
  var tessellation: Double = js.native
  var subdivisions: Double = js.native
  var side: Double = js.native
  override def copy(id: String): Geometry = js.native
  override def serialize(): js.Dynamic = js.native
}

@js.native
@JSGlobal("BABYLON.Geometry.Primitives.Cylinder")
object Cylinder extends js.Object {
  def Parse(parsedCylinder: js.Any, scene: Scene): GeometryPACKAGE.Primitives.Cylinder = js.native
}

@js.native
@JSGlobal("BABYLON.Geometry.Primitives.Torus")
class Torus extends _Primitive {
  def this(id: String, scene: Scene, diameter: Double, thickness: Double, tessellation: Double, canBeRegenerated: Boolean = ???, mesh: Mesh = ???, side: Double = ???) = this()
  var diameter: Double = js.native
  var thickness: Double = js.native
  var tessellation: Double = js.native
  var side: Double = js.native
  override def copy(id: String): Geometry = js.native
  override def serialize(): js.Dynamic = js.native
}

@js.native
@JSGlobal("BABYLON.Geometry.Primitives.Torus")
object Torus extends js.Object {
  def Parse(parsedTorus: js.Any, scene: Scene): GeometryPACKAGE.Primitives.Torus = js.native
}

@js.native
@JSGlobal("BABYLON.Geometry.Primitives.Ground")
class Ground extends _Primitive {
  def this(id: String, scene: Scene, width: Double, height: Double, subdivisions: Double, canBeRegenerated: Boolean = ???, mesh: Mesh = ???) = this()
  var width: Double = js.native
  var height: Double = js.native
  var subdivisions: Double = js.native
  override def copy(id: String): Geometry = js.native
  override def serialize(): js.Dynamic = js.native
}

@js.native
@JSGlobal("BABYLON.Geometry.Primitives.Ground")
object Ground extends js.Object {
  def Parse(parsedGround: js.Any, scene: Scene): GeometryPACKAGE.Primitives.Ground = js.native
}

@js.native
@JSGlobal("BABYLON.Geometry.Primitives.TiledGround")
class TiledGround extends _Primitive {
  def this(id: String, scene: Scene, xmin: Double, zmin: Double, xmax: Double, zmax: Double, subdivisions: js.Any, precision: js.Any, canBeRegenerated: Boolean = ???, mesh: Mesh = ???) = this()
  var xmin: Double = js.native
  var zmin: Double = js.native
  var xmax: Double = js.native
  var zmax: Double = js.native
  var subdivisions: js.Any = js.native
  var precision: js.Any = js.native
  override def copy(id: String): Geometry = js.native
}

@js.native
@JSGlobal("BABYLON.Geometry.Primitives.Plane")
class Plane extends _Primitive {
  def this(id: String, scene: Scene, size: Double, canBeRegenerated: Boolean = ???, mesh: Mesh = ???, side: Double = ???) = this()
  var size: Double = js.native
  var side: Double = js.native
  override def copy(id: String): Geometry = js.native
  override def serialize(): js.Dynamic = js.native
}

@js.native
@JSGlobal("BABYLON.Geometry.Primitives.Plane")
object Plane extends js.Object {
  def Parse(parsedPlane: js.Any, scene: Scene): GeometryPACKAGE.Primitives.Plane = js.native
}

@js.native
@JSGlobal("BABYLON.Geometry.Primitives.TorusKnot")
class TorusKnot extends _Primitive {
  def this(id: String, scene: Scene, radius: Double, tube: Double, radialSegments: Double, tubularSegments: Double, p: Double, q: Double, canBeRegenerated: Boolean = ???, mesh: Mesh = ???, side: Double = ???) = this()
  var radius: Double = js.native
  var tube: Double = js.native
  var radialSegments: Double = js.native
  var tubularSegments: Double = js.native
  var p: Double = js.native
  var q: Double = js.native
  var side: Double = js.native
  override def copy(id: String): Geometry = js.native
  override def serialize(): js.Dynamic = js.native
}

@js.native
@JSGlobal("BABYLON.Geometry.Primitives.TorusKnot")
object TorusKnot extends js.Object {
  def Parse(parsedTorusKnot: js.Any, scene: Scene): GeometryPACKAGE.Primitives.TorusKnot = js.native
}

}

}

@js.native
@JSGlobal("BABYLON.GroundMesh")
class GroundMesh extends Mesh {
  def this(name: String, scene: Scene) = this()
  var generateOctree: Boolean = js.native
  override def getClassName(): String = js.native
  def subdivisions: Double = js.native
  def subdivisionsX: Double = js.native
  def subdivisionsY: Double = js.native
  def optimize(chunksCount: Double, octreeBlocksSize: Double = ???): Unit = js.native
  def getHeightAtCoordinates(x: Double, z: Double): Double = js.native
  def getNormalAtCoordinates(x: Double, z: Double): Vector3 = js.native
  def getNormalAtCoordinatesToRef(x: Double, z: Double, ref: Vector3): GroundMesh = js.native
  def updateCoordinateHeights(): GroundMesh = js.native
  override def serialize(serializationObject: js.Any): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.GroundMesh")
object GroundMesh extends js.Object {
  def Parse(parsedMesh: js.Any, scene: Scene): GroundMesh = js.native
}

@js.native
@JSGlobal("BABYLON.InstancedMesh")
class InstancedMesh extends AbstractMesh {
  def this(name: String, source: Mesh) = this()
  override def getClassName(): String = js.native





  override def getTotalVertices(): Double = js.native
  def sourceMesh: Mesh = js.native

  override def setIndices(indices: IndicesArray, totalVertices: Double = ???): Mesh = js.native
  override def isVerticesDataPresent(kind: String): Boolean = js.native
  override def getIndices(): IndicesArray = js.native
  def refreshBoundingInfo(): InstancedMesh = js.native
  override def getLOD(camera: Camera): AbstractMesh = js.native
  override def dispose(doNotRecurse: Boolean = ???): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.LinesMesh")
class LinesMesh extends Mesh {
  def this(name: String, scene: Scene, parent: Node = ???, source: LinesMesh = ???, doNotCloneChildren: Boolean = ???, useVertexColor: Boolean = ???) = this()
  var useVertexColor: Boolean = js.native
  var color: Color3 = js.native
  var alpha: Double = js.native
  var intersectionThreshold: Double = js.native
  override def getClassName(): String = js.native


  override def createInstance(name: String): InstancedMesh = js.native
  override def dispose(doNotRecurse: Boolean = ???): Unit = js.native
}

@js.native
@JSGlobal("BABYLON._InstancesBatch")
class _InstancesBatch extends js.Object {
  var mustReturn: Boolean = js.native
  var visibleInstances: js.Array[js.Array[InstancedMesh]] = js.native
  var renderSelf: js.Array[Boolean] = js.native
}

@js.native
@JSGlobal("BABYLON.Mesh")
class Mesh extends AbstractMesh with IGetSetVerticesData {
  def this(name: String, scene: Scene, parent: Node = ???, source: Mesh = ???, doNotCloneChildren: Boolean = ???, clonePhysicsImpostor: Boolean = ???) = this()
  var onBeforeRenderObservable: Observable[Mesh] = js.native
  var onAfterRenderObservable: Observable[Mesh] = js.native
  var onBeforeDrawObservable: Observable[Mesh] = js.native
  var onBeforeDraw: js.Function0[Unit] = js.native
  var delayLoadState: Double = js.native
  var instances: js.Array[InstancedMesh] = js.native
  var delayLoadingFile: String = js.native
  var onLODLevelSelection: js.Function3[Double, Mesh, Mesh, Unit] = js.native
  var morphTargetManager: MorphTargetManager = js.native
  def source: Mesh = js.native
  override def getClassName(): String = js.native
  override def toString(fullDetails: Boolean = ???): String = js.native
  def hasLODLevels: Boolean = js.native
  def addLODLevel(distance: Double, mesh: Mesh): Mesh = js.native
  def getLODLevelAtDistance(distance: Double): Mesh = js.native
  def removeLODLevel(mesh: Mesh): Mesh = js.native
  def getLOD(camera: Camera, boundingSphere: BoundingSphere = ???): AbstractMesh = js.native
  def geometry: Geometry = js.native
  override def getTotalVertices(): Double = js.native
  override def getVerticesData(kind: String, copyWhenShared: Boolean = ???, forceCopy: Boolean = ???): js.Array[Double] | Float32Array = js.native
  def getVertexBuffer(kind: js.Any): VertexBuffer = js.native
  override def isVerticesDataPresent(kind: String): Boolean = js.native
  def getVerticesDataKinds(): js.Array[String] = js.native
  def getTotalIndices(): Double = js.native
  override def getIndices(copyWhenShared: Boolean = ???): IndicesArray = js.native
  override def isBlocked: Boolean = js.native
  override def isReady(): Boolean = js.native
  def isDisposed(): Boolean = js.native
  var sideOrientation: Double = js.native
  def areNormalsFrozen: Boolean = js.native
  def freezeNormals(): Mesh = js.native
  def unfreezeNormals(): Mesh = js.native
  var overridenInstanceCount: Double = js.native
  def refreshBoundingInfo(): Mesh = js.native
  def subdivide(count: Double): Unit = js.native
  def markVerticesDataAsUpdatable(kind: String, updatable: Boolean = ???): Unit = js.native
  def setVerticesBuffer(buffer: VertexBuffer): Mesh = js.native

  def updateMeshPositions(positionFunction: js.Any, computeNormals: Boolean = ???): Mesh = js.native
  def makeGeometryUnique(): Mesh = js.native
  override def setIndices(indices: IndicesArray, totalVertices: Double = ???): Mesh = js.native
  def toLeftHanded(): Mesh = js.native
  def registerBeforeRender(func: js.Function1[AbstractMesh, Unit]): Mesh = js.native
  def unregisterBeforeRender(func: js.Function1[AbstractMesh, Unit]): Mesh = js.native
  def registerAfterRender(func: js.Function1[AbstractMesh, Unit]): Mesh = js.native
  def unregisterAfterRender(func: js.Function1[AbstractMesh, Unit]): Mesh = js.native
  def render(subMesh: SubMesh, enableAlphaMode: Boolean): Mesh = js.native
  def getEmittedParticleSystems(): js.Array[ParticleSystem] = js.native
  def getHierarchyEmittedParticleSystems(): js.Array[ParticleSystem] = js.native
  override def isInFrustum(frustumPlanes: js.Array[Plane]): Boolean = js.native
  def setMaterialByID(id: String): Mesh = js.native
  def getAnimatables(): js.Array[IAnimatable] = js.native
  def bakeTransformIntoVertices(transform: Matrix): Mesh = js.native
  def bakeCurrentTransformIntoVertices(): Mesh = js.native
  override def dispose(doNotRecurse: Boolean = ???): Unit = js.native
  def applyDisplacementMap(url: String, minHeight: Double, maxHeight: Double, onSuccess: js.Function1[Mesh, Unit] = ???, uvOffset: Vector2 = ???, uvScale: Vector2 = ???): Mesh = js.native
  def applyDisplacementMapFromBuffer(buffer: Uint8Array, heightMapWidth: Double, heightMapHeight: Double, minHeight: Double, maxHeight: Double, uvOffset: Vector2 = ???, uvScale: Vector2 = ???): Mesh = js.native
  def convertToFlatShadedMesh(): Mesh = js.native
  def convertToUnIndexedMesh(): Mesh = js.native
  def flipFaces(flipNormals: Boolean = ???): Mesh = js.native
  def createInstance(name: String): InstancedMesh = js.native
  def synchronizeInstances(): Mesh = js.native
  def simplify(settings: js.Array[ISimplificationSettings], parallelProcessing: Boolean = ???, simplificationType: SimplificationType = ???, successCallback: js.Function2[Mesh, Double, Unit] = ???): Mesh = js.native
  def optimizeIndices(successCallback: js.Function1[Mesh, Unit] = ???): Mesh = js.native
  def serialize(serializationObject: js.Any): Unit = js.native
  def setPositionsForCPUSkinning(): Float32Array = js.native
  def setNormalsForCPUSkinning(): Float32Array = js.native
  def applySkeleton(skeleton: Skeleton): Mesh = js.native
}

@js.native
@JSGlobal("BABYLON.Mesh")
object Mesh extends js.Object {
  def FRONTSIDE: Double = js.native
  def BACKSIDE: Double = js.native
  def DOUBLESIDE: Double = js.native
  def DEFAULTSIDE: Double = js.native
  def NO_CAP: Double = js.native
  def CAP_START: Double = js.native
  def CAP_END: Double = js.native
  def CAP_ALL: Double = js.native
  def Parse(parsedMesh: js.Any, scene: Scene, rootUrl: String): Mesh = js.native
  def CreateRibbon(name: String, pathArray: js.Array[js.Array[Vector3]], closeArray: Boolean, closePath: Boolean, offset: Double, scene: Scene = ???, updatable: Boolean = ???, sideOrientation: Double = ???, instance: Mesh = ???): Mesh = js.native
  def CreateDisc(name: String, radius: Double, tessellation: Double, scene: Scene = ???, updatable: Boolean = ???, sideOrientation: Double = ???): Mesh = js.native
  def CreateBox(name: String, size: Double, scene: Scene = ???, updatable: Boolean = ???, sideOrientation: Double = ???): Mesh = js.native
  def CreateSphere(name: String, segments: Double, diameter: Double, scene: Scene = ???, updatable: Boolean = ???, sideOrientation: Double = ???): Mesh = js.native
  def CreateCylinder(name: String, height: Double, diameterTop: Double, diameterBottom: Double, tessellation: Double, subdivisions: js.Any, scene: Scene = ???, updatable: js.Any = ???, sideOrientation: Double = ???): Mesh = js.native
  def CreateTorus(name: String, diameter: Double, thickness: Double, tessellation: Double, scene: Scene = ???, updatable: Boolean = ???, sideOrientation: Double = ???): Mesh = js.native
  def CreateTorusKnot(name: String, radius: Double, tube: Double, radialSegments: Double, tubularSegments: Double, p: Double, q: Double, scene: Scene = ???, updatable: Boolean = ???, sideOrientation: Double = ???): Mesh = js.native
  def CreateLines(name: String, points: js.Array[Vector3], scene: Scene = ???, updatable: Boolean = ???, instance: LinesMesh = ???): LinesMesh = js.native
  def CreateDashedLines(name: String, points: js.Array[Vector3], dashSize: Double, gapSize: Double, dashNb: Double, scene: Scene = ???, updatable: Boolean = ???, instance: LinesMesh = ???): LinesMesh = js.native
  def CreatePolygon(name: String, shape: js.Array[Vector3], scene: Scene, holes: js.Array[js.Array[Vector3]] = ???, updatable: Boolean = ???, sideOrientation: Double = ???): Mesh = js.native
  def ExtrudePolygon(name: String, shape: js.Array[Vector3], depth: Double, scene: Scene, holes: js.Array[js.Array[Vector3]] = ???, updatable: Boolean = ???, sideOrientation: Double = ???): Mesh = js.native
  def ExtrudeShape(name: String, shape: js.Array[Vector3], path: js.Array[Vector3], scale: Double, rotation: Double, cap: Double, scene: Scene = ???, updatable: Boolean = ???, sideOrientation: Double = ???, instance: Mesh = ???): Mesh = js.native
  def ExtrudeShapeCustom(name: String, shape: js.Array[Vector3], path: js.Array[Vector3], scaleFunction: js.Function, rotationFunction: js.Function, ribbonCloseArray: Boolean, ribbonClosePath: Boolean, cap: Double, scene: Scene, updatable: Boolean = ???, sideOrientation: Double = ???, instance: Mesh = ???): Mesh = js.native
  def CreateLathe(name: String, shape: js.Array[Vector3], radius: Double, tessellation: Double, scene: Scene, updatable: Boolean = ???, sideOrientation: Double = ???): Mesh = js.native
  def CreatePlane(name: String, size: Double, scene: Scene, updatable: Boolean = ???, sideOrientation: Double = ???): Mesh = js.native
  def CreateGround(name: String, width: Double, height: Double, subdivisions: Double, scene: Scene = ???, updatable: Boolean = ???): Mesh = js.native
  def CreateTiledGround(name: String, xmin: Double, zmin: Double, xmax: Double, zmax: Double, subdivisions: js.Any, precision: js.Any, scene: Scene, updatable: Boolean = ???): Mesh = js.native
  def CreateGroundFromHeightMap(name: String, url: String, width: Double, height: Double, subdivisions: Double, minHeight: Double, maxHeight: Double, scene: Scene, updatable: Boolean = ???, onReady: js.Function1[GroundMesh, Unit] = ???): GroundMesh = js.native
  def CreateTube(name: String, path: js.Array[Vector3], radius: Double, tessellation: Double, radiusFunction: js.Any, cap: Double, scene: Scene, updatable: Boolean = ???, sideOrientation: Double = ???, instance: Mesh = ???): Mesh = js.native
  def CreatePolyhedron(name: String, options: js.Any, scene: Scene): Mesh = js.native
  def CreateIcoSphere(name: String, options: js.Any, scene: Scene): Mesh = js.native
  def CreateDecal(name: String, sourceMesh: AbstractMesh, position: Vector3, normal: Vector3, size: Vector3, angle: Double): Mesh = js.native
  def MinMax(meshes: js.Array[AbstractMesh]): js.Any = js.native
  def Center(meshesOrMinMaxVector: js.Any): Vector3 = js.native
  def MergeMeshes(meshes: js.Array[Mesh], disposeSource: Boolean = ???, allow32BitsIndices: Boolean = ???, meshSubclass: Mesh = ???, subdivideWithSubMeshes: Boolean = ???): Mesh = js.native
}

@js.native
trait IGetSetVerticesData extends js.Object {
  def isVerticesDataPresent(kind: String): Boolean = js.native
  def getVerticesData(kind: String, copyWhenShared: Boolean = ???, forceCopy: Boolean = ???): js.Array[Double] | Float32Array = js.native
  def getIndices(copyWhenShared: Boolean = ???): IndicesArray = js.native
  def updateVerticesData(kind: String, data: js.Array[Double] | Float32Array, updateExtends: Boolean = ???, makeItUnique: Boolean = ???): Unit = js.native
  def setIndices(indices: IndicesArray): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.VertexData")
class VertexData extends js.Object {
  var positions: js.Array[Double] | Float32Array = js.native
  var normals: js.Array[Double] | Float32Array = js.native
  var tangents: js.Array[Double] | Float32Array = js.native
  var uvs: js.Array[Double] | Float32Array = js.native
  var uvs2: js.Array[Double] | Float32Array = js.native
  var uvs3: js.Array[Double] | Float32Array = js.native
  var uvs4: js.Array[Double] | Float32Array = js.native
  var uvs5: js.Array[Double] | Float32Array = js.native
  var uvs6: js.Array[Double] | Float32Array = js.native
  var colors: js.Array[Double] | Float32Array = js.native
  var matricesIndices: js.Array[Double] | Float32Array = js.native
  var matricesWeights: js.Array[Double] | Float32Array = js.native
  var matricesIndicesExtra: js.Array[Double] | Float32Array = js.native
  var matricesWeightsExtra: js.Array[Double] | Float32Array = js.native
  var indices: IndicesArray = js.native
  def set(data: js.Array[Double] | Float32Array, kind: String): Unit = js.native
  def applyToMesh(mesh: Mesh, updatable: Boolean = ???): VertexData = js.native
  def applyToGeometry(geometry: Geometry, updatable: Boolean = ???): VertexData = js.native
  def updateMesh(mesh: Mesh, updateExtends: Boolean = ???, makeItUnique: Boolean = ???): VertexData = js.native
  def updateGeometry(geometry: Geometry, updateExtends: Boolean = ???, makeItUnique: Boolean = ???): VertexData = js.native
  def transform(matrix: Matrix): VertexData = js.native
  def merge(other: VertexData): VertexData = js.native
  def serialize(): js.Dynamic = js.native
}

@js.native
@JSGlobal("BABYLON.VertexData")
object VertexData extends js.Object {
  def ExtractFromMesh(mesh: Mesh, copyWhenShared: Boolean = ???, forceCopy: Boolean = ???): VertexData = js.native
  def ExtractFromGeometry(geometry: Geometry, copyWhenShared: Boolean = ???, forceCopy: Boolean = ???): VertexData = js.native
  def CreateRibbon(options: js.Any): VertexData = js.native
  def CreateBox(options: js.Any): VertexData = js.native
  def CreateSphere(options: js.Any): VertexData = js.native
  def CreateCylinder(options: js.Any): VertexData = js.native
  def CreateTorus(options: js.Any): VertexData = js.native
  def CreateLineSystem(options: js.Any): VertexData = js.native
  def CreateDashedLines(options: js.Any): VertexData = js.native
  def CreateGround(options: js.Any): VertexData = js.native
  def CreateTiledGround(options: js.Any): VertexData = js.native
  def CreateGroundFromHeightMap(options: js.Any): VertexData = js.native
  def CreatePlane(options: js.Any): VertexData = js.native
  def CreateDisc(options: js.Any): VertexData = js.native
  def CreatePolygon(polygon: Mesh, sideOrientation: Double, fUV: js.Any = ???, fColors: js.Any = ???, frontUVs: Vector4 = ???, backUVs: Vector4 = ???): VertexData = js.native
  def CreateIcoSphere(options: js.Any): VertexData = js.native
  def CreatePolyhedron(options: js.Any): VertexData = js.native
  def CreateTorusKnot(options: js.Any): VertexData = js.native
  def ComputeNormals(positions: js.Any, indices: js.Any, normals: js.Any, options: js.Any = ???): Unit = js.native
  def ImportVertexData(parsedVertexData: js.Any, geometry: Geometry): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.MeshBuilder")
class MeshBuilder extends js.Object {
}

@js.native
@JSGlobal("BABYLON.MeshBuilder")
object MeshBuilder extends js.Object {
  def CreateBox(name: String, options: js.Any, scene: Scene): Mesh = js.native
  def CreateSphere(name: String, options: js.Any, scene: js.Any): Mesh = js.native
  def CreateDisc(name: String, options: js.Any, scene: Scene): Mesh = js.native
  def CreateIcoSphere(name: String, options: js.Any, scene: Scene): Mesh = js.native
  def CreateRibbon(name: String, options: js.Any, scene: Scene = ???): Mesh = js.native
  def CreateCylinder(name: String, options: js.Any, scene: js.Any): Mesh = js.native
  def CreateTorus(name: String, options: js.Any, scene: js.Any): Mesh = js.native
  def CreateTorusKnot(name: String, options: js.Any, scene: js.Any): Mesh = js.native
  def CreateLineSystem(name: String, options: js.Any, scene: Scene): LinesMesh = js.native
  def CreateLines(name: String, options: js.Any, scene: Scene): LinesMesh = js.native
  def CreateDashedLines(name: String, options: js.Any, scene: Scene): LinesMesh = js.native
  def ExtrudeShape(name: String, options: js.Any, scene: Scene): Mesh = js.native
  def ExtrudeShapeCustom(name: String, options: js.Any, scene: Scene): Mesh = js.native
  def CreateLathe(name: String, options: js.Any, scene: Scene): Mesh = js.native
  def CreatePlane(name: String, options: js.Any, scene: Scene): Mesh = js.native
  def CreateGround(name: String, options: js.Any, scene: js.Any): Mesh = js.native
  def CreateTiledGround(name: String, options: js.Any, scene: Scene): Mesh = js.native
  def CreateGroundFromHeightMap(name: String, url: String, options: js.Any, scene: Scene): GroundMesh = js.native
  def CreatePolygon(name: String, options: js.Any, scene: Scene): Mesh = js.native
  def ExtrudePolygon(name: String, options: js.Any, scene: Scene): Mesh = js.native
  def CreateTube(name: String, options: js.Any, scene: Scene): Mesh = js.native
  def CreatePolyhedron(name: String, options: js.Any, scene: Scene): Mesh = js.native
  def CreateDecal(name: String, sourceMesh: AbstractMesh, options: js.Any): Mesh = js.native
}

package Internals {

  import scala.scalajs.js.annotation.JSName

  @js.native
@JSGlobal("BABYLON.Internals.MeshLODLevel")
class MeshLODLevel extends js.Object {
  def this(distance: Double, mesh: Mesh) = this()
  var distance: Double = js.native
  var mesh: Mesh = js.native
}

@js.native
@JSGlobal("BABYLON.Internals._AlphaState")
class _AlphaState extends js.Object {
  def isDirty: Boolean = js.native
  var alphaBlend: Boolean = js.native
  def setAlphaBlendConstants(r: Double, g: Double, b: Double, a: Double): Unit = js.native
  def setAlphaBlendFunctionParameters(value0: Double, value1: Double, value2: Double, value3: Double): Unit = js.native
  def setAlphaEquationParameters(rgb: Double, alpha: js.Any): Unit = js.native
  def reset(): Unit = js.native
  @JSName("apply")
  def apply(gl: WebGLRenderingContext): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.Internals._DepthCullingState")
class _DepthCullingState extends js.Object {
  def isDirty: Boolean = js.native
  var zOffset: Double = js.native
  var cullFace: Double = js.native
  var cull: Boolean = js.native
  var depthFunc: Double = js.native
  var depthMask: Boolean = js.native
  var depthTest: Boolean = js.native
  def reset(): Unit = js.native
  @JSName("apply")
  def apply(gl: WebGLRenderingContext): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.Internals._StencilState")
class _StencilState extends js.Object {
  def isDirty: Boolean = js.native
  var stencilFunc: Double = js.native
  var stencilFuncRef: Double = js.native
  var stencilFuncMask: Double = js.native
  var stencilOpStencilFail: Double = js.native
  var stencilOpDepthFail: Double = js.native
  var stencilOpStencilDepthPass: Double = js.native
  var stencilMask: Double = js.native
  var stencilTest: Boolean = js.native
  def reset(): Unit = js.native
  @JSName("apply")
  def apply(gl: WebGLRenderingContext): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.Internals.AndOrNotEvaluator")
class AndOrNotEvaluator extends js.Object {
}

@js.native
@JSGlobal("BABYLON.Internals.AndOrNotEvaluator")
object AndOrNotEvaluator extends js.Object {
  def Eval(query: String, evaluateCallback: js.Function1[js.Any, Boolean]): Boolean = js.native
}

@js.native
trait DDSInfo extends js.Object {
  var width: Double = js.native
  var height: Double = js.native
  var mipmapCount: Double = js.native
  var isFourCC: Boolean = js.native
  var isRGB: Boolean = js.native
  var isLuminance: Boolean = js.native
  var isCube: Boolean = js.native
  var isCompressed: Boolean = js.native
  var dxgiFormat: Double = js.native
  var textureType: Double = js.native
}

@js.native
@JSGlobal("BABYLON.Internals.DDSTools")
class DDSTools extends js.Object {
}

@js.native
@JSGlobal("BABYLON.Internals.DDSTools")
object DDSTools extends js.Object {
  var StoreLODInAlphaChannel: Boolean = js.native
  def GetDDSInfo(arrayBuffer: js.Any): DDSInfo = js.native
  def UploadDDSLevels(engine: Engine, arrayBuffer: js.Any, info: DDSInfo, loadMipmaps: Boolean, faces: Double, lodIndex: Double = ???): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.Internals.KhronosTextureContainer")
class KhronosTextureContainer extends js.Object {
  def this(arrayBuffer: js.Any, facesExpected: Double, threeDExpected: Boolean = ???, textureArrayExpected: Boolean = ???) = this()
  var arrayBuffer: js.Any = js.native
  var glType: Double = js.native
  var glTypeSize: Double = js.native
  var glFormat: Double = js.native
  var glInternalFormat: Double = js.native
  var glBaseInternalFormat: Double = js.native
  var pixelWidth: Double = js.native
  var pixelHeight: Double = js.native
  var pixelDepth: Double = js.native
  var numberOfArrayElements: Double = js.native
  var numberOfFaces: Double = js.native
  var numberOfMipmapLevels: Double = js.native
  var bytesOfKeyValueData: Double = js.native
  var loadType: Double = js.native
  def switchEndainness(`val`: Double): Double = js.native
  def uploadLevels(gl: WebGLRenderingContext, loadMipmaps: Boolean): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.Internals.KhronosTextureContainer")
object KhronosTextureContainer extends js.Object {
  var HEADER_LEN: Double = js.native
  var COMPRESSED_2D: Double = js.native
  var COMPRESSED_3D: Double = js.native
  var TEX_2D: Double = js.native
  var TEX_3D: Double = js.native
}

@js.native
@JSGlobal("BABYLON.Internals.TGATools")
class TGATools extends js.Object {
}

@js.native
@JSGlobal("BABYLON.Internals.TGATools")
object TGATools extends js.Object {
  def GetTGAHeader(data: Uint8Array): js.Dynamic = js.native
  def UploadContent(gl: WebGLRenderingContext, data: Uint8Array): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.Internals.PBRBaseSimpleMaterial")
abstract class PBRBaseSimpleMaterial extends PBRBaseMaterial {
  def this(name: String, scene: Scene) = this()
  var maxSimultaneousLights: Double = js.native
  var disableLighting: Boolean = js.native
  var environmentTexture: BaseTexture = js.native
  var invertNormalMapX: Boolean = js.native
  var invertNormalMapY: Boolean = js.native
  var normalTexture: BaseTexture = js.native
  var emissiveColor: Color3 = js.native
  var emissiveTexture: BaseTexture = js.native
  var occlusionStrength: Double = js.native
  var occlusionTexture: BaseTexture = js.native
  var alphaCutOff: Double = js.native
  protected var _transparencyMode: Double = js.native
  var transparencyMode: Double = js.native
  var doubleSided: Boolean = js.native
  override def needAlphaBlending(): Boolean = js.native
  override def needAlphaTesting(): Boolean = js.native
}

@js.native
@JSGlobal("BABYLON.Internals.CubeMapToSphericalPolynomialTools")
class CubeMapToSphericalPolynomialTools extends js.Object {
}

@js.native
@JSGlobal("BABYLON.Internals.CubeMapToSphericalPolynomialTools")
object CubeMapToSphericalPolynomialTools extends js.Object {
  def ConvertCubeMapTextureToSphericalPolynomial(texture: BaseTexture): SphericalPolynomial = js.native
  def ConvertCubeMapToSphericalPolynomial(cubeInfo: CubeMapInfo): SphericalPolynomial = js.native
}

@js.native
trait HDRInfo extends js.Object {
  var height: Double = js.native
  var width: Double = js.native
  var dataPosition: Double = js.native
}

@js.native
@JSGlobal("BABYLON.Internals.HDRTools")
class HDRTools extends js.Object {
}

@js.native
@JSGlobal("BABYLON.Internals.HDRTools")
object HDRTools extends js.Object {
  def RGBE_ReadHeader(uint8array: Uint8Array): HDRInfo = js.native
  def GetCubeMapTextureData(buffer: ArrayBuffer, size: Double): CubeMapInfo = js.native
  def RGBE_ReadPixels(uint8array: Uint8Array, hdrInfo: HDRInfo): Float32Array = js.native
}

@js.native
trait CubeMapInfo extends js.Object {
  var front: ArrayBufferView = js.native
  var back: ArrayBufferView = js.native
  var left: ArrayBufferView = js.native
  var right: ArrayBufferView = js.native
  var up: ArrayBufferView = js.native
  var down: ArrayBufferView = js.native
  var size: Double = js.native
  var format: Double = js.native
  var `type`: Double = js.native
  var gammaSpace: Boolean = js.native
}

@js.native
@JSGlobal("BABYLON.Internals.PanoramaToCubeMapTools")
class PanoramaToCubeMapTools extends js.Object {
}

@js.native
@JSGlobal("BABYLON.Internals.PanoramaToCubeMapTools")
object PanoramaToCubeMapTools extends js.Object {
  def ConvertPanoramaToCubemap(float32Array: Float32Array, inputWidth: Double, inputHeight: Double, size: Double): CubeMapInfo = js.native
}

}

@js.native
trait ISimplifier extends js.Object {
  def simplify(settings: ISimplificationSettings, successCallback: js.Function1[Mesh, Unit], errorCallback: js.Function0[Unit] = ???): Unit = js.native
}

@js.native
trait ISimplificationSettings extends js.Object {
  var quality: Double = js.native
  var distance: Double = js.native
  var optimizeMesh: Boolean = js.native
}

@js.native
@JSGlobal("BABYLON.SimplificationSettings")
class SimplificationSettings extends ISimplificationSettings {
  def this(quality: Double, distance: Double, optimizeMesh: Boolean = ???) = this()



}

@js.native
trait ISimplificationTask extends js.Object {
  var settings: js.Array[ISimplificationSettings] = js.native
  var simplificationType: SimplificationType = js.native
  var mesh: Mesh = js.native
  var successCallback: js.Function0[Unit] = js.native
  var parallelProcessing: Boolean = js.native
}

@js.native
@JSGlobal("BABYLON.SimplificationQueue")
class SimplificationQueue extends js.Object {
  var running: js.Any = js.native
  def addTask(task: ISimplificationTask): Unit = js.native
  def executeNext(): Unit = js.native
  def runSimplification(task: ISimplificationTask): Unit = js.native
}

@js.native
sealed trait SimplificationType extends js.Object {
}

@js.native
@JSGlobal("BABYLON.SimplificationType")
object SimplificationType extends js.Object {
  var QUADRATIC: SimplificationType = js.native
  @JSBracketAccess
  def apply(value: SimplificationType): String = js.native
}

@js.native
@JSGlobal("BABYLON.DecimationTriangle")
class DecimationTriangle extends js.Object {
  def this(vertices: js.Array[DecimationVertex]) = this()
  var vertices: js.Array[DecimationVertex] = js.native
  var normal: Vector3 = js.native
  var error: js.Array[Double] = js.native
  var deleted: Boolean = js.native
  var isDirty: Boolean = js.native
  var borderFactor: Double = js.native
  var deletePending: Boolean = js.native
  var originalOffset: Double = js.native
}

@js.native
@JSGlobal("BABYLON.DecimationVertex")
class DecimationVertex extends js.Object {
  def this(position: Vector3, id: js.Any) = this()
  var position: Vector3 = js.native
  var id: js.Any = js.native
  var q: QuadraticMatrix = js.native
  var isBorder: Boolean = js.native
  var triangleStart: Double = js.native
  var triangleCount: Double = js.native
  var originalOffsets: js.Array[Double] = js.native
  def updatePosition(newPosition: Vector3): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.QuadraticMatrix")
class QuadraticMatrix extends js.Object {
  def this(data: js.Array[Double] = ???) = this()
  var data: js.Array[Double] = js.native
  def det(a11: js.Any, a12: js.Any, a13: js.Any, a21: js.Any, a22: js.Any, a23: js.Any, a31: js.Any, a32: js.Any, a33: js.Any): Double = js.native
  def addInPlace(matrix: QuadraticMatrix): Unit = js.native
  def addArrayInPlace(data: js.Array[Double]): Unit = js.native
  def add(matrix: QuadraticMatrix): QuadraticMatrix = js.native
}

@js.native
@JSGlobal("BABYLON.QuadraticMatrix")
object QuadraticMatrix extends js.Object {
  def FromData(a: Double, b: Double, c: Double, d: Double): QuadraticMatrix = js.native
  def DataFromNumbers(a: Double, b: Double, c: Double, d: Double): js.Array[Double] = js.native
}

@js.native
@JSGlobal("BABYLON.Reference")
class Reference extends js.Object {
  def this(vertexId: Double, triangleId: Double) = this()
  var vertexId: Double = js.native
  var triangleId: Double = js.native
}

@js.native
@JSGlobal("BABYLON.QuadraticErrorSimplification")
class QuadraticErrorSimplification extends ISimplifier {
  def this(_mesh: Mesh) = this()
  var syncIterations: Double = js.native
  var aggressiveness: Double = js.native
  var decimationIterations: Double = js.native
  var boundingBoxEpsilon: Double = js.native
  def simplify(settings: ISimplificationSettings, successCallback: js.Function1[Mesh, Unit]): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.Polygon")
class Polygon extends js.Object {
}

@js.native
@JSGlobal("BABYLON.Polygon")
object Polygon extends js.Object {
  def Rectangle(xmin: Double, ymin: Double, xmax: Double, ymax: Double): js.Array[Vector2] = js.native
  def Circle(radius: Double, cx: Double = ???, cy: Double = ???, numberOfSides: Double = ???): js.Array[Vector2] = js.native
  def Parse(input: String): js.Array[Vector2] = js.native
  def StartingAt(x: Double, y: Double): Path2 = js.native
}

@js.native
@JSGlobal("BABYLON.PolygonMeshBuilder")
class PolygonMeshBuilder extends js.Object {
  def this(name: String, contours: Path2, scene: Scene) = this()
  def this(name: String, contours: js.Array[Vector2], scene: Scene) = this()
  def addHole(hole: js.Array[Vector2]): PolygonMeshBuilder = js.native
  def build(updatable: Boolean = ???, depth: Double = ???): Mesh = js.native
}

@js.native
@JSGlobal("BABYLON.BaseSubMesh")
class BaseSubMesh extends js.Object {
  def effect: Effect = js.native
  def setEffect(effect: Effect, defines: MaterialDefines = ???): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.SubMesh")
class SubMesh extends BaseSubMesh with ICullable {
  def this(materialIndex: Double, verticesStart: Double, verticesCount: Double, indexStart: js.Any, indexCount: Double, mesh: AbstractMesh, renderingMesh: Mesh = ???, createBoundingBox: Boolean = ???) = this()
  var materialIndex: Double = js.native
  var verticesStart: Double = js.native
  var verticesCount: Double = js.native
  var indexStart: js.Any = js.native
  var indexCount: Double = js.native
  var linesIndexCount: Double = js.native
  def IsGlobal: Boolean = js.native
  def getBoundingInfo(): BoundingInfo = js.native
  def setBoundingInfo(boundingInfo: BoundingInfo): SubMesh = js.native
  def getMesh(): AbstractMesh = js.native
  def getRenderingMesh(): Mesh = js.native
  def getMaterial(): Material = js.native
  def refreshBoundingInfo(): SubMesh = js.native
  def updateBoundingInfo(world: Matrix): SubMesh = js.native
  override def isInFrustum(frustumPlanes: js.Array[Plane]): Boolean = js.native
  override def isCompletelyInFrustum(frustumPlanes: js.Array[Plane]): Boolean = js.native
  def render(enableAlphaMode: Boolean): SubMesh = js.native
  def getLinesIndexBuffer(indices: IndicesArray, engine: Engine): WebGLBuffer = js.native
  def canIntersects(ray: Ray): Boolean = js.native
  def intersects(ray: Ray, positions: js.Array[Vector3], indices: IndicesArray, fastCheck: Boolean = ???): IntersectionInfo = js.native
  def dispose(): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.SubMesh")
object SubMesh extends js.Object {
  def CreateFromIndices(materialIndex: Double, startIndex: Double, indexCount: Double, mesh: AbstractMesh, renderingMesh: Mesh = ???): SubMesh = js.native
}

@js.native
@JSGlobal("BABYLON.VertexBuffer")
class VertexBuffer extends js.Object {
  def this(engine: js.Any, data: js.Array[Double] | Float32Array | Buffer, kind: String, updatable: Boolean, postponeInternalCreation: Boolean = ???, stride: Double = ???, instanced: Boolean = ???, offset: Double = ???, size: Double = ???) = this()
  def getKind(): String = js.native
  def isUpdatable(): Boolean = js.native
  def getData(): js.Array[Double] | Float32Array = js.native
  def getBuffer(): WebGLBuffer = js.native
  def getStrideSize(): Double = js.native
  def getOffset(): Double = js.native
  def getSize(): Double = js.native
  def getIsInstanced(): Boolean = js.native
  def getInstanceDivisor(): Double = js.native
  def create(data: js.Array[Double] | Float32Array = ???): Unit = js.native
  def update(data: js.Array[Double] | Float32Array): Unit = js.native
  def updateDirectly(data: Float32Array, offset: Double): Unit = js.native
  def dispose(): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.VertexBuffer")
object VertexBuffer extends js.Object {
  def PositionKind: String = js.native
  def NormalKind: String = js.native
  def TangentKind: String = js.native
  def UVKind: String = js.native
  def UV2Kind: String = js.native
  def UV3Kind: String = js.native
  def UV4Kind: String = js.native
  def UV5Kind: String = js.native
  def UV6Kind: String = js.native
  def ColorKind: String = js.native
  def MatricesIndicesKind: String = js.native
  def MatricesWeightsKind: String = js.native
  def MatricesIndicesExtraKind: String = js.native
  def MatricesWeightsExtraKind: String = js.native
}

@js.native
@JSGlobal("BABYLON.MorphTarget")
class MorphTarget extends js.Object {
  def this(name: String, influence: Double = ???) = this()
  var name: String = js.native
  var animations: js.Array[Animation] = js.native
  var onInfluenceChanged: Observable[Boolean] = js.native
  var influence: Double = js.native
  def hasNormals: Boolean = js.native
  def hasTangents: Boolean = js.native
  def setPositions(data: Float32Array | js.Array[Double]): Unit = js.native
  def getPositions(): Float32Array = js.native
  def setNormals(data: Float32Array | js.Array[Double]): Unit = js.native
  def getNormals(): Float32Array = js.native
  def setTangents(data: Float32Array | js.Array[Double]): Unit = js.native
  def getTangents(): Float32Array = js.native
  def serialize(): js.Dynamic = js.native
}

@js.native
@JSGlobal("BABYLON.MorphTarget")
object MorphTarget extends js.Object {
  def Parse(serializationObject: js.Any): MorphTarget = js.native
  def FromMesh(mesh: AbstractMesh, name: String = ???, influence: Double = ???): MorphTarget = js.native
}

@js.native
@JSGlobal("BABYLON.MorphTargetManager")
class MorphTargetManager extends js.Object {
  def this(scene: Scene = ???) = this()
  def uniqueId: Double = js.native
  def vertexCount: Double = js.native
  def supportsNormals: Boolean = js.native
  def supportsTangents: Boolean = js.native
  def numTargets: Double = js.native
  def numInfluencers: Double = js.native
  def influences: Float32Array = js.native
  def getActiveTarget(index: Double): MorphTarget = js.native
  def getTarget(index: Double): MorphTarget = js.native
  def addTarget(target: MorphTarget): Unit = js.native
  def removeTarget(target: MorphTarget): Unit = js.native
  def serialize(): js.Dynamic = js.native
}

@js.native
@JSGlobal("BABYLON.MorphTargetManager")
object MorphTargetManager extends js.Object {
  def Parse(serializationObject: js.Any, scene: Scene): MorphTargetManager = js.native
}

@js.native
@JSGlobal("BABYLON.Particle")
class Particle extends js.Object {
  var position: Vector3 = js.native
  var direction: Vector3 = js.native
  var color: Color4 = js.native
  var colorStep: Color4 = js.native
  var lifeTime: Double = js.native
  var age: Double = js.native
  var size: Double = js.native
  var angle: Double = js.native
  var angularSpeed: Double = js.native
  def copyTo(other: Particle): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.ParticleSystem")
class ParticleSystem extends IDisposable with IAnimatable {
  def this(name: String, capacity: Double, scene: Scene, customEffect: Effect = ???) = this()
  var name: String = js.native

  var id: String = js.native
  var renderingGroupId: Double = js.native
  var emitter: js.Any = js.native
  var emitRate: Double = js.native
  var manualEmitCount: Double = js.native
  var updateSpeed: Double = js.native
  var targetStopDuration: Double = js.native
  var disposeOnStop: Boolean = js.native
  var minEmitPower: Double = js.native
  var maxEmitPower: Double = js.native
  var minLifeTime: Double = js.native
  var maxLifeTime: Double = js.native
  var minSize: Double = js.native
  var maxSize: Double = js.native
  var minAngularSpeed: Double = js.native
  var maxAngularSpeed: Double = js.native
  var particleTexture: Texture = js.native
  var layerMask: Double = js.native
  var customShader: js.Any = js.native
  var preventAutoStart: Boolean = js.native
  var onDisposeObservable: Observable[ParticleSystem] = js.native
  var onDispose: js.Function0[Unit] = js.native
  var updateFunction: js.Function1[js.Array[Particle], Unit] = js.native
  var blendMode: Double = js.native
  var forceDepthWrite: Boolean = js.native
  var gravity: Vector3 = js.native
  var direction1: Vector3 = js.native
  var direction2: Vector3 = js.native
  var minEmitBox: Vector3 = js.native
  var maxEmitBox: Vector3 = js.native
  var color1: Color4 = js.native
  var color2: Color4 = js.native
  var colorDead: Color4 = js.native
  var textureMask: Color4 = js.native
  var startDirectionFunction: js.Function4[Double, Matrix, Vector3, Particle, Unit] = js.native
  var startPositionFunction: js.Function3[Matrix, Vector3, Particle, Unit] = js.native
  def recycleParticle(particle: Particle): Unit = js.native
  def getCapacity(): Double = js.native
  def isAlive(): Boolean = js.native
  def isStarted(): Boolean = js.native
  def start(): Unit = js.native
  def stop(): Unit = js.native
  def animate(): Unit = js.native
  def render(): Double = js.native
  override def dispose(): Unit = js.native
  def clone(name: String, newEmitter: js.Any): ParticleSystem = js.native
  def serialize(): js.Dynamic = js.native
}

@js.native
@JSGlobal("BABYLON.ParticleSystem")
object ParticleSystem extends js.Object {
  var BLENDMODE_ONEONE: Double = js.native
  var BLENDMODE_STANDARD: Double = js.native
  def Parse(parsedParticleSystem: js.Any, scene: Scene, rootUrl: String): ParticleSystem = js.native
}

@js.native
@JSGlobal("BABYLON.SolidParticle")
class SolidParticle extends js.Object {
  def this(particleIndex: Double, positionIndex: Double, model: ModelShape, shapeId: Double, idxInShape: Double, sps: SolidParticleSystem, modelBoundingInfo: BoundingInfo = ???) = this()
  var idx: Double = js.native
  var color: Color4 = js.native
  var position: Vector3 = js.native
  var rotation: Vector3 = js.native
  var rotationQuaternion: Quaternion = js.native
  var scaling: Vector3 = js.native
  var uvs: Vector4 = js.native
  var velocity: Vector3 = js.native
  var alive: Boolean = js.native
  var isVisible: Boolean = js.native
  var shapeId: Double = js.native
  var idxInShape: Double = js.native
  var scale: Vector3 = js.native
  var quaternion: Quaternion = js.native
  def intersectsMesh(target: Mesh | SolidParticle): Boolean = js.native
}

@js.native
@JSGlobal("BABYLON.ModelShape")
class ModelShape extends js.Object {
  def this(id: Double, shape: js.Array[Vector3], shapeUV: js.Array[Double], posFunction: js.Function3[SolidParticle, Double, Double, Unit], vtxFunction: js.Function3[SolidParticle, Vector3, Double, Unit]) = this()
  var shapeID: Double = js.native
}

@js.native
@JSGlobal("BABYLON.SolidParticleSystem")
class SolidParticleSystem extends IDisposable {
  def this(name: String, scene: Scene, options: js.Any = ???) = this()
  var particles: js.Array[SolidParticle] = js.native
  var nbParticles: Double = js.native
  var billboard: Boolean = js.native
  var recomputeNormals: Boolean = js.native
  var counter: Double = js.native
  var name: String = js.native
  var mesh: Mesh = js.native
  var vars: js.Any = js.native
  var pickedParticles: js.Array[js.Any] = js.native
  def buildMesh(): Mesh = js.native
  def digest(mesh: Mesh, options: js.Any = ???): SolidParticleSystem = js.native
  def addShape(mesh: Mesh, nb: Double, options: js.Any = ???): Double = js.native
  def rebuildMesh(): SolidParticleSystem = js.native
  def setParticles(start: Double = ???, end: Double = ???, update: Boolean = ???): SolidParticleSystem = js.native
  override def dispose(): Unit = js.native
  def refreshVisibleSize(): SolidParticleSystem = js.native
  def setVisibilityBox(size: Double): Unit = js.native
  var isAlwaysVisible: Boolean = js.native
  var isVisibilityBoxLocked: Boolean = js.native
  var computeParticleRotation: Boolean = js.native
  var computeParticleColor: Boolean = js.native
  var computeParticleTexture: Boolean = js.native
  var computeParticleVertex: Boolean = js.native
  var computeBoundingBox: Boolean = js.native
  def initParticles(): Unit = js.native
  def recycleParticle(particle: SolidParticle): SolidParticle = js.native
  def updateParticle(particle: SolidParticle): SolidParticle = js.native
  def updateParticleVertex(particle: SolidParticle, vertex: Vector3, pt: Double): Vector3 = js.native
  def beforeUpdateParticles(start: Double = ???, stop: Double = ???, update: Boolean = ???): Unit = js.native
  def afterUpdateParticles(start: Double = ???, stop: Double = ???, update: Boolean = ???): Unit = js.native
}

@js.native
trait PhysicsImpostorJoint extends js.Object {
  var mainImpostor: PhysicsImpostor = js.native
  var connectedImpostor: PhysicsImpostor = js.native
  var joint: PhysicsJoint = js.native
}

@js.native
@JSGlobal("BABYLON.PhysicsEngine")
class PhysicsEngine extends js.Object {
  def this(gravity: Vector3 = ???, _physicsPlugin: IPhysicsEnginePlugin = ???) = this()
  var gravity: Vector3 = js.native
  def setGravity(gravity: Vector3): Unit = js.native
  def setTimeStep(newTimeStep: Double = ???): Unit = js.native
  def dispose(): Unit = js.native
  def getPhysicsPluginName(): String = js.native
  def addImpostor(impostor: PhysicsImpostor): Unit = js.native
  def removeImpostor(impostor: PhysicsImpostor): Unit = js.native
  def addJoint(mainImpostor: PhysicsImpostor, connectedImpostor: PhysicsImpostor, joint: PhysicsJoint): Unit = js.native
  def removeJoint(mainImpostor: PhysicsImpostor, connectedImpostor: PhysicsImpostor, joint: PhysicsJoint): Unit = js.native
  def getPhysicsPlugin(): IPhysicsEnginePlugin = js.native
  def getImpostorForPhysicsObject(`object`: IPhysicsEnabledObject): PhysicsImpostor = js.native
  def getImpostorWithPhysicsBody(body: js.Any): PhysicsImpostor = js.native
}

@js.native
@JSGlobal("BABYLON.PhysicsEngine")
object PhysicsEngine extends js.Object {
  var Epsilon: Double = js.native
}

@js.native
trait IPhysicsEnginePlugin extends js.Object {
  var world: js.Any = js.native
  var name: String = js.native
  def setGravity(gravity: Vector3): js.Dynamic = js.native
  def setTimeStep(timeStep: Double): js.Dynamic = js.native
  def executeStep(delta: Double, impostors: js.Array[PhysicsImpostor]): Unit = js.native
  def applyImpulse(impostor: PhysicsImpostor, force: Vector3, contactPoint: Vector3): js.Dynamic = js.native
  def applyForce(impostor: PhysicsImpostor, force: Vector3, contactPoint: Vector3): js.Dynamic = js.native
  def generatePhysicsBody(impostor: PhysicsImpostor): js.Dynamic = js.native
  def removePhysicsBody(impostor: PhysicsImpostor): js.Dynamic = js.native
  def generateJoint(joint: PhysicsImpostorJoint): js.Dynamic = js.native
  def removeJoint(joint: PhysicsImpostorJoint): js.Dynamic = js.native
  def isSupported(): Boolean = js.native
  def setTransformationFromPhysicsBody(impostor: PhysicsImpostor): js.Dynamic = js.native
  def setPhysicsBodyTransformation(impostor: PhysicsImpostor, newPosition: Vector3, newRotation: Quaternion): js.Dynamic = js.native
  def setLinearVelocity(impostor: PhysicsImpostor, velocity: Vector3): js.Dynamic = js.native
  def setAngularVelocity(impostor: PhysicsImpostor, velocity: Vector3): js.Dynamic = js.native
  def getLinearVelocity(impostor: PhysicsImpostor): Vector3 = js.native
  def getAngularVelocity(impostor: PhysicsImpostor): Vector3 = js.native
  def setBodyMass(impostor: PhysicsImpostor, mass: Double): js.Dynamic = js.native
  def getBodyMass(impostor: PhysicsImpostor): js.Dynamic = js.native
  def getBodyFriction(impostor: PhysicsImpostor): js.Dynamic = js.native
  def setBodyFriction(impostor: PhysicsImpostor, friction: Double): js.Dynamic = js.native
  def getBodyRestitution(impostor: PhysicsImpostor): js.Dynamic = js.native
  def setBodyRestitution(impostor: PhysicsImpostor, restitution: Double): js.Dynamic = js.native
  def sleepBody(impostor: PhysicsImpostor): js.Dynamic = js.native
  def wakeUpBody(impostor: PhysicsImpostor): js.Dynamic = js.native
  def updateDistanceJoint(joint: PhysicsJoint, maxDistance: Double, minDistance: Double = ???): js.Dynamic = js.native
  def setMotor(joint: IMotorEnabledJoint, speed: Double, maxForce: Double = ???, motorIndex: Double = ???): js.Dynamic = js.native
  def setLimit(joint: IMotorEnabledJoint, upperLimit: Double, lowerLimit: Double = ???, motorIndex: Double = ???): js.Dynamic = js.native
  def getRadius(impostor: PhysicsImpostor): Double = js.native
  def getBoxSizeToRef(impostor: PhysicsImpostor, result: Vector3): js.Dynamic = js.native
  def syncMeshWithImpostor(mesh: AbstractMesh, impostor: PhysicsImpostor): js.Dynamic = js.native
  def dispose(): js.Dynamic = js.native
}

@js.native
trait PhysicsImpostorParameters extends js.Object {
  var mass: Double = js.native
  var friction: Double = js.native
  var restitution: Double = js.native
  var nativeOptions: js.Any = js.native
}

@js.native
trait IPhysicsEnabledObject extends js.Object {
  var position: Vector3 = js.native
  var rotationQuaternion: Quaternion = js.native
  var scaling: Vector3 = js.native
  var rotation: Vector3 = js.native
  var parent: js.Any = js.native
  def getBoundingInfo(): BoundingInfo = js.native
  def computeWorldMatrix(force: Boolean): Unit = js.native
  def getWorldMatrix(): Matrix = js.native
  def getChildMeshes(): js.Array[AbstractMesh] = js.native
  def getVerticesData(kind: String): js.Array[Double] | Float32Array = js.native
  def getIndices(): IndicesArray = js.native
  def getScene(): Scene = js.native
}

@js.native
@JSGlobal("BABYLON.PhysicsImpostor")
class PhysicsImpostor extends js.Object {
  def this(`object`: IPhysicsEnabledObject, `type`: Double, _options: PhysicsImpostorParameters = ???, _scene: Scene = ???) = this()
  var `object`: IPhysicsEnabledObject = js.native
  var `type`: Double = js.native
  def isDisposed: Boolean = js.native
  var mass: Double = js.native
  var friction: Double = js.native
  var restitution: Double = js.native
  var uniqueId: Double = js.native
  def isBodyInitRequired(): Boolean = js.native
  def setScalingUpdated(updated: Boolean): Unit = js.native
  def forceUpdate(): Unit = js.native
  var physicsBody: js.Any = js.native
  var parent: PhysicsImpostor = js.native
  def resetUpdateFlags(): Unit = js.native
  def getObjectExtendSize(): Vector3 = js.native
  def getObjectCenter(): Vector3 = js.native
  def getParam(paramName: String): js.Dynamic = js.native
  def setParam(paramName: String, value: Double): Unit = js.native
  def setMass(mass: Double): Unit = js.native
  def getLinearVelocity(): Vector3 = js.native
  def setLinearVelocity(velocity: Vector3): Unit = js.native
  def getAngularVelocity(): Vector3 = js.native
  def setAngularVelocity(velocity: Vector3): Unit = js.native
  def executeNativeFunction(func: js.Function2[js.Any, js.Any, Unit]): Unit = js.native
  def registerBeforePhysicsStep(func: js.Function1[PhysicsImpostor, Unit]): Unit = js.native
  def unregisterBeforePhysicsStep(func: js.Function1[PhysicsImpostor, Unit]): Unit = js.native
  def registerAfterPhysicsStep(func: js.Function1[PhysicsImpostor, Unit]): Unit = js.native
  def unregisterAfterPhysicsStep(func: js.Function1[PhysicsImpostor, Unit]): Unit = js.native
  def registerOnPhysicsCollide(collideAgainst: PhysicsImpostor | js.Array[PhysicsImpostor], func: js.Function2[PhysicsImpostor, PhysicsImpostor, Unit]): Unit = js.native
  def unregisterOnPhysicsCollide(collideAgainst: PhysicsImpostor | js.Array[PhysicsImpostor], func: js.Function2[PhysicsImpostor, PhysicsImpostor | js.Array[PhysicsImpostor], Unit]): Unit = js.native
  var beforeStep: js.Function0[Unit] = js.native
  var afterStep: js.Function0[Unit] = js.native
  var onCollideEvent: js.Function2[PhysicsImpostor, PhysicsImpostor, Unit] = js.native
  var onCollide: js.Function1[js.Any, Unit] = js.native
  def applyForce(force: Vector3, contactPoint: Vector3): Unit = js.native
  def applyImpulse(force: Vector3, contactPoint: Vector3): Unit = js.native
  def createJoint(otherImpostor: PhysicsImpostor, jointType: Double, jointData: PhysicsJointData): Unit = js.native
  def addJoint(otherImpostor: PhysicsImpostor, joint: PhysicsJoint): Unit = js.native
  def sleep(): Unit = js.native
  def wakeUp(): Unit = js.native
  def clone(newObject: IPhysicsEnabledObject): PhysicsImpostor = js.native
  def dispose(): Unit = js.native
  def setDeltaPosition(position: Vector3): Unit = js.native
  def setDeltaRotation(rotation: Quaternion): Unit = js.native
  def getBoxSizeToRef(result: Vector3): Unit = js.native
  def getRadius(): Double = js.native
  def syncBoneWithImpostor(bone: Bone, boneMesh: AbstractMesh, jointPivot: Vector3, distToJoint: Double = ???, adjustRotation: Quaternion = ???): Unit = js.native
  def syncImpostorWithBone(bone: Bone, boneMesh: AbstractMesh, jointPivot: Vector3, distToJoint: Double = ???, adjustRotation: Quaternion = ???, boneAxis: Vector3 = ???): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.PhysicsImpostor")
object PhysicsImpostor extends js.Object {
  var DEFAULT_OBJECT_SIZE: Vector3 = js.native
  var IDENTITY_QUATERNION: Quaternion = js.native
  var NoImpostor: Double = js.native
  var SphereImpostor: Double = js.native
  var BoxImpostor: Double = js.native
  var PlaneImpostor: Double = js.native
  var MeshImpostor: Double = js.native
  var CylinderImpostor: Double = js.native
  var ParticleImpostor: Double = js.native
  var HeightmapImpostor: Double = js.native
}

@js.native
trait PhysicsJointData extends js.Object {
  var mainPivot: Vector3 = js.native
  var connectedPivot: Vector3 = js.native
  var mainAxis: Vector3 = js.native
  var connectedAxis: Vector3 = js.native
  var collision: Boolean = js.native
  var nativeParams: js.Any = js.native
}

@js.native
@JSGlobal("BABYLON.PhysicsJoint")
class PhysicsJoint extends js.Object {
  def this(`type`: Double, jointData: PhysicsJointData) = this()
  var `type`: Double = js.native
  var jointData: PhysicsJointData = js.native
  protected var _physicsPlugin: IPhysicsEnginePlugin = js.native
  var physicsJoint: js.Any = js.native
  var physicsPlugin: IPhysicsEnginePlugin = js.native
  def executeNativeFunction(func: js.Function2[js.Any, js.Any, Unit]): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.PhysicsJoint")
object PhysicsJoint extends js.Object {
  var DistanceJoint: Double = js.native
  var HingeJoint: Double = js.native
  var BallAndSocketJoint: Double = js.native
  var WheelJoint: Double = js.native
  var SliderJoint: Double = js.native
  var PrismaticJoint: Double = js.native
  var UniversalJoint: Double = js.native
  var Hinge2Joint: Double = js.native
  var PointToPointJoint: Double = js.native
  var SpringJoint: Double = js.native
  var LockJoint: Double = js.native
}

@js.native
@JSGlobal("BABYLON.DistanceJoint")
class DistanceJoint extends PhysicsJoint {
  def this(jointData: DistanceJointData) = this()
  def updateDistance(maxDistance: Double, minDistance: Double = ???): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.MotorEnabledJoint")
class MotorEnabledJoint extends PhysicsJoint with IMotorEnabledJoint {
  def this(`type`: Double, jointData: PhysicsJointData) = this()
  def setMotor(force: Double = ???, maxForce: Double = ???): Unit = js.native
  def setLimit(upperLimit: Double, lowerLimit: Double = ???): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.HingeJoint")
class HingeJoint extends MotorEnabledJoint {
  def this(jointData: PhysicsJointData) = this()
}

@js.native
@JSGlobal("BABYLON.Hinge2Joint")
class Hinge2Joint extends MotorEnabledJoint {
  def this(jointData: PhysicsJointData) = this()


}

@js.native
trait IMotorEnabledJoint extends js.Object {

}

@js.native
trait DistanceJointData extends PhysicsJointData {
  var maxDistance: Double = js.native
}

@js.native
trait SpringJointData extends PhysicsJointData {
  var length: Double = js.native
  var stiffness: Double = js.native
  var damping: Double = js.native
}

@js.native
@JSGlobal("BABYLON.AnaglyphPostProcess")
class AnaglyphPostProcess extends PostProcess {
  def this(name: String, options: Double | PostProcessOptions, rigCameras: js.Array[Camera], samplingMode: Double = ???, engine: Engine = ???, reusable: Boolean = ???) = this()
}

@js.native
@JSGlobal("BABYLON.BlackAndWhitePostProcess")
class BlackAndWhitePostProcess extends PostProcess {
  def this(name: String, options: Double | PostProcessOptions, camera: Camera, samplingMode: Double = ???, engine: Engine = ???, reusable: Boolean = ???) = this()
  var degree: Double = js.native
}

@js.native
@JSGlobal("BABYLON.BlurPostProcess")
class BlurPostProcess extends PostProcess {
  def this(name: String, direction: Vector2, kernel: Double, options: Double | PostProcessOptions, camera: Camera, samplingMode: Double = ???, engine: Engine = ???, reusable: Boolean = ???, textureType: Double = ???) = this()
  var direction: Vector2 = js.native
  protected var _kernel: Double = js.native
  protected var _idealKernel: Double = js.native
  protected var _packedFloat: Boolean = js.native
  var kernel: Double = js.native
  var packedFloat: Boolean = js.native
}

@js.native
@JSGlobal("BABYLON.ColorCorrectionPostProcess")
class ColorCorrectionPostProcess extends PostProcess {
  def this(name: String, colorTableUrl: String, options: Double | PostProcessOptions, camera: Camera, samplingMode: Double = ???, engine: Engine = ???, reusable: Boolean = ???) = this()
}

@js.native
@JSGlobal("BABYLON.ConvolutionPostProcess")
class ConvolutionPostProcess extends PostProcess {
  def this(name: String, kernel: js.Array[Double], options: Double | PostProcessOptions, camera: Camera, samplingMode: Double = ???, engine: Engine = ???, reusable: Boolean = ???) = this()
  var kernel: js.Array[Double] = js.native
}

@js.native
@JSGlobal("BABYLON.ConvolutionPostProcess")
object ConvolutionPostProcess extends js.Object {
  var EdgeDetect0Kernel: js.Array[Double] = js.native
  var EdgeDetect1Kernel: js.Array[Double] = js.native
  var EdgeDetect2Kernel: js.Array[Double] = js.native
  var SharpenKernel: js.Array[Double] = js.native
  var EmbossKernel: js.Array[Double] = js.native
  var GaussianKernel: js.Array[Double] = js.native
}

@js.native
@JSGlobal("BABYLON.DisplayPassPostProcess")
class DisplayPassPostProcess extends PostProcess {
  def this(name: String, options: Double | PostProcessOptions, camera: Camera, samplingMode: Double = ???, engine: Engine = ???, reusable: Boolean = ???) = this()
}

@js.native
@JSGlobal("BABYLON.FilterPostProcess")
class FilterPostProcess extends PostProcess {
  def this(name: String, kernelMatrix: Matrix, options: Double | PostProcessOptions, camera: Camera = ???, samplingMode: Double = ???, engine: Engine = ???, reusable: Boolean = ???) = this()
  var kernelMatrix: Matrix = js.native
}

@js.native
@JSGlobal("BABYLON.FxaaPostProcess")
class FxaaPostProcess extends PostProcess {
  def this(name: String, options: Double | PostProcessOptions, camera: Camera, samplingMode: Double = ???, engine: Engine = ???, reusable: Boolean = ???, textureType: Double = ???) = this()
  var texelWidth: Double = js.native
  var texelHeight: Double = js.native
}

@js.native
@JSGlobal("BABYLON.HighlightsPostProcess")
class HighlightsPostProcess extends PostProcess {
  def this(name: String, options: Double | PostProcessOptions, camera: Camera, samplingMode: Double = ???, engine: Engine = ???, reusable: Boolean = ???, textureType: Double = ???) = this()
}

@js.native
@JSGlobal("BABYLON.ImageProcessingPostProcess")
class ImageProcessingPostProcess extends PostProcess {
  def this(name: String, options: Double | PostProcessOptions, camera: Camera = ???, samplingMode: Double = ???, engine: Engine = ???, reusable: Boolean = ???, textureType: Double = ???) = this()
  protected var _imageProcessingConfiguration: ImageProcessingConfiguration = js.native
  var imageProcessingConfiguration: ImageProcessingConfiguration = js.native
  var colorCurves: ColorCurves = js.native
  var colorCurvesEnabled: Boolean = js.native
  var colorGradingTexture: BaseTexture = js.native
  var colorGradingEnabled: Boolean = js.native
  var exposure: Double = js.native
  var toneMappingEnabled: Boolean = js.native
  var contrast: Double = js.native
  var vignetteStretch: Double = js.native
  var vignetteCentreX: Double = js.native
  var vignetteCentreY: Double = js.native
  var vignetteWeight: Double = js.native
  var vignetteColor: Color4 = js.native
  var vignetteCameraFov: Double = js.native
  var vignetteBlendMode: Double = js.native
  var vignetteEnabled: Boolean = js.native
  var fromLinearSpace: Boolean = js.native
  override def dispose(camera: Camera = ???): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.PassPostProcess")
class PassPostProcess extends PostProcess {
  def this(name: String, options: Double | PostProcessOptions, camera: Camera, samplingMode: Double = ???, engine: Engine = ???, reusable: Boolean = ???, textureType: Double = ???) = this()
}

@js.native
@JSGlobal("BABYLON.PostProcess")
class PostProcess extends js.Object {
  def this(name: String, fragmentUrl: String, parameters: js.Array[String], samplers: js.Array[String], options: Double | PostProcessOptions, camera: Camera, samplingMode: Double = ???, engine: Engine = ???, reusable: Boolean = ???, defines: String = ???, textureType: Double = ???, vertexUrl: String = ???, indexParameters: js.Any = ???, blockCompilation: Boolean = ???) = this()
  var name: String = js.native
  var width: Double = js.native
  var height: Double = js.native
  var renderTargetSamplingMode: Double = js.native
  var clearColor: Color4 = js.native
  var autoClear: Boolean = js.native
  var alphaMode: Double = js.native
  var alphaConstants: Color4 = js.native
  var enablePixelPerfectMode: Boolean = js.native
  var scaleMode: Double = js.native
  var alwaysForcePOT: Boolean = js.native
  var samples: Double = js.native
  protected var _indexParameters: js.Any = js.native
  var onActivateObservable: Observable[Camera] = js.native
  var onActivate: js.Function1[Camera, Unit] = js.native
  var onSizeChangedObservable: Observable[PostProcess] = js.native
  var onSizeChanged: js.Function1[PostProcess, Unit] = js.native
  var onApplyObservable: Observable[Effect] = js.native
  var onApply: js.Function1[Effect, Unit] = js.native
  var onBeforeRenderObservable: Observable[Effect] = js.native
  var onBeforeRender: js.Function1[Effect, Unit] = js.native
  var onAfterRenderObservable: Observable[Effect] = js.native
  var onAfterRender: js.Function1[Effect, Unit] = js.native
  var outputTexture: WebGLTexture = js.native
  def getCamera(): Camera = js.native
  def texelSize: Vector2 = js.native
  def getEngine(): Engine = js.native
  def getEffect(): Effect = js.native
  def shareOutputWith(postProcess: PostProcess): PostProcess = js.native
  def updateEffect(defines: String = ???, uniforms: js.Array[String] = ???, samplers: js.Array[String] = ???, indexParameters: js.Any = ???, onCompiled: js.Function1[Effect, Unit] = ???, onError: js.Function2[Effect, String, Unit] = ???): Unit = js.native
  def isReusable(): Boolean = js.native
  def markTextureDirty(): Unit = js.native
  def activate(camera: Camera, sourceTexture: WebGLTexture = ???, forceDepthStencil: Boolean = ???): Unit = js.native
  def isSupported: Boolean = js.native
  def aspectRatio: Double = js.native
  @JSName("apply")
  def apply(): Effect = js.native
  def dispose(camera: Camera = ???): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.PostProcessManager")
class PostProcessManager extends js.Object {
  def this(scene: Scene) = this()
  def directRender(postProcesses: js.Array[PostProcess], targetTexture: WebGLTexture = ???): Unit = js.native
  def dispose(): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.RefractionPostProcess")
class RefractionPostProcess extends PostProcess {
  def this(name: String, refractionTextureUrl: String, color: Color3, depth: Double, colorLevel: Double, options: Double | PostProcessOptions, camera: Camera, samplingMode: Double = ???, engine: Engine = ???, reusable: Boolean = ???) = this()
  var color: Color3 = js.native
  var depth: Double = js.native
  var colorLevel: Double = js.native
  override def dispose(camera: Camera): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.StereoscopicInterlacePostProcess")
class StereoscopicInterlacePostProcess extends PostProcess {
  def this(name: String, rigCameras: js.Array[Camera], isStereoscopicHoriz: Boolean, samplingMode: Double = ???, engine: Engine = ???, reusable: Boolean = ???) = this()
}

@js.native
sealed trait TonemappingOperator extends js.Object {
}

@js.native
@JSGlobal("BABYLON.TonemappingOperator")
object TonemappingOperator extends js.Object {
  var Hable: TonemappingOperator = js.native
  var Reinhard: TonemappingOperator = js.native
  var HejiDawson: TonemappingOperator = js.native
  var Photographic: TonemappingOperator = js.native
  @JSBracketAccess
  def apply(value: TonemappingOperator): String = js.native
}

@js.native
@JSGlobal("BABYLON.TonemapPostProcess")
class TonemapPostProcess extends PostProcess {
  def this(name: String, _operator: TonemappingOperator, exposureAdjustment: Double, camera: Camera, samplingMode: Double = ???, engine: Engine = ???, textureFormat: Double = ???) = this()
  var exposureAdjustment: Double = js.native
}

@js.native
@JSGlobal("BABYLON.VolumetricLightScatteringPostProcess")
class VolumetricLightScatteringPostProcess extends PostProcess {
  def this(name: String, ratio: js.Any, camera: Camera, mesh: Mesh = ???, samples: Double = ???, samplingMode: Double = ???, engine: Engine = ???, reusable: Boolean = ???, scene: Scene = ???) = this()
  var attachedNode: js.Any = js.native
  var customMeshPosition: Vector3 = js.native
  var useCustomMeshPosition: Boolean = js.native
  var invert: Boolean = js.native
  var mesh: Mesh = js.native
  var useDiffuseColor: Boolean = js.native
  var excludedMeshes: js.Array[AbstractMesh] = js.native
  var exposure: Double = js.native
  var decay: Double = js.native
  var weight: Double = js.native
  var density: Double = js.native
  def isReady(subMesh: SubMesh, useInstances: Boolean): Boolean = js.native
  def setCustomMeshPosition(position: Vector3): Unit = js.native
  def getCustomMeshPosition(): Vector3 = js.native
  override def dispose(camera: Camera): Unit = js.native
  def getPass(): RenderTargetTexture = js.native
}

@js.native
@JSGlobal("BABYLON.VolumetricLightScatteringPostProcess")
object VolumetricLightScatteringPostProcess extends js.Object {
  def CreateDefaultMesh(name: String, scene: Scene): Mesh = js.native
}

@js.native
@JSGlobal("BABYLON.VRDistortionCorrectionPostProcess")
class VRDistortionCorrectionPostProcess extends PostProcess {
  def this(name: String, camera: Camera, isRightEye: Boolean, vrMetrics: VRCameraMetrics) = this()
}

@js.native
@JSGlobal("BABYLON.ReflectionProbe")
class ReflectionProbe extends js.Object {
  def this(name: String, size: Double, scene: Scene, generateMipMaps: Boolean = ???) = this()
  var name: String = js.native
  var invertYAxis: Boolean = js.native
  var position: Vector3 = js.native
  var samples: Double = js.native
  var refreshRate: Double = js.native
  def getScene(): Scene = js.native
  def cubeTexture: RenderTargetTexture = js.native
  def renderList: js.Array[AbstractMesh] = js.native
  def attachToMesh(mesh: AbstractMesh): Unit = js.native
  def setRenderingAutoClearDepthStencil(renderingGroupId: Double, autoClearDepthStencil: Boolean): Unit = js.native
  def dispose(): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.BoundingBoxRenderer")
class BoundingBoxRenderer extends js.Object {
  def this(scene: Scene) = this()
  var frontColor: Color3 = js.native
  var backColor: Color3 = js.native
  var showBackLines: Boolean = js.native
  var renderList: SmartArray[BoundingBox] = js.native
  def reset(): Unit = js.native
  def render(): Unit = js.native
  def dispose(): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.DepthRenderer")
class DepthRenderer extends js.Object {
  def this(scene: Scene, `type`: Double = ???) = this()
  def isReady(subMesh: SubMesh, useInstances: Boolean): Boolean = js.native
  def getDepthMap(): RenderTargetTexture = js.native
  def dispose(): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.EdgesRenderer")
class EdgesRenderer extends js.Object {
  def this(source: AbstractMesh, epsilon: Double = ???, checkVerticesInsteadOfIndices: Boolean = ???) = this()
  var edgesWidthScalerForOrthographic: Double = js.native
  var edgesWidthScalerForPerspective: Double = js.native
  def dispose(): Unit = js.native
  def render(): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.GeometryBufferRenderer")
class GeometryBufferRenderer extends js.Object {
  def this(scene: Scene, ratio: Double = ???) = this()
  var renderList: js.Array[Mesh] = js.native
  def isSupported: Boolean = js.native
  var enablePosition: Boolean = js.native
  def isReady(subMesh: SubMesh, useInstances: Boolean): Boolean = js.native
  def getGBuffer(): MultiRenderTarget = js.native
  def dispose(): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.OutlineRenderer")
class OutlineRenderer extends js.Object {
  def this(scene: Scene) = this()
  var zOffset: Double = js.native
  def render(subMesh: SubMesh, batch: _InstancesBatch, useOverlay: Boolean = ???): Unit = js.native
  def isReady(subMesh: SubMesh, useInstances: Boolean): Boolean = js.native
}

@js.native
@JSGlobal("BABYLON.RenderingGroup")
class RenderingGroup extends js.Object {
  def this(index: Double, scene: Scene, opaqueSortCompareFn: js.Function2[SubMesh, SubMesh, Double] = ???, alphaTestSortCompareFn: js.Function2[SubMesh, SubMesh, Double] = ???, transparentSortCompareFn: js.Function2[SubMesh, SubMesh, Double] = ???) = this()
  var index: Double = js.native
  var onBeforeTransparentRendering: js.Function0[Unit] = js.native
  var opaqueSortCompareFn: js.Function2[SubMesh, SubMesh, Double] = js.native
  var alphaTestSortCompareFn: js.Function2[SubMesh, SubMesh, Double] = js.native
  var transparentSortCompareFn: js.Function2[SubMesh, SubMesh, Double] = js.native
  def render(customRenderFunction: js.Function3[SmartArray[SubMesh], SmartArray[SubMesh], SmartArray[SubMesh], Unit], renderSprites: Boolean, renderParticles: Boolean, activeMeshes: js.Array[AbstractMesh]): Unit = js.native
  def prepare(): Unit = js.native
  def dispose(): Unit = js.native
  def dispatch(subMesh: SubMesh): Unit = js.native
  def dispatchSprites(spriteManager: SpriteManager): Unit = js.native
  def dispatchParticles(particleSystem: ParticleSystem): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.RenderingGroup")
object RenderingGroup extends js.Object {
  def defaultTransparentSortCompare(a: SubMesh, b: SubMesh): Double = js.native
  def backToFrontSortCompare(a: SubMesh, b: SubMesh): Double = js.native
  def frontToBackSortCompare(a: SubMesh, b: SubMesh): Double = js.native
}

@js.native
@JSGlobal("BABYLON.RenderingManager")
class RenderingManager extends js.Object {
  def this(scene: Scene) = this()
  def render(customRenderFunction: js.Function3[SmartArray[SubMesh], SmartArray[SubMesh], SmartArray[SubMesh], Unit], activeMeshes: js.Array[AbstractMesh], renderParticles: Boolean, renderSprites: Boolean): Unit = js.native
  def reset(): Unit = js.native
  def dispose(): Unit = js.native
  def dispatchSprites(spriteManager: SpriteManager): Unit = js.native
  def dispatchParticles(particleSystem: ParticleSystem): Unit = js.native
  def dispatch(subMesh: SubMesh): Unit = js.native
  def setRenderingOrder(renderingGroupId: Double, opaqueSortCompareFn: js.Function2[SubMesh, SubMesh, Double] = ???, alphaTestSortCompareFn: js.Function2[SubMesh, SubMesh, Double] = ???, transparentSortCompareFn: js.Function2[SubMesh, SubMesh, Double] = ???): Unit = js.native
  def setRenderingAutoClearDepthStencil(renderingGroupId: Double, autoClearDepthStencil: Boolean, depth: Boolean = ???, stencil: Boolean = ???): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.RenderingManager")
object RenderingManager extends js.Object {
  var MAX_RENDERINGGROUPS: Double = js.native
  var MIN_RENDERINGGROUPS: Double = js.native
  var AUTOCLEAR: Boolean = js.native
}

@js.native
@JSGlobal("BABYLON.Sprite")
class Sprite extends js.Object {
  def this(name: String, manager: SpriteManager) = this()
  var name: String = js.native
  var position: Vector3 = js.native
  var color: Color4 = js.native
  var width: Double = js.native
  var height: Double = js.native
  var angle: Double = js.native
  var cellIndex: Double = js.native
  var invertU: Double = js.native
  var invertV: Double = js.native
  var disposeWhenFinishedAnimating: Boolean = js.native
  var animations: js.Array[Animation] = js.native
  var isPickable: Boolean = js.native
  var actionManager: ActionManager = js.native
  var size: Double = js.native
  def playAnimation(from: Double, to: Double, loop: Boolean, delay: Double, onAnimationEnd: js.Function0[Unit]): Unit = js.native
  def stopAnimation(): Unit = js.native
  def dispose(): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.SpriteManager")
class SpriteManager extends js.Object {
  def this(name: String, imgUrl: String, capacity: Double, cellSize: js.Any, scene: Scene, epsilon: Double = ???, samplingMode: Double = ???) = this()
  var name: String = js.native
  var sprites: js.Array[Sprite] = js.native
  var renderingGroupId: Double = js.native
  var layerMask: Double = js.native
  var fogEnabled: Boolean = js.native
  var isPickable: Boolean = js.native
  var cellWidth: Double = js.native
  var cellHeight: Double = js.native
  var onDisposeObservable: Observable[SpriteManager] = js.native
  var onDispose: js.Function0[Unit] = js.native
  var texture: Texture = js.native
  def intersects(ray: Ray, camera: Camera, predicate: js.Function1[Sprite, Boolean] = ???, fastCheck: Boolean = ???): PickingInfo = js.native
  def render(): Unit = js.native
  def dispose(): Unit = js.native
}

@js.native
trait IAssetTask extends js.Object {
  var onSuccess: js.Function1[IAssetTask, Unit] = js.native
  var onError: js.Function1[IAssetTask, Unit] = js.native
  var isCompleted: Boolean = js.native
  def run(scene: Scene, onSuccess: js.Function0[Unit], onError: js.Function0[Unit]): js.Dynamic = js.native
}

@js.native
@JSGlobal("BABYLON.MeshAssetTask")
class MeshAssetTask extends IAssetTask {
  def this(name: String, meshesNames: js.Any, rootUrl: String, sceneFilename: String) = this()
  var name: String = js.native
  var meshesNames: js.Any = js.native
  var rootUrl: String = js.native
  var sceneFilename: String = js.native
  var loadedMeshes: js.Array[AbstractMesh] = js.native
  var loadedParticleSystems: js.Array[ParticleSystem] = js.native
  var loadedSkeletons: js.Array[Skeleton] = js.native




}

@js.native
@JSGlobal("BABYLON.TextFileAssetTask")
class TextFileAssetTask extends IAssetTask {
  def this(name: String, url: String) = this()
  var name: String = js.native
  var url: String = js.native



  var text: String = js.native

}

@js.native
@JSGlobal("BABYLON.BinaryFileAssetTask")
class BinaryFileAssetTask extends IAssetTask {
  def this(name: String, url: String) = this()
  var name: String = js.native
  var url: String = js.native



  var data: ArrayBuffer = js.native

}

@js.native
@JSGlobal("BABYLON.ImageAssetTask")
class ImageAssetTask extends IAssetTask {
  def this(name: String, url: String) = this()
  var name: String = js.native
  var url: String = js.native



  var image: HTMLImageElement = js.native

}

@js.native
trait ITextureAssetTask extends IAssetTask {


  var texture: Texture = js.native
}

@js.native
@JSGlobal("BABYLON.TextureAssetTask")
class TextureAssetTask extends ITextureAssetTask {
  def this(name: String, url: String, noMipmap: Boolean = ???, invertY: Boolean = ???, samplingMode: Double = ???) = this()
  var name: String = js.native
  var url: String = js.native
  var noMipmap: Boolean = js.native
  var invertY: Boolean = js.native
  var samplingMode: Double = js.native





}

@js.native
@JSGlobal("BABYLON.CubeTextureAssetTask")
class CubeTextureAssetTask extends IAssetTask {
  def this(name: String, url: String, extensions: js.Array[String] = ???, noMipmap: Boolean = ???, files: js.Array[String] = ???) = this()
  var name: String = js.native
  var url: String = js.native
  var extensions: js.Array[String] = js.native
  var noMipmap: Boolean = js.native
  var files: js.Array[String] = js.native



  var texture: CubeTexture = js.native

}

@js.native
@JSGlobal("BABYLON.HDRCubeTextureAssetTask")
class HDRCubeTextureAssetTask extends IAssetTask {
  def this(name: String, url: String, size: Double = ???, noMipmap: Boolean = ???, generateHarmonics: Boolean = ???, useInGammaSpace: Boolean = ???, usePMREMGenerator: Boolean = ???) = this()
  var name: String = js.native
  var url: String = js.native
  var size: Double = js.native
  var noMipmap: Boolean = js.native
  var generateHarmonics: Boolean = js.native
  var useInGammaSpace: Boolean = js.native
  var usePMREMGenerator: Boolean = js.native



  var texture: HDRCubeTexture = js.native

}

@js.native
@JSGlobal("BABYLON.AssetsManager")
class AssetsManager extends js.Object {
  def this(scene: Scene) = this()
  protected var tasks: js.Array[IAssetTask] = js.native
  protected var waitingTasksCount: Double = js.native
  var onFinish: js.Function1[js.Array[IAssetTask], Unit] = js.native
  var onTaskSuccess: js.Function1[IAssetTask, Unit] = js.native
  var onTaskError: js.Function1[IAssetTask, Unit] = js.native
  var useDefaultLoadingScreen: Boolean = js.native
  def addMeshTask(taskName: String, meshesNames: js.Any, rootUrl: String, sceneFilename: String): IAssetTask = js.native
  def addTextFileTask(taskName: String, url: String): IAssetTask = js.native
  def addBinaryFileTask(taskName: String, url: String): IAssetTask = js.native
  def addImageTask(taskName: String, url: String): IAssetTask = js.native
  def addTextureTask(taskName: String, url: String, noMipmap: Boolean = ???, invertY: Boolean = ???, samplingMode: Double = ???): ITextureAssetTask = js.native
  def addCubeTextureTask(name: String, url: String, extensions: js.Array[String] = ???, noMipmap: Boolean = ???, files: js.Array[String] = ???): IAssetTask = js.native
  def addHDRCubeTextureTask(name: String, url: String, size: Double = ???, noMipmap: Boolean = ???, generateHarmonics: Boolean = ???, useInGammaSpace: Boolean = ???, usePMREMGenerator: Boolean = ???): IAssetTask = js.native
  def reset(): AssetsManager = js.native
  def load(): AssetsManager = js.native
}

@js.native
@JSGlobal("BABYLON.Database")
class Database extends js.Object {
  def this(urlToScene: String, callbackManifestChecked: js.Function1[Boolean, Any]) = this()
  def checkManifestFile(): Unit = js.native
  def openAsync(successCallback: js.Any, errorCallback: js.Any): Unit = js.native
  def loadImageFromDB(url: String, image: HTMLImageElement): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.Database")
object Database extends js.Object {
  var IsUASupportingBlobStorage: Boolean = js.native
  var IDBStorageEnabled: Boolean = js.native
  var parseURL: js.Function1[String, String] = js.native
  var ReturnFullUrlLocation: js.Function1[String, String] = js.native
}

@js.native
@JSGlobal("BABYLON.SerializationHelper")
class SerializationHelper extends js.Object {
}

@js.native
@JSGlobal("BABYLON.SerializationHelper")
object SerializationHelper extends js.Object {
  def Serialize[T](entity: T, serializationObject: js.Any = ???): js.Dynamic = js.native
  def Parse[T](creationFunction: js.Function0[T], source: js.Any, scene: Scene, rootUrl: String = ???): T = js.native
  def Clone[T](creationFunction: js.Function0[T], source: T): T = js.native
}

@js.native
@JSGlobal("BABYLON.DynamicFloatArrayElementInfo")
class DynamicFloatArrayElementInfo extends js.Object {
  var offset: Double = js.native
}

@js.native
@JSGlobal("BABYLON.DynamicFloatArray")
class DynamicFloatArray extends js.Object {
  def this(stride: Double, initialElementCount: Double) = this()
  def allocElement(): DynamicFloatArrayElementInfo = js.native
  def freeElement(elInfo: DynamicFloatArrayElementInfo): Unit = js.native
  def pack(): Float32Array = js.native
  var buffer: Float32Array = js.native
  def totalElementCount: Double = js.native
  def freeElementCount: Double = js.native
  def usedElementCount: Double = js.native
  def stride: Double = js.native
  var compareValueOffset: Double = js.native
  var sortingAscending: Boolean = js.native
  def sort(): Boolean = js.native
}

@js.native
sealed trait PoseEnabledControllerType extends js.Object {
}

@js.native
@JSGlobal("BABYLON.PoseEnabledControllerType")
object PoseEnabledControllerType extends js.Object {
  var VIVE: PoseEnabledControllerType = js.native
  var OCULUS: PoseEnabledControllerType = js.native
  var GENERIC: PoseEnabledControllerType = js.native
  @JSBracketAccess
  def apply(value: PoseEnabledControllerType): String = js.native
}

@js.native
trait MutableGamepadButton extends js.Object {
  var value: Double = js.native
  var touched: Boolean = js.native
  var pressed: Boolean = js.native
}

@js.native
@JSGlobal("BABYLON.PoseEnabledControllerHelper")
class PoseEnabledControllerHelper extends js.Object {
}

@js.native
@JSGlobal("BABYLON.PoseEnabledControllerHelper")
object PoseEnabledControllerHelper extends js.Object {
  def InitiateController(vrGamepad: js.Any): OculusTouchController | ViveController = js.native
}

@js.native
@JSGlobal("BABYLON.PoseEnabledController")
class PoseEnabledController extends Gamepad with PoseControlled {
  def this(vrGamepad: js.Any) = this()
  var vrGamepad: js.Any = js.native





  var controllerType: PoseEnabledControllerType = js.native

  override def update(): Unit = js.native

  def attachToMesh(mesh: AbstractMesh): Unit = js.native
  def attachToPoseControlledCamera(camera: TargetCamera): Unit = js.native
  def detachMesh(): Unit = js.native
  def mesh: AbstractMesh = js.native
  def getForwardRay(length: Double = ???): Ray = js.native
}

@js.native
trait GamepadButtonChanges extends js.Object {
  var changed: Boolean = js.native
  var pressChanged: Boolean = js.native
  var touchChanged: Boolean = js.native
  var valueChanged: Boolean = js.native
}

@js.native
@JSGlobal("BABYLON.WebVRController")
abstract class WebVRController extends PoseEnabledController {
  def this(vrGamepad: js.Any) = this()
  var onTriggerStateChangedObservable: Observable[ExtendedGamepadButton] = js.native
  var onMainButtonStateChangedObservable: Observable[ExtendedGamepadButton] = js.native
  var onSecondaryButtonStateChangedObservable: Observable[ExtendedGamepadButton] = js.native
  var onPadStateChangedObservable: Observable[ExtendedGamepadButton] = js.native
  var onPadValuesChangedObservable: Observable[StickValues] = js.native
  protected var _buttons: js.Array[MutableGamepadButton] = js.native
  def onButtonStateChange(callback: js.Function3[Double, Double, ExtendedGamepadButton, Unit]): Unit = js.native
  var pad: StickValues = js.native
  var hand: String = js.native
  override def update(): Unit = js.native
  def handleButtonChange(buttonIdx: Double, value: ExtendedGamepadButton, changes: GamepadButtonChanges): js.Dynamic
  def initControllerMesh(scene: Scene, meshLoaded: js.Function1[AbstractMesh, Unit] = ???): js.Dynamic
}

@js.native
@JSGlobal("BABYLON.OculusTouchController")
class OculusTouchController extends WebVRController {
  def this(vrGamepad: js.Any) = this()
  var onSecondaryTriggerStateChangedObservable: Observable[ExtendedGamepadButton] = js.native
  var onThumbRestChangedObservable: Observable[ExtendedGamepadButton] = js.native

  def onAButtonStateChangedObservable: Observable[ExtendedGamepadButton] = js.native
  def onBButtonStateChangedObservable: Observable[ExtendedGamepadButton] = js.native
  def onXButtonStateChangedObservable: Observable[ExtendedGamepadButton] = js.native
  def onYButtonStateChangedObservable: Observable[ExtendedGamepadButton] = js.native

  def handleButtonChange(buttonIdx: Double,value: ExtendedGamepadButton,changes: GamepadButtonChanges): scala.scalajs.js.Dynamic = ???
  def initControllerMesh(scene: Scene,meshLoaded: scala.scalajs.js.Function1[AbstractMesh,Unit]): scala.scalajs.js.Dynamic = ???
}

@js.native
@JSGlobal("BABYLON.ViveController")
class ViveController extends WebVRController {
  def this(vrGamepad: js.Any) = this()

  def onLeftButtonStateChangedObservable: Observable[ExtendedGamepadButton] = js.native
  def onRightButtonStateChangedObservable: Observable[ExtendedGamepadButton] = js.native
  def onMenuButtonStateChangedObservable: Observable[ExtendedGamepadButton] = js.native

  def handleButtonChange(buttonIdx: Double,value: ExtendedGamepadButton,changes: GamepadButtonChanges): scala.scalajs.js.Dynamic = ???
  def initControllerMesh(scene: Scene,meshLoaded: scala.scalajs.js.Function1[AbstractMesh,Unit]): scala.scalajs.js.Dynamic = ???

}

@js.native
@JSGlobal("BABYLON.FilesInput")
class FilesInput extends js.Object {
  def this(p_engine: Engine, p_scene: Scene, p_canvas: HTMLCanvasElement, p_sceneLoadedCallback: js.Any, p_progressCallback: js.Any, p_additionnalRenderLoopLogicCallback: js.Any, p_textureLoadingCallback: js.Any, p_startingProcessingFilesCallback: js.Any) = this()
  def monitorElementForDragNDrop(p_elementToMonitor: HTMLElement): Unit = js.native
  def loadFiles(event: js.Any): Unit = js.native
  def reload(): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.FilesInput")
object FilesInput extends js.Object {
  var FilesToLoad: js.Array[File] = js.native
}

@js.native
@JSGlobal("BABYLON.Gamepads")
class Gamepads[T <: Gamepad] extends js.Object {
  def this(ongamedpadconnected: js.Function1[T, Unit], ongamedpaddisconnected: js.Function1[T, Unit] = ???) = this()
  def dispose(): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.StickValues")
class StickValues extends js.Object {
  def this(x: js.Any, y: js.Any) = this()
  var x: js.Any = js.native
  var y: js.Any = js.native
}

@js.native
@JSGlobal("BABYLON.Gamepad")
class Gamepad extends js.Object {
  def this(id: String, index: Double, browserGamepad: js.Any, leftStickX: Double = ???, leftStickY: Double = ???, rightStickX: Double = ???, rightStickY: Double = ???) = this()
  var id: String = js.native
  var index: Double = js.native
  var browserGamepad: js.Any = js.native
  var `type`: Double = js.native
  def onleftstickchanged(callback: js.Function1[StickValues, Unit]): Unit = js.native
  def onrightstickchanged(callback: js.Function1[StickValues, Unit]): Unit = js.native
  var leftStick: StickValues = js.native
  var rightStick: StickValues = js.native
  def update(): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.Gamepad")
object Gamepad extends js.Object {
  var GAMEPAD: Double = js.native
  var GENERIC: Double = js.native
  var XBOX: Double = js.native
  var POSE_ENABLED: Double = js.native
}

@js.native
@JSGlobal("BABYLON.GenericPad")
class GenericPad extends Gamepad {
  def this(id: String, index: Double, browserGamepad: js.Any) = this()
  def onbuttondown(callback: js.Function1[Double, Unit]): Unit = js.native
  def onbuttonup(callback: js.Function1[Double, Unit]): Unit = js.native
  override def update(): Unit = js.native
}

@js.native
sealed trait Xbox360Button extends js.Object {
}

@js.native
@JSGlobal("BABYLON.Xbox360Button")
object Xbox360Button extends js.Object {
  var A: Xbox360Button = js.native
  var B: Xbox360Button = js.native
  var X: Xbox360Button = js.native
  var Y: Xbox360Button = js.native
  var Start: Xbox360Button = js.native
  var Back: Xbox360Button = js.native
  var LB: Xbox360Button = js.native
  var RB: Xbox360Button = js.native
  var LeftStick: Xbox360Button = js.native
  var RightStick: Xbox360Button = js.native
  @JSBracketAccess
  def apply(value: Xbox360Button): String = js.native
}

@js.native
sealed trait Xbox360Dpad extends js.Object {
}

@js.native
@JSGlobal("BABYLON.Xbox360Dpad")
object Xbox360Dpad extends js.Object {
  var Up: Xbox360Dpad = js.native
  var Down: Xbox360Dpad = js.native
  var Left: Xbox360Dpad = js.native
  var Right: Xbox360Dpad = js.native
  @JSBracketAccess
  def apply(value: Xbox360Dpad): String = js.native
}

@js.native
@JSGlobal("BABYLON.Xbox360Pad")
class Xbox360Pad extends Gamepad {
  def this(id: String, index: Double, gamepad: js.Any, xboxOne: Boolean = ???) = this()
  def onlefttriggerchanged(callback: js.Function1[Double, Unit]): Unit = js.native
  def onrighttriggerchanged(callback: js.Function1[Double, Unit]): Unit = js.native
  var leftTrigger: Double = js.native
  var rightTrigger: Double = js.native
  def onbuttondown(callback: js.Function1[Xbox360Button, Unit]): Unit = js.native
  def onbuttonup(callback: js.Function1[Xbox360Button, Unit]): Unit = js.native
  def ondpaddown(callback: js.Function1[Xbox360Dpad, Unit]): Unit = js.native
  def ondpadup(callback: js.Function1[Xbox360Dpad, Unit]): Unit = js.native
  var buttonA: Double = js.native
  var buttonB: Double = js.native
  var buttonX: Double = js.native
  var buttonY: Double = js.native
  var buttonStart: Double = js.native
  var buttonBack: Double = js.native
  var buttonLB: Double = js.native
  var buttonRB: Double = js.native
  var buttonLeftStick: Double = js.native
  var buttonRightStick: Double = js.native
  var dPadUp: Double = js.native
  var dPadDown: Double = js.native
  var dPadLeft: Double = js.native
  var dPadRight: Double = js.native
  override def update(): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.EventState")
class EventState extends js.Object {
  def this(mask: Double, skipNextObservers: Boolean = ???) = this()
  def initalize(mask: Double, skipNextObservers: Boolean = ???): EventState = js.native
  var skipNextObservers: Boolean = js.native
  var mask: Double = js.native
}

@js.native
@JSGlobal("BABYLON.Observer")
class Observer[T] extends js.Object {
  def this(callback: js.Function2[T, EventState, Unit], mask: Double) = this()
  var callback: js.Function2[T, EventState, Unit] = js.native
  var mask: Double = js.native
}

@js.native
@JSGlobal("BABYLON.Observable")
class Observable[T] extends js.Object {
  def add(callback: js.Function2[T, EventState, Unit], mask: Double = ???, insertFirst: Boolean = ???): Observer[T] = js.native
  def remove(observer: Observer[T]): Boolean = js.native
  def removeCallback(callback: js.Function2[T, EventState, Unit]): Boolean = js.native
  def notifyObservers(eventData: T, mask: Double = ???): Boolean = js.native
  def hasObservers(): Boolean = js.native
  def clear(): Unit = js.native
  override def clone(): Observable[T] = js.native
  def hasSpecificMask(mask: Double = ???): Boolean = js.native
}

@js.native
@JSGlobal("BABYLON.PackedRect")
class PackedRect extends js.Object {
  def this(root: RectPackingMap, parent: PackedRect, pos: Vector2, size: Size) = this()
  def pos: Vector2 = js.native
  def contentSize: Size = js.native
  def getInnerPosToRef(res: Vector2): Unit = js.native
  def getInnerSizeToRef(res: Size): Unit = js.native
  def UVs: js.Array[Vector2] = js.native
  def getUVsForCustomSize(customSize: Size): js.Array[Vector2] = js.native
  def freeContent(): Unit = js.native
  protected def isUsed: Boolean = js.native
  def findAndSplitNode(contentSize: Size): PackedRect = js.native
  var isRecursiveFree: Boolean = js.native
  def evalFreeSize(size: Double): Double = js.native
  protected var _root: RectPackingMap = js.native
  protected var _parent: PackedRect = js.native
  protected var _size: Size = js.native
}

@js.native
@JSGlobal("BABYLON.RectPackingMap")
class RectPackingMap extends PackedRect {
  def this(size: Size, margin: Double = ???) = this()
  def addRect(size: Size): PackedRect = js.native
  def freeSpace: Double = js.native
}

@js.native
@JSGlobal("BABYLON.SceneOptimization")
class SceneOptimization extends js.Object {
  def this(priority: Double = ???) = this()
  var priority: Double = js.native
  @JSName("apply")
  var apply: js.Function1[Scene, Boolean] = js.native
}

@js.native
@JSGlobal("BABYLON.TextureOptimization")
class TextureOptimization extends SceneOptimization {
  def this(priority: Double = ???, maximumSize: Double = ???) = this()

  var maximumSize: Double = js.native
  //@JSName("apply")

}

@js.native
@JSGlobal("BABYLON.HardwareScalingOptimization")
class HardwareScalingOptimization extends SceneOptimization {
  def this(priority: Double = ???, maximumScale: Double = ???) = this()

  var maximumScale: Double = js.native
  //@JSName("apply")

}

@js.native
@JSGlobal("BABYLON.ShadowsOptimization")
class ShadowsOptimization extends SceneOptimization {
  //@JSName("apply")

}

@js.native
@JSGlobal("BABYLON.PostProcessesOptimization")
class PostProcessesOptimization extends SceneOptimization {
  //@JSName("apply")

}

@js.native
@JSGlobal("BABYLON.LensFlaresOptimization")
class LensFlaresOptimization extends SceneOptimization {
  //@JSName("apply")

}

@js.native
@JSGlobal("BABYLON.ParticlesOptimization")
class ParticlesOptimization extends SceneOptimization {
  //@JSName("apply")

}

@js.native
@JSGlobal("BABYLON.RenderTargetsOptimization")
class RenderTargetsOptimization extends SceneOptimization {
  //@JSName("apply")

}

@js.native
@JSGlobal("BABYLON.MergeMeshesOptimization")
class MergeMeshesOptimization extends SceneOptimization {
  //@JSName("apply")

}

@js.native
@JSGlobal("BABYLON.MergeMeshesOptimization")
object MergeMeshesOptimization extends js.Object {
  var UpdateSelectionTree: Boolean = js.native
}

@js.native
@JSGlobal("BABYLON.SceneOptimizerOptions")
class SceneOptimizerOptions extends js.Object {
  def this(targetFrameRate: Double = ???, trackerDuration: Double = ???) = this()
  var targetFrameRate: Double = js.native
  var trackerDuration: Double = js.native
  var optimizations: js.Array[SceneOptimization] = js.native
}

@js.native
@JSGlobal("BABYLON.SceneOptimizerOptions")
object SceneOptimizerOptions extends js.Object {
  def LowDegradationAllowed(targetFrameRate: Double = ???): SceneOptimizerOptions = js.native
  def ModerateDegradationAllowed(targetFrameRate: Double = ???): SceneOptimizerOptions = js.native
  def HighDegradationAllowed(targetFrameRate: Double = ???): SceneOptimizerOptions = js.native
}

@js.native
@JSGlobal("BABYLON.SceneOptimizer")
class SceneOptimizer extends js.Object {
}

@js.native
@JSGlobal("BABYLON.SceneOptimizer")
object SceneOptimizer extends js.Object {
  def OptimizeAsync(scene: Scene, options: SceneOptimizerOptions = ???, onSuccess: js.Function0[Unit] = ???, onFailure: js.Function0[Unit] = ???): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.SceneSerializer")
class SceneSerializer extends js.Object {
}

@js.native
@JSGlobal("BABYLON.SceneSerializer")
object SceneSerializer extends js.Object {
  def ClearCache(): Unit = js.native
  def Serialize(scene: Scene): js.Dynamic = js.native
  def SerializeMesh(toSerialize: js.Any, withParents: Boolean = ???, withChildren: Boolean = ???): js.Dynamic = js.native
}

@js.native
@JSGlobal("BABYLON.SmartArray")
class SmartArray[T] extends js.Object {
  def this(capacity: Double) = this()
  var data: js.Array[T] = js.native
  var length: Double = js.native
  def push(value: js.Any): Unit = js.native
  def forEach(func: js.Function1[T, Unit]): Unit = js.native
  def pushNoDuplicate(value: js.Any): Boolean = js.native
  def sort(compareFn: js.Any): Unit = js.native
  def reset(): Unit = js.native
  def dispose(): Unit = js.native
  def concat(array: js.Any): Unit = js.native
  def concatWithNoDuplicate(array: js.Any): Unit = js.native
  def indexOf(value: T): Double = js.native
  def contains(value: T): Boolean = js.native
}

@js.native
@JSGlobal("BABYLON.StringDictionary")
class StringDictionary[T] extends js.Object {
  def copyFrom(source: StringDictionary[T]): Unit = js.native
  def get(key: String): T = js.native
  def getOrAddWithFactory(key: String, factory: js.Function1[String, T]): T = js.native
  def getOrAdd(key: String, `val`: T): T = js.native
  def contains(key: js.Any): Boolean = js.native
  def add(key: String, value: T): Boolean = js.native
  def set(key: String, value: T): Boolean = js.native
  def getAndRemove(key: String): T = js.native
  def remove(key: String): Boolean = js.native
  def clear(): Unit = js.native
  def count: Double = js.native
  def forEach(callback: js.Function2[String, T, Unit]): Unit = js.native
  def first[TRes](callback: js.Function2[String, T, TRes]): TRes = js.native
}

@js.native
@JSGlobal("BABYLON.Tags")
class Tags extends js.Object {
}

@js.native
@JSGlobal("BABYLON.Tags")
object Tags extends js.Object {
  def EnableFor(obj: js.Any): Unit = js.native
  def DisableFor(obj: js.Any): Unit = js.native
  def HasTags(obj: js.Any): Boolean = js.native
  def GetTags(obj: js.Any, asString: Boolean = ???): js.Dynamic = js.native
  def AddTagsTo(obj: js.Any, tagsString: String): Unit = js.native
  def RemoveTagsFrom(obj: js.Any, tagsString: String): Unit = js.native
  def MatchesQuery(obj: js.Any, tagsQuery: String): Boolean = js.native
}

@js.native
@JSGlobal("BABYLON.TextureTools")
class TextureTools extends js.Object {
}

@js.native
@JSGlobal("BABYLON.TextureTools")
object TextureTools extends js.Object {
  def CreateResizedCopy(texture: Texture, width: Double, height: Double, useBilinearMode: Boolean = ???): Texture = js.native
  def GetEnvironmentBRDFTexture(scene: Scene): BaseTexture = js.native
}

@js.native
trait IAnimatable extends js.Object {
  var animations: js.Array[Animation] = js.native
}

@js.native
@JSGlobal("BABYLON.Tools")
class Tools extends js.Object {
}

@js.native
@JSGlobal("BABYLON.Tools")
object Tools extends js.Object {
  var BaseUrl: String = js.native
  var CorsBehavior: js.Any = js.native
  var UseFallbackTexture: Boolean = js.native
  def Mix(a: Double, b: Double, alpha: Double): Double = js.native
  def Instantiate(className: String): js.Dynamic = js.native
  def SetImmediate(action: js.Function0[Unit]): Unit = js.native
  def IsExponentOfTwo(value: Double): Boolean = js.native
  def CeilingPOT(x: Double): Double = js.native
  def FloorPOT(x: Double): Double = js.native
  def NearestPOT(x: Double): Double = js.native
  def GetExponentOfTwo(value: Double, max: Double, mode: Double = ???): Double = js.native
  def GetFilename(path: String): String = js.native
  def GetDOMTextContent(element: HTMLElement): String = js.native
  def ToDegrees(angle: Double): Double = js.native
  def ToRadians(angle: Double): Double = js.native
  def EncodeArrayBufferTobase64(buffer: ArrayBuffer): String = js.native
  def ExtractMinAndMaxIndexed(positions: js.Array[Double] | Float32Array, indices: IndicesArray, indexStart: Double, indexCount: Double, bias: Vector2 = ???): js.Any = js.native
  def ExtractMinAndMax(positions: js.Array[Double] | Float32Array, start: Double, count: Double, bias: Vector2 = ???, stride: Double = ???): js.Any = js.native
  def Vector2ArrayFeeder(array: js.Array[Vector2] | Float32Array): js.Function1[Double, Vector2] = js.native
  def ExtractMinAndMaxVector2(feeder: js.Function1[Double, Vector2], bias: Vector2 = ???): js.Any = js.native
  def MakeArray(obj: js.Any, allowsNullUndefined: Boolean = ???): js.Array[js.Any] = js.native
  def GetPointerPrefix(): String = js.native
  def QueueNewFrame(func: js.Any, requester: js.Any = ???): Unit = js.native
  def RequestFullscreen(element: js.Any): Unit = js.native
  def ExitFullscreen(): Unit = js.native
  def SetCorsBehavior(url: String, img: HTMLImageElement): Unit = js.native
  def CleanUrl(url: String): String = js.native
  def LoadImage(url: js.Any, onload: js.Any, onerror: js.Any, database: js.Any): HTMLImageElement = js.native
  def LoadFile(url: String, callback: js.Function1[js.Any, Unit], progressCallBack: js.Function1[js.Any, Unit] = ???, database: js.Any = ???, useArrayBuffer: Boolean = ???, onError: js.Function1[XMLHttpRequest, Unit] = ???): Unit = js.native
  def LoadScript(scriptUrl: String, onSuccess: js.Function0[Unit], onError: js.Function0[Unit] = ???): Unit = js.native
  def ReadFileAsDataURL(fileToLoad: js.Any, callback: js.Any, progressCallback: js.Any): Unit = js.native
  def ReadFile(fileToLoad: js.Any, callback: js.Any, progressCallBack: js.Any, useArrayBuffer: Boolean = ???): Unit = js.native
  def FileAsURL(content: String): String = js.native
  def Format(value: Double, decimals: Double = ???): String = js.native
  def CheckExtends(v: Vector3, min: Vector3, max: Vector3): Unit = js.native
  def DeepCopy(source: js.Any, destination: js.Any, doNotCopyList: js.Array[String] = ???, mustCopyList: js.Array[String] = ???): Unit = js.native
  def IsEmpty(obj: js.Any): Boolean = js.native
  def RegisterTopRootEvents(events: js.Array[js.Any]): Unit = js.native
  def UnregisterTopRootEvents(events: js.Array[js.Any]): Unit = js.native
  def DumpFramebuffer(width: Double, height: Double, engine: Engine, successCallback: js.Function1[String, Unit] = ???, mimeType: String = ???): Unit = js.native
  def EncodeScreenshotCanvasData(successCallback: js.Function1[String, Unit] = ???, mimeType: String = ???): Unit = js.native
  def CreateScreenshot(engine: Engine, camera: Camera, size: js.Any, successCallback: js.Function1[String, Unit] = ???, mimeType: String = ???): Unit = js.native
  def CreateScreenshotUsingRenderTarget(engine: Engine, camera: Camera, size: js.Any, successCallback: js.Function1[String, Unit] = ???, mimeType: String = ???, samples: Double = ???): Unit = js.native
  def ValidateXHRData(xhr: XMLHttpRequest, dataType: Double = ???): Boolean = js.native
  def RandomId(): String = js.native
  var errorsCount: Double = js.native
  var OnNewCacheEntry: js.Function1[String, Unit] = js.native
  def NoneLogLevel: Double = js.native
  def MessageLogLevel: Double = js.native
  def WarningLogLevel: Double = js.native
  def ErrorLogLevel: Double = js.native
  def AllLogLevel: Double = js.native
  var Log: js.Function1[String, Unit] = js.native
  var Warn: js.Function1[String, Unit] = js.native
  var Error: js.Function1[String, Unit] = js.native
  def LogCache: String = js.native
  def ClearLogCache(): Unit = js.native
  var LogLevels: Double = js.native
  def PerformanceNoneLogLevel: Double = js.native
  def PerformanceUserMarkLogLevel: Double = js.native
  def PerformanceConsoleLogLevel: Double = js.native
  var PerformanceLogLevel: Double = js.native
  var StartPerformanceCounter: js.Function2[String, Boolean, Unit] = js.native
  var EndPerformanceCounter: js.Function2[String, Boolean, Unit] = js.native
  def Now: Double = js.native
  def getClassName(`object`: js.Any, isType: Boolean = ???): String = js.native
  def first[T](array: js.Array[T], predicate: js.Function1[T, Boolean]): T = js.native
  def getFullClassName(`object`: js.Any, isType: Boolean = ???): String = js.native
  def arrayOrStringFeeder(array: js.Any): js.Function1[Double, Double] = js.native
  def hashCodeFromStream(feeder: js.Function1[Double, Double]): Double = js.native
}

@js.native
@JSGlobal("BABYLON.PerfCounter")
class PerfCounter extends js.Object {
  def min: Double = js.native
  def max: Double = js.native
  def average: Double = js.native
  def lastSecAverage: Double = js.native
  def current: Double = js.native
  def total: Double = js.native
  def fetchNewFrame(): Unit = js.native
  def addCount(newCount: Double, fetchResult: Boolean): Unit = js.native
  def beginMonitoring(): Unit = js.native
  def endMonitoring(newFrame: Boolean = ???): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.PerfCounter")
object PerfCounter extends js.Object {
  var Enabled: Boolean = js.native
}

@js.native
@JSGlobal("BABYLON.AsyncLoop")
class AsyncLoop extends js.Object {
  def this(iterations: Double, _fn: js.Function1[AsyncLoop, Unit], _successCallback: js.Function0[Unit], offset: Double = ???) = this()
  var iterations: Double = js.native
  var index: Double = js.native
  def executeNext(): Unit = js.native
  def breakLoop(): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.AsyncLoop")
object AsyncLoop extends js.Object {
  def Run(iterations: Double, _fn: js.Function1[AsyncLoop, Unit], _successCallback: js.Function0[Unit], offset: Double = ???): AsyncLoop = js.native
  def SyncAsyncForLoop(iterations: Double, syncedIterations: Double, fn: js.Function1[Double, Unit], callback: js.Function0[Unit], breakFunction: js.Function0[Boolean] = ???, timeout: Double = ???): Unit = js.native
}

@js.native
sealed trait JoystickAxis extends js.Object {
}

@js.native
@JSGlobal("BABYLON.JoystickAxis")
object JoystickAxis extends js.Object {
  var X: JoystickAxis = js.native
  var Y: JoystickAxis = js.native
  var Z: JoystickAxis = js.native
  @JSBracketAccess
  def apply(value: JoystickAxis): String = js.native
}

@js.native
@JSGlobal("BABYLON.VirtualJoystick")
class VirtualJoystick extends js.Object {
  def this(leftJoystick: Boolean = ???) = this()
  var reverseLeftRight: Boolean = js.native
  var reverseUpDown: Boolean = js.native
  var deltaPosition: Vector3 = js.native
  var pressed: Boolean = js.native
  def setJoystickSensibility(newJoystickSensibility: Double): Unit = js.native
  def setJoystickColor(newColor: String): Unit = js.native
  def setActionOnTouch(action: js.Function0[Any]): Unit = js.native
  def setAxisForLeftRight(axis: JoystickAxis): Unit = js.native
  def setAxisForUpDown(axis: JoystickAxis): Unit = js.native
  def releaseCanvas(): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.ArcRotateCameraGamepadInput")
class ArcRotateCameraGamepadInput extends ICameraInput[ArcRotateCamera] {

  var gamepad: Gamepad = js.native
  var gamepadRotationSensibility: Double = js.native
  var gamepadMoveSensibility: Double = js.native
  def detachControl(element: HTMLElement): Unit = js.native

  override def getTypeName(): String = js.native
  override def getSimpleName(): String = js.native
}

@js.native
@JSGlobal("BABYLON.ArcRotateCameraKeyboardMoveInput")
class ArcRotateCameraKeyboardMoveInput extends ICameraInput[ArcRotateCamera] {

  var keysUp: js.Array[Double] = js.native
  var keysDown: js.Array[Double] = js.native
  var keysLeft: js.Array[Double] = js.native
  var keysRight: js.Array[Double] = js.native
  def detachControl(element: HTMLElement): Unit = js.native

  override def getTypeName(): String = js.native
  override def getSimpleName(): String = js.native
}

@js.native
@JSGlobal("BABYLON.ArcRotateCameraMouseWheelInput")
class ArcRotateCameraMouseWheelInput extends ICameraInput[ArcRotateCamera] {

  var wheelPrecision: Double = js.native
  def attachControl(element: HTMLElement, noPreventDefault: Boolean = ???): Unit = js.native
  def detachControl(element: HTMLElement): Unit = js.native
  override def getTypeName(): String = js.native
  override def getSimpleName(): String = js.native
}

@js.native
@JSGlobal("BABYLON.ArcRotateCameraPointersInput")
class ArcRotateCameraPointersInput extends ICameraInput[ArcRotateCamera] {

  var buttons: js.Array[Double] = js.native
  var angularSensibilityX: Double = js.native
  var angularSensibilityY: Double = js.native
  var pinchPrecision: Double = js.native
  var panningSensibility: Double = js.native
  var pinchInwards: Boolean = js.native
  def attachControl(element: HTMLElement, noPreventDefault: Boolean = ???): Unit = js.native
  def detachControl(element: HTMLElement): Unit = js.native
  override def getTypeName(): String = js.native
  override def getSimpleName(): String = js.native
}

@js.native
@JSGlobal("BABYLON.ArcRotateCameraVRDeviceOrientationInput")
class ArcRotateCameraVRDeviceOrientationInput extends ICameraInput[ArcRotateCamera] {

  var alphaCorrection: Double = js.native
  var betaCorrection: Double = js.native
  var gammaCorrection: Double = js.native
  def attachControl(element: HTMLElement, noPreventDefault: Boolean = ???): Unit = js.native

  def detachControl(element: HTMLElement): Unit = js.native
  override def getTypeName(): String = js.native
  override def getSimpleName(): String = js.native
}

@js.native
@JSGlobal("BABYLON.FreeCameraDeviceOrientationInput")
class FreeCameraDeviceOrientationInput extends ICameraInput[FreeCamera] {

  def attachControl(element: HTMLElement, noPreventDefault: Boolean = ???): Unit = js.native
  def detachControl(element: HTMLElement): Unit = js.native

  override def getTypeName(): String = js.native
  override def getSimpleName(): String = js.native
}

@js.native
@JSGlobal("BABYLON.FreeCameraGamepadInput")
class FreeCameraGamepadInput extends ICameraInput[FreeCamera] {

  var gamepad: Gamepad = js.native
  var gamepadAngularSensibility: Double = js.native
  var gamepadMoveSensibility: Double = js.native
  def attachControl(element: HTMLElement, noPreventDefault: Boolean = ???): Unit = js.native
  def detachControl(element: HTMLElement): Unit = js.native

  override def getTypeName(): String = js.native
  override def getSimpleName(): String = js.native
}

@js.native
@JSGlobal("BABYLON.FreeCameraKeyboardMoveInput")
class FreeCameraKeyboardMoveInput extends ICameraInput[FreeCamera] {

  var keysUp: js.Array[Double] = js.native
  var keysDown: js.Array[Double] = js.native
  var keysLeft: js.Array[Double] = js.native
  var keysRight: js.Array[Double] = js.native
  def attachControl(element: HTMLElement, noPreventDefault: Boolean = ???): Unit = js.native
  def detachControl(element: HTMLElement): Unit = js.native

  override def getTypeName(): String = js.native
  override def getSimpleName(): String = js.native
}

@js.native
@JSGlobal("BABYLON.FreeCameraMouseInput")
class FreeCameraMouseInput extends ICameraInput[FreeCamera] {
  def this(touchEnabled: Boolean = ???) = this()
  var touchEnabled: Boolean = js.native

  var buttons: js.Array[Double] = js.native
  var angularSensibility: Double = js.native
  def attachControl(element: HTMLElement, noPreventDefault: Boolean = ???): Unit = js.native
  def detachControl(element: HTMLElement): Unit = js.native
  override def getTypeName(): String = js.native
  override def getSimpleName(): String = js.native
}

@js.native
@JSGlobal("BABYLON.FreeCameraTouchInput")
class FreeCameraTouchInput extends ICameraInput[FreeCamera] {

  var touchAngularSensibility: Double = js.native
  var touchMoveSensibility: Double = js.native
  def attachControl(element: HTMLElement, noPreventDefault: Boolean = ???): Unit = js.native
  def detachControl(element: HTMLElement): Unit = js.native

  override def getTypeName(): String = js.native
  override def getSimpleName(): String = js.native
}

@js.native
@JSGlobal("BABYLON.FreeCameraVirtualJoystickInput")
class FreeCameraVirtualJoystickInput extends ICameraInput[FreeCamera] {

  def getLeftJoystick(): VirtualJoystick = js.native
  def getRightJoystick(): VirtualJoystick = js.native

  def attachControl(element: HTMLElement, noPreventDefault: Boolean = ???): Unit = js.native
  def detachControl(element: HTMLElement): Unit = js.native
  override def getTypeName(): String = js.native
  override def getSimpleName(): String = js.native
}

@js.native
@JSGlobal("BABYLON.VRCameraMetrics")
class VRCameraMetrics extends js.Object {
  var hResolution: Double = js.native
  var vResolution: Double = js.native
  var hScreenSize: Double = js.native
  var vScreenSize: Double = js.native
  var vScreenCenter: Double = js.native
  var eyeToScreenDistance: Double = js.native
  var lensSeparationDistance: Double = js.native
  var interpupillaryDistance: Double = js.native
  var distortionK: js.Array[Double] = js.native
  var chromaAbCorrection: js.Array[Double] = js.native
  var postProcessScaleFactor: Double = js.native
  var lensCenterOffset: Double = js.native
  var compensateDistortion: Boolean = js.native
  def aspectRatio: Double = js.native
  def aspectRatioFov: Double = js.native
  def leftHMatrix: Matrix = js.native
  def rightHMatrix: Matrix = js.native
  def leftPreViewMatrix: Matrix = js.native
  def rightPreViewMatrix: Matrix = js.native
}

@js.native
@JSGlobal("BABYLON.VRCameraMetrics")
object VRCameraMetrics extends js.Object {
  def GetDefault(): VRCameraMetrics = js.native
}

@js.native
@JSGlobal("BABYLON.VRDeviceOrientationFreeCamera")
class VRDeviceOrientationFreeCamera extends DeviceOrientationCamera {
  def this(name: String, position: Vector3, scene: Scene, compensateDistortion: Boolean = ???, vrCameraMetrics: VRCameraMetrics = ???) = this()
  override def getClassName(): String = js.native
}

@js.native
@JSGlobal("BABYLON.VRDeviceOrientationGamepadCamera")
class VRDeviceOrientationGamepadCamera extends VRDeviceOrientationFreeCamera {
  def this(name: String, position: Vector3, scene: Scene, compensateDistortion: Boolean = ???, vrCameraMetrics: VRCameraMetrics = ???) = this()
  override def getClassName(): String = js.native
}

@js.native
@JSGlobal("BABYLON.VRDeviceOrientationArcRotateCamera")
class VRDeviceOrientationArcRotateCamera extends ArcRotateCamera {
  def this(name: String, alpha: Double, beta: Double, radius: Double, target: Vector3, scene: Scene, compensateDistortion: Boolean = ???, vrCameraMetrics: VRCameraMetrics = ???) = this()
  override def getClassName(): String = js.native
}

@js.native
trait DevicePose extends js.Object {
  def position: Float32Array = js.native
  def linearVelocity: Float32Array = js.native
  def linearAcceleration: Float32Array = js.native
  def orientation: Float32Array = js.native
  def angularVelocity: Float32Array = js.native
  def angularAcceleration: Float32Array = js.native
}

@js.native
trait PoseControlled extends js.Object {


  var devicePosition: Vector3 = js.native
  var deviceRotationQuaternion: Quaternion = js.native
  var rawPose: DevicePose = js.native
  var deviceScaleFactor: Double = js.native
  def updateFromDevice(poseData: DevicePose): js.Dynamic = js.native
}

@js.native
trait WebVROptions extends js.Object {
  var trackPosition: Boolean = js.native
  var positionScale: Double = js.native
  var displayName: String = js.native
  var controllerMeshes: Boolean = js.native
  var defaultLightningOnControllers: Boolean = js.native
}

@js.native
@JSGlobal("BABYLON.WebVRFreeCamera")
class WebVRFreeCamera extends FreeCamera with PoseControlled {
  def this(name: String, position: Vector3, scene: Scene, webVROptions: WebVROptions = ???) = this()

  protected var _descendants: js.Array[Node] = js.native



  var controllers: js.Array[WebVRController] = js.native
  var nonVRControllers: js.Array[Gamepad] = js.native
  var rigParenting: Boolean = js.native
  var onControllersAttached: js.Function1[js.Array[WebVRController], Unit] = js.native
  var onNonVRControllerAttached: js.Function1[Gamepad, Unit] = js.native
  def getControllerByName(name: String): WebVRController = js.native
  def leftController: WebVRController = js.native
  def rightController: WebVRController = js.native

  override def detachControl(element: HTMLElement): Unit = js.native
  override def getClassName(): String = js.native
  def resetToCurrentRotation(): Unit = js.native
  def initControllers(): Unit = js.native
}

@js.native
trait IOctreeContainer[T] extends js.Object {
  var blocks: js.Array[OctreeBlock[T]] = js.native
}

@js.native
@JSGlobal("BABYLON.Octree")
class Octree[T] extends js.Object {
  def this(creationFunc: js.Function2[T, OctreeBlock[T], Unit], maxBlockCapacity: Double = ???, maxDepth: Double = ???) = this()
  var maxDepth: Double = js.native
  var blocks: js.Array[OctreeBlock[T]] = js.native
  var dynamicContent: js.Array[T] = js.native
  def update(worldMin: Vector3, worldMax: Vector3, entries: js.Array[T]): Unit = js.native
  def addMesh(entry: T): Unit = js.native
  def select(frustumPlanes: js.Array[Plane], allowDuplicate: Boolean = ???): SmartArray[T] = js.native
  def intersects(sphereCenter: Vector3, sphereRadius: Double, allowDuplicate: Boolean = ???): SmartArray[T] = js.native
  def intersectsRay(ray: Ray): SmartArray[T] = js.native
}

@js.native
@JSGlobal("BABYLON.Octree")
object Octree extends js.Object {
  var CreationFuncForMeshes: js.Function2[AbstractMesh, OctreeBlock[AbstractMesh], Unit] = js.native
  var CreationFuncForSubMeshes: js.Function2[SubMesh, OctreeBlock[SubMesh], Unit] = js.native
}

@js.native
@JSGlobal("BABYLON.OctreeBlock")
class OctreeBlock[T] extends js.Object {
  def this(minPoint: Vector3, maxPoint: Vector3, capacity: Double, depth: Double, maxDepth: Double, creationFunc: js.Function2[T, OctreeBlock[T], Unit]) = this()
  var entries: js.Array[T] = js.native
  var blocks: js.Array[OctreeBlock[T]] = js.native
  def capacity: Double = js.native
  def minPoint: Vector3 = js.native
  def maxPoint: Vector3 = js.native
  def addEntry(entry: T): Unit = js.native
  def addEntries(entries: js.Array[T]): Unit = js.native
  def select(frustumPlanes: js.Array[Plane], selection: SmartArray[T], allowDuplicate: Boolean = ???): Unit = js.native
  def intersects(sphereCenter: Vector3, sphereRadius: Double, selection: SmartArray[T], allowDuplicate: Boolean = ???): Unit = js.native
  def intersectsRay(ray: Ray, selection: SmartArray[T]): Unit = js.native
  def createInnerBlocks(): Unit = js.native
}

@js.native
trait IShadowGenerator extends js.Object {
  def getShadowMap(): RenderTargetTexture = js.native
  def getShadowMapForRendering(): RenderTargetTexture = js.native
  def isReady(subMesh: SubMesh, useInstances: Boolean): Boolean = js.native
  def prepareDefines(defines: MaterialDefines, lightIndex: Double): Unit = js.native
  def bindShadowLight(lightIndex: String, effect: Effect): Unit = js.native
  def getTransformMatrix(): Matrix = js.native
  def recreateShadowMap(): Unit = js.native
  def serialize(): js.Dynamic = js.native
  def dispose(): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.ShadowGenerator")
class ShadowGenerator extends IShadowGenerator {
  def this(mapSize: Double, light: IShadowLight, useFullFloatFirst: Boolean = ???) = this()
  var bias: Double = js.native
  var blurBoxOffset: Double = js.native
  var blurScale: Double = js.native
  var blurKernel: Double = js.native
  var useKernelBlur: Boolean = js.native
  var depthScale: Double = js.native
  var filter: Double = js.native
  var usePoissonSampling: Boolean = js.native
  var useVarianceShadowMap: Boolean = js.native
  var useBlurVarianceShadowMap: Boolean = js.native
  var useExponentialShadowMap: Boolean = js.native
  var useBlurExponentialShadowMap: Boolean = js.native
  var useCloseExponentialShadowMap: Boolean = js.native
  var useBlurCloseExponentialShadowMap: Boolean = js.native
  def getDarkness(): Double = js.native
  def setDarkness(darkness: Double): ShadowGenerator = js.native
  def setTransparencyShadow(hasShadow: Boolean): ShadowGenerator = js.native
  override def getShadowMap(): RenderTargetTexture = js.native
  override def getShadowMapForRendering(): RenderTargetTexture = js.native
  def getLight(): IShadowLight = js.native
  var forceBackFacesOnly: Boolean = js.native
  override def isReady(subMesh: SubMesh, useInstances: Boolean): Boolean = js.native
  override def prepareDefines(defines: MaterialDefines, lightIndex: Double): Unit = js.native
  override def bindShadowLight(lightIndex: String, effect: Effect): Unit = js.native
  override def getTransformMatrix(): Matrix = js.native
  override def recreateShadowMap(): Unit = js.native
  override def dispose(): Unit = js.native
  override def serialize(): js.Dynamic = js.native
}

@js.native
@JSGlobal("BABYLON.ShadowGenerator")
object ShadowGenerator extends js.Object {
  def FILTER_NONE: Double = js.native
  def FILTER_POISSONSAMPLING: Double = js.native
  def FILTER_EXPONENTIALSHADOWMAP: Double = js.native
  def FILTER_BLUREXPONENTIALSHADOWMAP: Double = js.native
  def FILTER_CLOSEEXPONENTIALSHADOWMAP: Double = js.native
  def FILTER_BLURCLOSEEXPONENTIALSHADOWMAP: Double = js.native
  def Parse(parsedShadowGenerator: js.Any, scene: Scene): ShadowGenerator = js.native
}

@js.native
@JSGlobal("BABYLON.PBRBaseMaterial")
abstract class PBRBaseMaterial extends PushMaterial {
  def this(name: String, scene: Scene) = this()
  protected var _directIntensity: Double = js.native
  protected var _emissiveIntensity: Double = js.native
  protected var _environmentIntensity: Double = js.native
  protected var _specularIntensity: Double = js.native
  protected var _disableBumpMap: Boolean = js.native
  protected var _albedoTexture: BaseTexture = js.native
  protected var _ambientTexture: BaseTexture = js.native
  protected var _ambientTextureStrength: Double = js.native
  protected var _opacityTexture: BaseTexture = js.native
  protected var _reflectionTexture: BaseTexture = js.native
  protected var _refractionTexture: BaseTexture = js.native
  protected var _emissiveTexture: BaseTexture = js.native
  protected var _reflectivityTexture: BaseTexture = js.native
  protected var _metallicTexture: BaseTexture = js.native
  protected var _metallic: Double = js.native
  protected var _roughness: Double = js.native
  protected var _microSurfaceTexture: BaseTexture = js.native
  protected var _bumpTexture: BaseTexture = js.native
  protected var _lightmapTexture: BaseTexture = js.native
  protected var _ambientColor: Color3 = js.native
  protected var _albedoColor: Color3 = js.native
  protected var _reflectivityColor: Color3 = js.native
  protected var _reflectionColor: Color3 = js.native
  protected var _emissiveColor: Color3 = js.native
  protected var _microSurface: Double = js.native
  protected var _indexOfRefraction: Double = js.native
  protected var _invertRefractionY: Boolean = js.native
  protected var _linkRefractionWithTransparency: Boolean = js.native
  protected var _useLightmapAsShadowmap: Boolean = js.native
  protected var _useAlphaFromAlbedoTexture: Boolean = js.native
  protected var _useSpecularOverAlpha: Boolean = js.native
  protected var _useMicroSurfaceFromReflectivityMapAlpha: Boolean = js.native
  protected var _useRoughnessFromMetallicTextureAlpha: Boolean = js.native
  protected var _useRoughnessFromMetallicTextureGreen: Boolean = js.native
  protected var _useMetallnessFromMetallicTextureBlue: Boolean = js.native
  protected var _useAmbientOcclusionFromMetallicTextureRed: Boolean = js.native
  protected var _useAmbientInGrayScale: Boolean = js.native
  protected var _useAutoMicroSurfaceFromReflectivityMap: Boolean = js.native
  protected var _usePhysicalLightFalloff: Boolean = js.native
  protected var _useRadianceOverAlpha: Boolean = js.native
  protected var _useParallax: Boolean = js.native
  protected var _useParallaxOcclusion: Boolean = js.native
  protected var _parallaxScaleBias: Double = js.native
  protected var _disableLighting: Boolean = js.native
  protected var _maxSimultaneousLights: Double = js.native
  protected var _invertNormalMapX: Boolean = js.native
  protected var _invertNormalMapY: Boolean = js.native
  protected var _twoSidedLighting: Boolean = js.native
  protected var _alphaCutOff: Double = js.native
  protected var _forceAlphaTest: Boolean = js.native
  protected var _premultiplyAlpha: Boolean = js.native
  protected var _useAlphaFresnel: Boolean = js.native
  protected var _environmentBRDFTexture: BaseTexture = js.native
  protected var _imageProcessingConfiguration: ImageProcessingConfiguration = js.native
  def getClassName(): String
  var useLogarithmicDepth: Boolean = js.native
  override def needAlphaBlending(): Boolean = js.native
  override def needAlphaTesting(): Boolean = js.native
  override def getAlphaTestTexture(): BaseTexture = js.native
  def buildUniformLayout(): Unit = js.native
  override def unbind(): Unit = js.native
  override def bindOnlyWorldMatrix(world: Matrix): Unit = js.native
  override def bindForSubMesh(world: Matrix, mesh: Mesh, subMesh: SubMesh): Unit = js.native
  def getAnimatables(): js.Array[IAnimatable] = js.native
  override def dispose(forceDisposeEffect: Boolean = ???, forceDisposeTextures: Boolean = ???): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.PBRMaterial")
class PBRMaterial extends PBRBaseMaterial {
  def this(name: String, scene: Scene) = this()
  var directIntensity: Double = js.native
  var emissiveIntensity: Double = js.native
  var environmentIntensity: Double = js.native
  var specularIntensity: Double = js.native
  var disableBumpMap: Boolean = js.native
  var albedoTexture: BaseTexture = js.native
  var ambientTexture: BaseTexture = js.native
  var ambientTextureStrength: Double = js.native
  var opacityTexture: BaseTexture = js.native
  var reflectionTexture: BaseTexture = js.native
  var emissiveTexture: BaseTexture = js.native
  var reflectivityTexture: BaseTexture = js.native
  var metallicTexture: BaseTexture = js.native
  var metallic: Double = js.native
  var roughness: Double = js.native
  var microSurfaceTexture: BaseTexture = js.native
  var bumpTexture: BaseTexture = js.native
  var lightmapTexture: BaseTexture = js.native
  var refractionTexture: BaseTexture = js.native
  var ambientColor: Color3 = js.native
  var albedoColor: Color3 = js.native
  var reflectivityColor: Color3 = js.native
  var reflectionColor: Color3 = js.native
  var emissiveColor: Color3 = js.native
  var microSurface: Double = js.native
  var indexOfRefraction: Double = js.native
  var invertRefractionY: Boolean = js.native
  var linkRefractionWithTransparency: Boolean = js.native
  var useLightmapAsShadowmap: Boolean = js.native
  var useAlphaFromAlbedoTexture: Boolean = js.native
  var useSpecularOverAlpha: Boolean = js.native
  var useMicroSurfaceFromReflectivityMapAlpha: Boolean = js.native
  var useRoughnessFromMetallicTextureAlpha: Boolean = js.native
  var useRoughnessFromMetallicTextureGreen: Boolean = js.native
  var useMetallnessFromMetallicTextureBlue: Boolean = js.native
  var useAmbientOcclusionFromMetallicTextureRed: Boolean = js.native
  var useAmbientInGrayScale: Boolean = js.native
  var useAutoMicroSurfaceFromReflectivityMap: Boolean = js.native
  var usePhysicalLightFalloff: Boolean = js.native
  var useRadianceOverAlpha: Boolean = js.native
  var useParallax: Boolean = js.native
  var useParallaxOcclusion: Boolean = js.native
  var parallaxScaleBias: Double = js.native
  var disableLighting: Boolean = js.native
  var maxSimultaneousLights: Double = js.native
  var invertNormalMapX: Boolean = js.native
  var invertNormalMapY: Boolean = js.native
  var twoSidedLighting: Boolean = js.native
  var premultiplyAlpha: Boolean = js.native
  var useAlphaFresnel: Boolean = js.native
  var environmentBRDFTexture: BaseTexture = js.native
  var imageProcessingConfiguration: ImageProcessingConfiguration = js.native
  var cameraColorCurvesEnabled: Boolean = js.native
  var cameraColorGradingEnabled: Boolean = js.native
  var cameraToneMappingEnabled: Boolean = js.native
  var cameraExposure: Double = js.native
  var cameraContrast: Double = js.native
  var cameraColorGradingTexture: BaseTexture = js.native
  var cameraColorCurves: ColorCurves = js.native
  override def getClassName(): String = js.native
  override def getActiveTextures(): js.Array[BaseTexture] = js.native
  override def hasTexture(texture: BaseTexture): Boolean = js.native
  override def clone(name: String): PBRMaterial = js.native
  override def serialize(): js.Dynamic = js.native
}

@js.native
@JSGlobal("BABYLON.PBRMaterial")
object PBRMaterial extends js.Object {
  def PBRMATERIAL_OPAQUE: Double = js.native
  def PBRMATERIAL_ALPHATEST: Double = js.native
  def PBRMATERIAL_ALPHABLEND: Double = js.native
  def PBRMATERIAL_ALPHATESTANDBLEND: Double = js.native
  def Parse(source: js.Any, scene: Scene, rootUrl: String): PBRMaterial = js.native
}

@js.native
@JSGlobal("BABYLON.PBRMetallicRoughnessMaterial")
class PBRMetallicRoughnessMaterial extends Internals.PBRBaseSimpleMaterial {
  def this(name: String, scene: Scene) = this()
  var baseColor: Color3 = js.native
  var baseTexture: BaseTexture = js.native
  var metallic: Double = js.native
  var roughness: Double = js.native
  var metallicRoughnessTexture: BaseTexture = js.native
  override def getClassName(): String = js.native
  override def getActiveTextures(): js.Array[BaseTexture] = js.native
  override def hasTexture(texture: BaseTexture): Boolean = js.native
  override def clone(name: String): PBRMetallicRoughnessMaterial = js.native
  override def serialize(): js.Dynamic = js.native
}

@js.native
@JSGlobal("BABYLON.PBRMetallicRoughnessMaterial")
object PBRMetallicRoughnessMaterial extends js.Object {
  def Parse(source: js.Any, scene: Scene, rootUrl: String): PBRMetallicRoughnessMaterial = js.native
}

@js.native
@JSGlobal("BABYLON.PBRSpecularGlossinessMaterial")
class PBRSpecularGlossinessMaterial extends Internals.PBRBaseSimpleMaterial {
  def this(name: String, scene: Scene) = this()
  var diffuseColor: Color3 = js.native
  var diffuseTexture: BaseTexture = js.native
  var specularColor: Color3 = js.native
  var glossiness: Double = js.native
  var specularGlossinessTexture: BaseTexture = js.native
  override def getClassName(): String = js.native
  override def getActiveTextures(): js.Array[BaseTexture] = js.native
  override def hasTexture(texture: BaseTexture): Boolean = js.native
  override def clone(name: String): PBRSpecularGlossinessMaterial = js.native
  override def serialize(): js.Dynamic = js.native
}

@js.native
@JSGlobal("BABYLON.PBRSpecularGlossinessMaterial")
object PBRSpecularGlossinessMaterial extends js.Object {
  def Parse(source: js.Any, scene: Scene, rootUrl: String): PBRSpecularGlossinessMaterial = js.native
}

@js.native
@JSGlobal("BABYLON.BaseTexture")
class BaseTexture extends js.Object {
  def this(scene: Scene) = this()
  var name: String = js.native
  var hasAlpha: Boolean = js.native
  var getAlphaFromRGB: Boolean = js.native
  var level: Double = js.native
  var coordinatesIndex: Double = js.native
  var coordinatesMode: Double = js.native
  var wrapU: Double = js.native
  var wrapV: Double = js.native
  var anisotropicFilteringLevel: Double = js.native
  var isCube: Boolean = js.native
  var gammaSpace: Boolean = js.native
  var invertZ: Boolean = js.native
  var lodLevelInAlpha: Boolean = js.native
  var lodGenerationOffset: Double = js.native
  var lodGenerationScale: Double = js.native
  var isRenderTarget: Boolean = js.native
  def uid: String = js.native
  override def toString(): String = js.native
  var animations: js.Array[Animation] = js.native
  var onDisposeObservable: Observable[BaseTexture] = js.native
  var onDispose: js.Function0[Unit] = js.native
  var delayLoadState: Double = js.native
  def isBlocking: Boolean = js.native
  def getScene(): Scene = js.native
  def getTextureMatrix(): Matrix = js.native
  def getReflectionTextureMatrix(): Matrix = js.native
  def getInternalTexture(): WebGLTexture = js.native
  def isReadyOrNotBlocking(): Boolean = js.native
  def isReady(): Boolean = js.native
  def getSize(): ISize = js.native
  def getBaseSize(): ISize = js.native
  def scale(ratio: Double): Unit = js.native
  def canRescale: Boolean = js.native
  def delayLoad(): Unit = js.native
  override def clone(): BaseTexture = js.native
  def textureType: Double = js.native
  def textureFormat: Double = js.native
  def readPixels(faceIndex: Double = ???): ArrayBufferView = js.native
  def releaseInternalTexture(): Unit = js.native
  var sphericalPolynomial: SphericalPolynomial = js.native
  def dispose(): Unit = js.native
  def serialize(): js.Dynamic = js.native
}

@js.native
@JSGlobal("BABYLON.BaseTexture")
object BaseTexture extends js.Object {
  var DEFAULT_ANISOTROPIC_FILTERING_LEVEL: Double = js.native
  def WhenAllReady(textures: js.Array[BaseTexture], onLoad: js.Function0[Unit]): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.ColorGradingTexture")
class ColorGradingTexture extends BaseTexture {
  def this(url: String, scene: Scene) = this()
  var url: String = js.native
  override def getTextureMatrix(): Matrix = js.native
  override def clone(): ColorGradingTexture = js.native
  override def delayLoad(): Unit = js.native
  override def serialize(): js.Dynamic = js.native
}

@js.native
@JSGlobal("BABYLON.ColorGradingTexture")
object ColorGradingTexture extends js.Object {
  def Parse(parsedTexture: js.Any, scene: Scene, rootUrl: String): ColorGradingTexture = js.native
}

@js.native
@JSGlobal("BABYLON.CubeTexture")
class CubeTexture extends BaseTexture {
  def this(rootUrl: String, scene: Scene, extensions: js.Array[String] = ???, noMipmap: Boolean = ???, files: js.Array[String] = ???, onLoad: js.Function0[Unit] = ???, onError: js.Function0[Unit] = ???, format: Double = ???, prefiltered: Boolean = ???) = this()
  var url: String = js.native

  override def delayLoad(): Unit = js.native
  override def getReflectionTextureMatrix(): Matrix = js.native
  def setReflectionTextureMatrix(value: Matrix): Unit = js.native
  override def clone(): CubeTexture = js.native
}

@js.native
@JSGlobal("BABYLON.CubeTexture")
object CubeTexture extends js.Object {
  def CreateFromImages(files: js.Array[String], scene: Scene, noMipmap: Boolean = ???): CubeTexture = js.native
  def CreateFromPrefilteredData(url: String, scene: Scene): CubeTexture = js.native
  def Parse(parsedTexture: js.Any, scene: Scene, rootUrl: String): CubeTexture = js.native
}

@js.native
@JSGlobal("BABYLON.DynamicTexture")
class DynamicTexture extends Texture {
  def this(name: String, options: js.Any, scene: Scene, generateMipMaps: Boolean, samplingMode: Double = ???, format: Double = ???) = this()
  override def canRescale: Boolean = js.native
  override def scale(ratio: Double): Unit = js.native
  def scaleTo(width: Double, height: Double): Unit = js.native
  def getContext(): CanvasRenderingContext2D = js.native
  def clear(): Unit = js.native
  def update(invertY: Boolean = ???): Unit = js.native
  def drawText(text: String, x: Double, y: Double, font: String, color: String, clearColor: String, invertY: Boolean = ???, update: Boolean = ???): Unit = js.native
  override def clone(): DynamicTexture = js.native
}

@js.native
@JSGlobal("BABYLON.HDRCubeTexture")
class HDRCubeTexture extends BaseTexture {
  def this(url: String, scene: Scene, size: Double = ???, noMipmap: Boolean = ???, generateHarmonics: Boolean = ???, useInGammaSpace: Boolean = ???, usePMREMGenerator: Boolean = ???, onLoad: js.Function0[Unit] = ???, onError: js.Function0[Unit] = ???) = this()
  var url: String = js.native

  var isPMREM: Boolean = js.native
  protected var _isBlocking: Boolean = js.native
  override def clone(): HDRCubeTexture = js.native
  override def delayLoad(): Unit = js.native
  override def getReflectionTextureMatrix(): Matrix = js.native
  def setReflectionTextureMatrix(value: Matrix): Unit = js.native
  override def serialize(): js.Dynamic = js.native
}

@js.native
@JSGlobal("BABYLON.HDRCubeTexture")
object HDRCubeTexture extends js.Object {
  def Parse(parsedTexture: js.Any, scene: Scene, rootUrl: String): HDRCubeTexture = js.native
  def generateBabylonHDROnDisk(url: String, size: Double, onError: js.Function0[Unit] = ???): Unit = js.native
  def generateBabylonHDR(url: String, size: Double, callback: js.Function1[ArrayBuffer, Unit], onError: js.Function0[Unit] = ???): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.MapTexture")
class MapTexture extends Texture {
  def this(name: String, scene: Scene, size: ISize, samplingMode: Double = ???, useMipMap: Boolean = ???, margin: Double = ???) = this()
  def allocateRect(size: Size): PackedRect = js.native
  def freeRect(rectInfo: PackedRect): Unit = js.native
  def freeSpace: Double = js.native
  def bindTextureForRect(rect: PackedRect, clear: Boolean): Unit = js.native
  def bindTextureForPosSize(pos: Vector2, size: Size, clear: Boolean): Unit = js.native
  def unbindTexture(dumpForDebug: Boolean = ???): Unit = js.native
  override def canRescale: Boolean = js.native
  override def clone(): MapTexture = js.native
}

@js.native
@JSGlobal("BABYLON.MirrorTexture")
class MirrorTexture extends RenderTargetTexture {
  def this(name: String, size: js.Any, scene: Scene, generateMipMaps: Boolean = ???, `type`: Double = ???, samplingMode: Double = ???, generateDepthBuffer: Boolean = ???) = this()
  var mirrorPlane: Plane = js.native
  var blurRatio: Double = js.native
  var blurKernel: Double = js.native
  var blurKernelX: Double = js.native
  var blurKernelY: Double = js.native
  override def clone(): MirrorTexture = js.native
  override def serialize(): js.Dynamic = js.native
}

@js.native
trait IMultiRenderTargetOptions extends js.Object {
  var generateMipMaps: Boolean = js.native
  var types: js.Array[Double] = js.native
  var samplingModes: js.Array[Double] = js.native
  var generateDepthBuffer: Boolean = js.native
  var generateStencilBuffer: Boolean = js.native
  var generateDepthTexture: Boolean = js.native
  var textureCount: Double = js.native
}

@js.native
@JSGlobal("BABYLON.MultiRenderTarget")
class MultiRenderTarget extends RenderTargetTexture {
  def this(name: String, size: js.Any, count: Double, scene: Scene, options: js.Any = ???) = this()
  def isSupported: Boolean = js.native
  def textures: js.Array[Texture] = js.native
  def depthTexture: Texture = js.native

  override def resize(size: js.Any): Unit = js.native
  override def dispose(): Unit = js.native
  def releaseInternalTextures(): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.RawTexture")
class RawTexture extends Texture {
  def this(data: ArrayBufferView, width: Double, height: Double, format: Double, scene: Scene, generateMipMaps: Boolean = ???, invertY: Boolean = ???, samplingMode: Double = ???) = this()
  var format: Double = js.native
  def update(data: ArrayBufferView): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.RawTexture")
object RawTexture extends js.Object {
  def CreateLuminanceTexture(data: ArrayBufferView, width: Double, height: Double, scene: Scene, generateMipMaps: Boolean = ???, invertY: Boolean = ???, samplingMode: Double = ???): RawTexture = js.native
  def CreateLuminanceAlphaTexture(data: ArrayBufferView, width: Double, height: Double, scene: Scene, generateMipMaps: Boolean = ???, invertY: Boolean = ???, samplingMode: Double = ???): RawTexture = js.native
  def CreateAlphaTexture(data: ArrayBufferView, width: Double, height: Double, scene: Scene, generateMipMaps: Boolean = ???, invertY: Boolean = ???, samplingMode: Double = ???): RawTexture = js.native
  def CreateRGBTexture(data: ArrayBufferView, width: Double, height: Double, scene: Scene, generateMipMaps: Boolean = ???, invertY: Boolean = ???, samplingMode: Double = ???): RawTexture = js.native
  def CreateRGBATexture(data: ArrayBufferView, width: Double, height: Double, scene: Scene, generateMipMaps: Boolean = ???, invertY: Boolean = ???, samplingMode: Double = ???): RawTexture = js.native
}

@js.native
@JSGlobal("BABYLON.RefractionTexture")
class RefractionTexture extends RenderTargetTexture {
  def this(name: String, size: Double, scene: Scene, generateMipMaps: Boolean = ???) = this()
  var refractionPlane: Plane = js.native
  var depth: Double = js.native
  override def clone(): RefractionTexture = js.native
  override def serialize(): js.Dynamic = js.native
}

@js.native
trait IRenderTargetOptions extends js.Object {
  var generateMipMaps: Boolean = js.native
  var `type`: Double = js.native
  var samplingMode: Double = js.native
  var generateDepthBuffer: Boolean = js.native
  var generateStencilBuffer: Boolean = js.native
}

@js.native
@JSGlobal("BABYLON.RenderTargetTexture")
class RenderTargetTexture extends Texture {
  def this(name: String, size: js.Any, scene: Scene, generateMipMaps: Boolean = ???, doNotChangeAspectRatio: Boolean = ???, `type`: Double = ???, isCube: Boolean = ???, samplingMode: Double = ???, generateDepthBuffer: Boolean = ???, generateStencilBuffer: Boolean = ???, isMulti: Boolean = ???) = this()

  var renderListPredicate: js.Function1[AbstractMesh, Boolean] = js.native
  var renderList: js.Array[AbstractMesh] = js.native
  var renderParticles: Boolean = js.native
  var renderSprites: Boolean = js.native

  var activeCamera: Camera = js.native
  var customRenderFunction: js.Function4[SmartArray[SubMesh], SmartArray[SubMesh], SmartArray[SubMesh], js.Function0[Unit], Unit] = js.native
  var useCameraPostProcesses: Boolean = js.native
  var onAfterUnbindObservable: Observable[RenderTargetTexture] = js.native
  var onAfterUnbind: js.Function0[Unit] = js.native
  var onBeforeRenderObservable: Observable[Double] = js.native
  var onBeforeRender: js.Function1[Double, Unit] = js.native
  var onAfterRenderObservable: Observable[Double] = js.native
  var onAfterRender: js.Function1[Double, Unit] = js.native
  var onClearObservable: Observable[Engine] = js.native
  var onClear: js.Function1[Engine, Unit] = js.native
  protected var _size: Double = js.native
  protected var _renderingManager: RenderingManager = js.native
  protected var _doNotChangeAspectRatio: Boolean = js.native
  protected var _currentRefreshId: Double = js.native
  protected var _refreshRate: Double = js.native
  protected var _textureMatrix: Matrix = js.native
  protected var _samples: Double = js.native
  protected var _renderTargetOptions: IRenderTargetOptions = js.native
  def renderTargetOptions: IRenderTargetOptions = js.native
  var samples: Double = js.native
  def resetRefreshCounter(): Unit = js.native
  var refreshRate: Double = js.native
  def addPostProcess(postProcess: PostProcess): Unit = js.native
  def clearPostProcesses(dispose: Boolean = ???): Unit = js.native
  def removePostProcess(postProcess: PostProcess): Unit = js.native
  override def isReady(): Boolean = js.native
  def getRenderSize(): Double = js.native
  override def canRescale: Boolean = js.native
  override def scale(ratio: Double): Unit = js.native
  override def getReflectionTextureMatrix(): Matrix = js.native
  def resize(size: js.Any): Unit = js.native
  def render(useCameraPostProcess: Boolean = ???, dumpForDebug: Boolean = ???): Unit = js.native
  def setRenderingOrder(renderingGroupId: Double, opaqueSortCompareFn: js.Function2[SubMesh, SubMesh, Double] = ???, alphaTestSortCompareFn: js.Function2[SubMesh, SubMesh, Double] = ???, transparentSortCompareFn: js.Function2[SubMesh, SubMesh, Double] = ???): Unit = js.native
  def setRenderingAutoClearDepthStencil(renderingGroupId: Double, autoClearDepthStencil: Boolean): Unit = js.native
  override def clone(): RenderTargetTexture = js.native
  override def serialize(): js.Dynamic = js.native
  def disposeFramebufferObjects(): Unit = js.native
  override def dispose(): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.RenderTargetTexture")
object RenderTargetTexture extends js.Object {
  def REFRESHRATE_RENDER_ONCE: Double = js.native
  def REFRESHRATE_RENDER_ONEVERYFRAME: Double = js.native
  def REFRESHRATE_RENDER_ONEVERYTWOFRAMES: Double = js.native
}

@js.native
@JSGlobal("BABYLON.Texture")
class Texture extends BaseTexture {
  def this(url: String, scene: Scene, noMipmap: Boolean = ???, invertY: Boolean = ???, samplingMode: Double = ???, onLoad: js.Function0[Unit] = ???, onError: js.Function0[Unit] = ???, buffer: js.Any = ???, deleteBuffer: Boolean = ???, format: Double = ???) = this()
  var url: String = js.native
  var uOffset: Double = js.native
  var vOffset: Double = js.native
  var uScale: Double = js.native
  var vScale: Double = js.native
  var uAng: Double = js.native
  var vAng: Double = js.native
  var wAng: Double = js.native
  def noMipmap: Boolean = js.native
  protected var _format: Double = js.native
  protected var _isBlocking: Boolean = js.native
  def updateURL(url: String): Unit = js.native
  override def delayLoad(): Unit = js.native
  def updateSamplingMode(samplingMode: Double): Unit = js.native
  override def getTextureMatrix(): Matrix = js.native
  override def getReflectionTextureMatrix(): Matrix = js.native
  override def clone(): Texture = js.native
  def onLoadObservable: Observable[Texture] = js.native
}

@js.native
@JSGlobal("BABYLON.Texture")
object Texture extends js.Object {
  var NEAREST_SAMPLINGMODE: Double = js.native
  var BILINEAR_SAMPLINGMODE: Double = js.native
  var TRILINEAR_SAMPLINGMODE: Double = js.native
  var EXPLICIT_MODE: Double = js.native
  var SPHERICAL_MODE: Double = js.native
  var PLANAR_MODE: Double = js.native
  var CUBIC_MODE: Double = js.native
  var PROJECTION_MODE: Double = js.native
  var SKYBOX_MODE: Double = js.native
  var INVCUBIC_MODE: Double = js.native
  var EQUIRECTANGULAR_MODE: Double = js.native
  var FIXED_EQUIRECTANGULAR_MODE: Double = js.native
  var FIXED_EQUIRECTANGULAR_MIRRORED_MODE: Double = js.native
  var CLAMP_ADDRESSMODE: Double = js.native
  var WRAP_ADDRESSMODE: Double = js.native
  var MIRROR_ADDRESSMODE: Double = js.native
  def CreateFromBase64String(data: String, name: String, scene: Scene, noMipmap: Boolean = ???, invertY: Boolean = ???, samplingMode: Double = ???, onLoad: js.Function0[Unit] = ???, onError: js.Function0[Unit] = ???, format: Double = ???): Texture = js.native
  def Parse(parsedTexture: js.Any, scene: Scene, rootUrl: String): BaseTexture = js.native
  def LoadFromDataString(name: String, buffer: js.Any, scene: Scene, deleteBuffer: Boolean = ???, noMipmap: Boolean = ???, invertY: Boolean = ???, samplingMode: Double = ???, onLoad: js.Function0[Unit] = ???, onError: js.Function0[Unit] = ???, format: Double = ???): Texture = js.native
}

@js.native
@JSGlobal("BABYLON.VideoTexture")
class VideoTexture extends Texture {
  def this(name: String, urlsOrVideo: js.Array[String] | HTMLVideoElement, scene: Scene, generateMipMaps: Boolean = ???, invertY: Boolean = ???, samplingMode: Double = ???) = this()
  var video: HTMLVideoElement = js.native
  def update(): Boolean = js.native
  override def dispose(): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.VideoTexture")
object VideoTexture extends js.Object {
  def CreateFromWebCam(scene: Scene, onReady: js.Function1[VideoTexture, Unit], constraints: js.Any): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.CannonJSPlugin")
class CannonJSPlugin extends IPhysicsEnginePlugin {
  def this(_useDeltaForWorldStep: Boolean = ???, iterations: Double = ???) = this()




  override def executeStep(delta: Double, impostors: js.Array[PhysicsImpostor]): Unit = js.native








  override def isSupported(): Boolean = js.native


  override def getLinearVelocity(impostor: PhysicsImpostor): Vector3 = js.native
  override def getAngularVelocity(impostor: PhysicsImpostor): Vector3 = js.native











  override def getRadius(impostor: PhysicsImpostor): Double = js.native


}

@js.native
@JSGlobal("BABYLON.OimoJSPlugin")
class OimoJSPlugin extends IPhysicsEnginePlugin {
  def this(iterations: Double = ???) = this()




  override def executeStep(delta: Double, impostors: js.Array[PhysicsImpostor]): Unit = js.native






  override def isSupported(): Boolean = js.native




  override def getLinearVelocity(impostor: PhysicsImpostor): Vector3 = js.native
  override def getAngularVelocity(impostor: PhysicsImpostor): Vector3 = js.native












  override def getRadius(impostor: PhysicsImpostor): Double = js.native


}

@js.native
@JSGlobal("BABYLON.PostProcessRenderEffect")
class PostProcessRenderEffect extends js.Object {
  def this(engine: Engine, name: String, getPostProcess: js.Function0[PostProcess], singleInstance: Boolean = ???) = this()
  var applyParameters: js.Function1[PostProcess, Unit] = js.native
  def isSupported: Boolean = js.native
  def addPass(renderPass: PostProcessRenderPass): Unit = js.native
  def removePass(renderPass: PostProcessRenderPass): Unit = js.native
  def addRenderEffectAsPass(renderEffect: PostProcessRenderEffect): Unit = js.native
  def getPass(passName: String): Unit = js.native
  def emptyPasses(): Unit = js.native
  def getPostProcess(camera: Camera = ???): PostProcess = js.native
}

@js.native
@JSGlobal("BABYLON.PostProcessRenderPass")
class PostProcessRenderPass extends js.Object {
  def this(scene: Scene, name: String, size: Double, renderList: js.Array[Mesh], beforeRender: js.Function0[Unit], afterRender: js.Function0[Unit]) = this()
  def setRenderList(renderList: js.Array[Mesh]): Unit = js.native
  def getRenderTexture(): RenderTargetTexture = js.native
}

@js.native
@JSGlobal("BABYLON.PostProcessRenderPipeline")
class PostProcessRenderPipeline extends js.Object {
  def this(engine: Engine, name: String) = this()
  protected var _cameras: js.Array[Camera] = js.native
  def isSupported: Boolean = js.native
  def addEffect(renderEffect: PostProcessRenderEffect): Unit = js.native
  def dispose(): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.PostProcessRenderPipelineManager")
class PostProcessRenderPipelineManager extends js.Object {
  def addPipeline(renderPipeline: PostProcessRenderPipeline): Unit = js.native
  def attachCamerasToRenderPipeline(renderPipelineName: String, cameras: js.Array[Camera], unique: Boolean = ???): js.Dynamic = js.native
  def detachCamerasFromRenderPipeline(renderPipelineName: String, cameras: Camera): js.Dynamic = js.native
  def detachCamerasFromRenderPipeline(renderPipelineName: String, cameras: js.Array[Camera]): js.Dynamic = js.native
  def enableEffectInPipeline(renderPipelineName: String, renderEffectName: String, cameras: Camera): js.Dynamic = js.native
  def enableEffectInPipeline(renderPipelineName: String, renderEffectName: String, cameras: js.Array[Camera]): js.Dynamic = js.native
  def disableEffectInPipeline(renderPipelineName: String, renderEffectName: String, cameras: Camera): js.Dynamic = js.native
  def disableEffectInPipeline(renderPipelineName: String, renderEffectName: String, cameras: js.Array[Camera]): js.Dynamic = js.native
  def enableDisplayOnlyPassInPipeline(renderPipelineName: String, passName: String, cameras: Camera): js.Dynamic = js.native
  def enableDisplayOnlyPassInPipeline(renderPipelineName: String, passName: String, cameras: js.Array[Camera]): js.Dynamic = js.native
  def disableDisplayOnlyPassInPipeline(renderPipelineName: String, cameras: Camera): js.Dynamic = js.native
  def disableDisplayOnlyPassInPipeline(renderPipelineName: String, cameras: js.Array[Camera]): js.Dynamic = js.native
  def update(): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.CustomProceduralTexture")
class CustomProceduralTexture extends ProceduralTexture {
  def this(name: String, texturePath: js.Any, size: Double, scene: Scene, fallbackTexture: Texture = ???, generateMipMaps: Boolean = ???) = this()
  override def isReady(): Boolean = js.native
  override def render(useCameraPostProcess: Boolean = ???): Unit = js.native
  def updateTextures(): Unit = js.native
  def updateShaderUniforms(): Unit = js.native
  var animate: Boolean = js.native
}

@js.native
@JSGlobal("BABYLON.ProceduralTexture")
class ProceduralTexture extends Texture {
  def this(name: String, size: js.Any, fragment: js.Any, scene: Scene, fallbackTexture: Texture = ???, generateMipMaps: Boolean = ???, isCube: Boolean = ???) = this()

  var isEnabled: Boolean = js.native
  var onGenerated: js.Function0[Unit] = js.native
  def reset(): Unit = js.native
  override def isReady(): Boolean = js.native
  def resetRefreshCounter(): Unit = js.native
  def setFragment(fragment: js.Any): Unit = js.native
  var refreshRate: Double = js.native
  def getRenderSize(): Double = js.native
  def resize(size: js.Any, generateMipMaps: js.Any): Unit = js.native
  def setTexture(name: String, texture: Texture): ProceduralTexture = js.native
  def setFloat(name: String, value: Double): ProceduralTexture = js.native
  def setFloats(name: String, value: js.Array[Double]): ProceduralTexture = js.native
  def setColor3(name: String, value: Color3): ProceduralTexture = js.native
  def setColor4(name: String, value: Color4): ProceduralTexture = js.native
  def setVector2(name: String, value: Vector2): ProceduralTexture = js.native
  def setVector3(name: String, value: Vector3): ProceduralTexture = js.native
  def setMatrix(name: String, value: Matrix): ProceduralTexture = js.native
  def render(useCameraPostProcess: Boolean = ???): Unit = js.native
  override def clone(): ProceduralTexture = js.native
  override def dispose(): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.DefaultRenderingPipeline")
class DefaultRenderingPipeline extends PostProcessRenderPipeline with IDisposable with IAnimatable {
  def this(name: String, hdr: Boolean, scene: Scene, cameras: js.Array[Camera] = ???) = this()
  def PassPostProcessId: String = js.native
  def HighLightsPostProcessId: String = js.native
  def BlurXPostProcessId: String = js.native
  def BlurYPostProcessId: String = js.native
  def CopyBackPostProcessId: String = js.native
  def ImageProcessingPostProcessId: String = js.native
  def FxaaPostProcessId: String = js.native
  def FinalMergePostProcessId: String = js.native
  var pass: PassPostProcess = js.native
  var highlights: HighlightsPostProcess = js.native
  var blurX: BlurPostProcess = js.native
  var blurY: BlurPostProcess = js.native
  var copyBack: PassPostProcess = js.native
  var fxaa: FxaaPostProcess = js.native
  var imageProcessing: ImageProcessingPostProcess = js.native
  var finalMerge: PassPostProcess = js.native

  var bloomKernel: Double = js.native
  var bloomWeight: Double = js.native
  var bloomScale: Double = js.native
  var bloomEnabled: Boolean = js.native
  var fxaaEnabled: Boolean = js.native
  var imageProcessingEnabled: Boolean = js.native
  override def dispose(): Unit = js.native
  def serialize(): js.Dynamic = js.native
}

@js.native
@JSGlobal("BABYLON.DefaultRenderingPipeline")
object DefaultRenderingPipeline extends js.Object {
  def Parse(source: js.Any, scene: Scene, rootUrl: String): DefaultRenderingPipeline = js.native
}

@js.native
@JSGlobal("BABYLON.LensRenderingPipeline")
class LensRenderingPipeline extends PostProcessRenderPipeline {
  def this(name: String, parameters: js.Any, scene: Scene, ratio: Double = ???, cameras: js.Array[Camera] = ???) = this()
  var LensChromaticAberrationEffect: String = js.native
  var HighlightsEnhancingEffect: String = js.native
  var LensDepthOfFieldEffect: String = js.native
  def setEdgeBlur(amount: Double): Unit = js.native
  def disableEdgeBlur(): Unit = js.native
  def setGrainAmount(amount: Double): Unit = js.native
  def disableGrain(): Unit = js.native
  def setChromaticAberration(amount: Double): Unit = js.native
  def disableChromaticAberration(): Unit = js.native
  def setEdgeDistortion(amount: Double): Unit = js.native
  def disableEdgeDistortion(): Unit = js.native
  def setFocusDistance(amount: Double): Unit = js.native
  def disableDepthOfField(): Unit = js.native
  def setAperture(amount: Double): Unit = js.native
  def setDarkenOutOfFocus(amount: Double): Unit = js.native
  def enablePentagonBokeh(): Unit = js.native
  def disablePentagonBokeh(): Unit = js.native
  def enableNoiseBlur(): Unit = js.native
  def disableNoiseBlur(): Unit = js.native
  def setHighlightsGain(amount: Double): Unit = js.native
  def setHighlightsThreshold(amount: Double): Unit = js.native
  def disableHighlights(): Unit = js.native
  def dispose(disableDepthRender: Boolean = ???): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.SSAO2RenderingPipeline")
class SSAO2RenderingPipeline extends PostProcessRenderPipeline {
  def this(name: String, scene: Scene, ratio: js.Any, cameras: js.Array[Camera] = ???) = this()
  var SSAOOriginalSceneColorEffect: String = js.native
  var SSAORenderEffect: String = js.native
  var SSAOBlurHRenderEffect: String = js.native
  var SSAOBlurVRenderEffect: String = js.native
  var SSAOCombineRenderEffect: String = js.native
  var totalStrength: Double = js.native
  var maxZ: Double = js.native
  var minZAspect: Double = js.native
  var samples: Double = js.native
  var expensiveBlur: Boolean = js.native
  var radius: Double = js.native
  var base: Double = js.native
  def dispose(disableGeometryBufferRenderer: Boolean = ???): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.SSAO2RenderingPipeline")
object SSAO2RenderingPipeline extends js.Object {
  def IsSupported: Boolean = js.native
}

@js.native
@JSGlobal("BABYLON.SSAORenderingPipeline")
class SSAORenderingPipeline extends PostProcessRenderPipeline {
  def this(name: String, scene: Scene, ratio: js.Any, cameras: js.Array[Camera] = ???) = this()
  var SSAOOriginalSceneColorEffect: String = js.native
  var SSAORenderEffect: String = js.native
  var SSAOBlurHRenderEffect: String = js.native
  var SSAOBlurVRenderEffect: String = js.native
  var SSAOCombineRenderEffect: String = js.native
  var totalStrength: Double = js.native
  var radius: Double = js.native
  var area: Double = js.native
  var fallOff: Double = js.native
  var base: Double = js.native
  def dispose(disableDepthRender: Boolean = ???): Unit = js.native
}

@js.native
@JSGlobal("BABYLON.StandardRenderingPipeline")
class StandardRenderingPipeline extends PostProcessRenderPipeline with IDisposable with IAnimatable {
  def this(name: String, scene: Scene, ratio: Double, originalPostProcess: PostProcess = ???, cameras: js.Array[Camera] = ???) = this()
  var originalPostProcess: PostProcess = js.native
  var downSampleX4PostProcess: PostProcess = js.native
  var brightPassPostProcess: PostProcess = js.native
  var blurHPostProcesses: js.Array[PostProcess] = js.native
  var blurVPostProcesses: js.Array[PostProcess] = js.native
  var textureAdderPostProcess: PostProcess = js.native
  var volumetricLightPostProcess: PostProcess = js.native
  var volumetricLightSmoothXPostProcess: BlurPostProcess = js.native
  var volumetricLightSmoothYPostProcess: BlurPostProcess = js.native
  var volumetricLightMergePostProces: PostProcess = js.native
  var volumetricLightFinalPostProcess: PostProcess = js.native
  var luminancePostProcess: PostProcess = js.native
  var luminanceDownSamplePostProcesses: js.Array[PostProcess] = js.native
  var hdrPostProcess: PostProcess = js.native
  var textureAdderFinalPostProcess: PostProcess = js.native
  var lensFlareFinalPostProcess: PostProcess = js.native
  var hdrFinalPostProcess: PostProcess = js.native
  var lensFlarePostProcess: PostProcess = js.native
  var lensFlareComposePostProcess: PostProcess = js.native
  var motionBlurPostProcess: PostProcess = js.native
  var depthOfFieldPostProcess: PostProcess = js.native
  var brightThreshold: Double = js.native
  var blurWidth: Double = js.native
  var horizontalBlur: Boolean = js.native
  var exposure: Double = js.native
  var lensTexture: Texture = js.native
  var volumetricLightCoefficient: Double = js.native
  var volumetricLightPower: Double = js.native
  var volumetricLightBlurScale: Double = js.native
  var sourceLight: SpotLight | DirectionalLight = js.native
  var hdrMinimumLuminance: Double = js.native
  var hdrDecreaseRate: Double = js.native
  var hdrIncreaseRate: Double = js.native
  var lensColorTexture: Texture = js.native
  var lensFlareStrength: Double = js.native
  var lensFlareGhostDispersal: Double = js.native
  var lensFlareHaloWidth: Double = js.native
  var lensFlareDistortionStrength: Double = js.native
  var lensStarTexture: Texture = js.native
  var lensFlareDirtTexture: Texture = js.native
  var depthOfFieldDistance: Double = js.native
  var depthOfFieldBlurWidth: Double = js.native
  var motionStrength: Double = js.native

  var BloomEnabled: Boolean = js.native
  var DepthOfFieldEnabled: Boolean = js.native
  var LensFlareEnabled: Boolean = js.native
  var HDREnabled: Boolean = js.native
  var VLSEnabled: Boolean = js.native
  var MotionBlurEnabled: Boolean = js.native
  var volumetricLightStepsCount: Double = js.native
  var motionBlurSamples: Double = js.native
  override def dispose(): Unit = js.native
  def serialize(): js.Dynamic = js.native
}

@js.native
@JSGlobal("BABYLON.StandardRenderingPipeline")
object StandardRenderingPipeline extends js.Object {
  def Parse(source: js.Any, scene: Scene, rootUrl: String): StandardRenderingPipeline = js.native
  var LuminanceSteps: Double = js.native
}

@js.native
@JSGlobal("BABYLON")
object BABYLON extends js.Object {
  var CollisionWorker: String = js.native
  var WorkerIncluded: Boolean = js.native
  val ToGammaSpace: Double = js.native
  val ToLinearSpace: Double = js.native
  val Epsilon: Double = js.native
  type IndicesArray = js.Array[Double] | Int32Array | Uint32Array | Uint16Array
  type PostProcessOptions = js.Any
  def expandToProperty(callback: String, targetKey: String = ???): js.Function2[js.Any, String, Unit] = js.native
  def serialize(sourceName: String = ???): js.Function2[js.Any, String, Unit] = js.native
  def serializeAsTexture(sourceName: String = ???): js.Function2[js.Any, String, Unit] = js.native
  def serializeAsColor3(sourceName: String = ???): js.Function2[js.Any, String, Unit] = js.native
  def serializeAsFresnelParameters(sourceName: String = ???): js.Function2[js.Any, String, Unit] = js.native
  def serializeAsVector2(sourceName: String = ???): js.Function2[js.Any, String, Unit] = js.native
  def serializeAsVector3(sourceName: String = ???): js.Function2[js.Any, String, Unit] = js.native
  def serializeAsMeshReference(sourceName: String = ???): js.Function2[js.Any, String, Unit] = js.native
  def serializeAsColorCurves(sourceName: String = ???): js.Function2[js.Any, String, Unit] = js.native
  def serializeAsColor4(sourceName: String = ???): js.Function2[js.Any, String, Unit] = js.native
  def serializeAsImageProcessingConfiguration(sourceName: String = ???): js.Function2[js.Any, String, Unit] = js.native
  def className(name: String, module: String = ???): js.Function1[Object, Unit] = js.native
}

}

@js.native
trait Window extends js.Object {
  def mozIndexedDB(func: js.Any): js.Dynamic = js.native
  def webkitIndexedDB(func: js.Any): js.Dynamic = js.native
  var msIndexedDB: IDBFactory = js.native
  def IDBTransaction(func: js.Any): js.Dynamic = js.native
  def webkitIDBTransaction(func: js.Any): js.Dynamic = js.native
  def msIDBTransaction(func: js.Any): js.Dynamic = js.native
  def IDBKeyRange(func: js.Any): js.Dynamic = js.native
  def webkitIDBKeyRange(func: js.Any): js.Dynamic = js.native
  def msIDBKeyRange(func: js.Any): js.Dynamic = js.native
  var webkitURL: HTMLURL = js.native
  def webkitRequestAnimationFrame(func: js.Any): js.Dynamic = js.native
  def mozRequestAnimationFrame(func: js.Any): js.Dynamic = js.native
  def oRequestAnimationFrame(func: js.Any): js.Dynamic = js.native
  var WebGLRenderingContext: WebGLRenderingContext = js.native
//   var MSGesture: MSGesture = js.native
  var CANNON: js.Any = js.native
  var SIMD: js.Any = js.native
  var AudioContext: AudioContext = js.native
  var webkitAudioContext: AudioContext = js.native
  var PointerEvent: js.Any = js.native
  var Math: Math = js.native
//   var Uint8Array: Uint8ArrayConstructor = js.native
//   var Float32Array: Float32ArrayConstructor = js.native
  var mozURL: js.Any = js.native
  var msURL: js.Any = js.native
  var VRFrameData: js.Any = js.native
}

@js.native
trait WebGLRenderingContext extends js.Object {
  def drawArraysInstanced(mode: Double, first: Double, count: Double, primcount: Double): Unit = js.native
  def drawElementsInstanced(mode: Double, count: Double, `type`: Double, offset: Double, primcount: Double): Unit = js.native
  def vertexAttribDivisor(index: Double, divisor: Double): Unit = js.native
  def createVertexArray(): js.Dynamic = js.native
  def bindVertexArray(vao: WebGLVertexArrayObject): Unit = js.native
  def deleteVertexArray(vao: WebGLVertexArrayObject): Unit = js.native
  def blitFramebuffer(srcX0: Double, srcY0: Double, srcX1: Double, srcY1: Double, dstX0: Double, dstY0: Double, dstX1: Double, dstY1: Double, mask: Double, filter: Double): Unit = js.native
  def renderbufferStorageMultisample(target: Double, samples: Double, internalformat: Double, width: Double, height: Double): Unit = js.native
  def bindBufferBase(target: Double, index: Double, buffer: WebGLBuffer | Null): Unit = js.native
  def getUniformBlockIndex(program: WebGLProgram, uniformBlockName: String): Double = js.native
  def uniformBlockBinding(program: WebGLProgram, uniformBlockIndex: Double, uniformBlockBinding: Double): Unit = js.native
  var MAX_SAMPLES: Double = js.native
  var RGBA8: Double = js.native
  var READ_FRAMEBUFFER: Double = js.native
  var DRAW_FRAMEBUFFER: Double = js.native
  var UNIFORM_BUFFER: Double = js.native
  var HALF_FLOAT_OES: Double = js.native
  var RGBA16F: Double = js.native
  var RGBA32F: Double = js.native
  var DEPTH24_STENCIL8: Double = js.native
  def drawBuffers(buffers: js.Array[Double]): Unit = js.native
  def readBuffer(src: Double): Unit = js.native
  def COLOR_ATTACHMENT0: Double = js.native
  def COLOR_ATTACHMENT1: Double = js.native
  def COLOR_ATTACHMENT2: Double = js.native
  def COLOR_ATTACHMENT3: Double = js.native
}

@js.native
trait HTMLURL extends js.Object {
  def createObjectURL(param1: js.Any, param2: js.Any = ???): js.Dynamic = js.native
}

@js.native
trait Document extends js.Object {
  def exitFullscreen(): Unit = js.native
  def webkitCancelFullScreen(): Unit = js.native
  def mozCancelFullScreen(): Unit = js.native
  def msCancelFullScreen(): Unit = js.native
  var mozFullScreen: Boolean = js.native
  var msIsFullScreen: Boolean = js.native
  var fullscreen: Boolean = js.native
  var mozPointerLockElement: HTMLElement = js.native
  var msPointerLockElement: HTMLElement = js.native
  var webkitPointerLockElement: HTMLElement = js.native
}

@js.native
trait HTMLCanvasElement extends js.Object {
  def requestPointerLock(): Unit = js.native
  def msRequestPointerLock(): Unit = js.native
  def mozRequestPointerLock(): Unit = js.native
  def webkitRequestPointerLock(): Unit = js.native
}

@js.native
trait CanvasRenderingContext2D extends js.Object {
  var imageSmoothingEnabled: Boolean = js.native
  var mozImageSmoothingEnabled: Boolean = js.native
  var oImageSmoothingEnabled: Boolean = js.native
  var webkitImageSmoothingEnabled: Boolean = js.native
  var msImageSmoothingEnabled: Boolean = js.native
}

@js.native
trait WebGLTexture extends js.Object {
  var isReady: Boolean = js.native
  var isCube: Boolean = js.native
  var url: String = js.native
  var samplingMode: Double = js.native
  var references: Double = js.native
  var generateMipMaps: Boolean = js.native
  var samples: Double = js.native
  var `type`: Double = js.native
  var format: Double = js.native
  var onLoadedCallbacks: js.Array[js.Function] = js.native
}

@js.native
trait WebGLBuffer extends js.Object {
  var references: Double = js.native
  var capacity: Double = js.native
  var is32Bits: Boolean = js.native
}

@js.native
trait MouseEvent extends js.Object {
  var mozMovementX: Double = js.native
  var mozMovementY: Double = js.native
  var webkitMovementX: Double = js.native
  var webkitMovementY: Double = js.native
  var msMovementX: Double = js.native
  var msMovementY: Double = js.native
}

@js.native
trait MSStyleCSSProperties extends js.Object {
  var webkitTransform: String = js.native
  var webkitTransition: String = js.native
}

@js.native
trait Navigator extends js.Object {
  var getVRDisplays: js.Function0[Any] = js.native
  var mozGetVRDevices: js.Function1[js.Any, Any] = js.native
  var isCocoonJS: Boolean = js.native
  var getUserMedia: js.Any = js.native
  var webkitGetUserMedia: js.Any = js.native
  var mozGetUserMedia: js.Any = js.native
  var msGetUserMedia: js.Any = js.native
  def getGamepads(func: js.Any = ???): js.Dynamic = js.native
  def webkitGetGamepads(func: js.Any = ???): js.Dynamic = js.native
  def msGetGamepads(func: js.Any = ???): js.Dynamic = js.native
  def webkitGamepads(func: js.Any = ???): js.Dynamic = js.native
}

@js.native
trait HTMLVideoElement extends js.Object {
  var mozSrcObject: js.Any = js.native
}

@js.native
trait Screen extends js.Object {
  var orientation: String = js.native
  var mozOrientation: String = js.native
}

@js.native
trait HTMLMediaElement extends js.Object {
  var crossOrigin: String | Null = js.native
}

@js.native
trait Math extends js.Object {
  def fround(x: Double): Double = js.native
  def imul(a: Double, b: Double): Double = js.native
}

@js.native
trait SIMDglobal extends js.Object {
  var SIMD: SIMD = js.native
  var Math: Math = js.native
//   var Uint8Array: Uint8ArrayConstructor = js.native
//   var Float32Array: Float32ArrayConstructor = js.native
}

@js.native
trait SIMD extends js.Object {
  var Float32x4: SIMD.Float32x4Constructor = js.native
  var Int32x4: SIMD.Int32x4Constructor = js.native
  var Int16x8: SIMD.Int16x8Constructor = js.native
  var Int8x16: SIMD.Int8x16Constructor = js.native
  var Uint32x4: SIMD.Uint32x4Constructor = js.native
  var Uint16x8: SIMD.Uint16x8Constructor = js.native
  var Uint8x16: SIMD.Uint8x16Constructor = js.native
  var Bool32x4: SIMD.Bool32x4Constructor = js.native
  var Bool16x8: SIMD.Bool16x8Constructor = js.native
  var Bool8x16: SIMD.Bool8x16Constructor = js.native
}

@js.native
trait GamepadPose extends js.Object {
  var hasOrientation: Boolean = js.native
  var hasPosition: Boolean = js.native
  var position: Float32Array = js.native
  var linearVelocity: Float32Array = js.native
  var linearAcceleration: Float32Array = js.native
  var orientation: Float32Array = js.native
  var angularVelocity: Float32Array = js.native
  var angularAcceleration: Float32Array = js.native
}

package SIMD {

@js.native
trait Float32x4 extends js.Object {
  var constructor: Float32x4Constructor = js.native
  override def valueOf(): Float32x4 = js.native
  override def toLocaleString(): String = js.native
  override def toString(): String = js.native
}

@js.native
trait Float32x4Constructor extends js.Object {
  def apply(s0: Double = ???, s1: Double = ???, s2: Double = ???, s3: Double = ???): Float32x4 = js.native
  def extractLane(simd: SIMD.Float32x4, lane: Double): Double = js.native
  def swizzle(a: SIMD.Float32x4, l1: Double, l2: Double, l3: Double, l4: Double): SIMD.Float32x4 = js.native
  def shuffle(a: SIMD.Float32x4, b: SIMD.Float32x4, l1: Double, l2: Double, l3: Double, l4: Double): SIMD.Float32x4 = js.native
  def check(a: SIMD.Float32x4): SIMD.Float32x4 = js.native
  def splat(n: Double): SIMD.Float32x4 = js.native
  def replaceLane(simd: SIMD.Float32x4, lane: Double, value: Double): SIMD.Float32x4 = js.native
  def select(selector: SIMD.Bool32x4, a: SIMD.Float32x4, b: SIMD.Float32x4): SIMD.Float32x4 = js.native
  def equal(a: SIMD.Float32x4, b: SIMD.Float32x4): SIMD.Bool32x4 = js.native
  def notEqual(a: SIMD.Float32x4, b: SIMD.Float32x4): SIMD.Bool32x4 = js.native
  def lessThan(a: SIMD.Float32x4, b: SIMD.Float32x4): SIMD.Bool32x4 = js.native
  def lessThanOrEqual(a: SIMD.Float32x4, b: SIMD.Float32x4): SIMD.Bool32x4 = js.native
  def greaterThan(a: SIMD.Float32x4, b: SIMD.Float32x4): SIMD.Bool32x4 = js.native
  def greaterThanOrEqual(a: SIMD.Float32x4, b: SIMD.Float32x4): SIMD.Bool32x4 = js.native
  def add(a: SIMD.Float32x4, b: SIMD.Float32x4): SIMD.Float32x4 = js.native
  def sub(a: SIMD.Float32x4, b: SIMD.Float32x4): SIMD.Float32x4 = js.native
  def mul(a: SIMD.Float32x4, b: SIMD.Float32x4): SIMD.Float32x4 = js.native
  def div(a: SIMD.Float32x4, b: SIMD.Float32x4): SIMD.Float32x4 = js.native
  def neg(a: SIMD.Float32x4): SIMD.Float32x4 = js.native
  def abs(a: SIMD.Float32x4): SIMD.Float32x4 = js.native
  def min(a: SIMD.Float32x4, b: SIMD.Float32x4): SIMD.Float32x4 = js.native
  def max(a: SIMD.Float32x4, b: SIMD.Float32x4): SIMD.Float32x4 = js.native
  def minNum(a: SIMD.Float32x4, b: SIMD.Float32x4): SIMD.Float32x4 = js.native
  def maxNum(a: SIMD.Float32x4, b: SIMD.Float32x4): SIMD.Float32x4 = js.native
  def reciprocalApproximation(a: SIMD.Float32x4): SIMD.Float32x4 = js.native
  def reciprocalSqrtApproximation(a: SIMD.Float32x4): SIMD.Float32x4 = js.native
  def sqrt(a: SIMD.Float32x4): SIMD.Float32x4 = js.native
  def load(tarray: Uint8Array | Uint8ClampedArray | Int16Array | Uint16Array | Int32Array | Uint32Array | Float32Array | Float64Array, index: Double): SIMD.Float32x4 = js.native
  def load1(tarray: Uint8Array | Uint8ClampedArray | Int16Array | Uint16Array | Int32Array | Uint32Array | Float32Array | Float64Array, index: Double): SIMD.Float32x4 = js.native
  def load2(tarray: Uint8Array | Uint8ClampedArray | Int16Array | Uint16Array | Int32Array | Uint32Array | Float32Array | Float64Array, index: Double): SIMD.Float32x4 = js.native
  def load3(tarray: Uint8Array | Uint8ClampedArray | Int16Array | Uint16Array | Int32Array | Uint32Array | Float32Array | Float64Array, index: Double): SIMD.Float32x4 = js.native
  def store(tarray: Uint8Array | Uint8ClampedArray | Int16Array | Uint16Array | Int32Array | Uint32Array | Float32Array | Float64Array, index: Double, value: SIMD.Float32x4): SIMD.Float32x4 = js.native
  def store1(tarray: Uint8Array | Uint8ClampedArray | Int16Array | Uint16Array | Int32Array | Uint32Array | Float32Array | Float64Array, index: Double, value: SIMD.Float32x4): SIMD.Float32x4 = js.native
  def store2(tarray: Uint8Array | Uint8ClampedArray | Int16Array | Uint16Array | Int32Array | Uint32Array | Float32Array | Float64Array, index: Double, value: SIMD.Float32x4): SIMD.Float32x4 = js.native
  def store3(tarray: Uint8Array | Uint8ClampedArray | Int16Array | Uint16Array | Int32Array | Uint32Array | Float32Array | Float64Array, index: Double, value: SIMD.Float32x4): SIMD.Float32x4 = js.native
  def fromInt32x4(value: SIMD.Int32x4): SIMD.Float32x4 = js.native
  def fromUint32x4(value: SIMD.Uint32x4): SIMD.Float32x4 = js.native
  def fromInt32x4Bits(value: SIMD.Int32x4): SIMD.Float32x4 = js.native
  def fromInt16x8Bits(value: SIMD.Int16x8): SIMD.Float32x4 = js.native
  def fromInt8x16Bits(value: SIMD.Int8x16): SIMD.Float32x4 = js.native
  def fromUint32x4Bits(value: SIMD.Uint32x4): SIMD.Float32x4 = js.native
  def fromUint16x8Bits(value: SIMD.Uint16x8): SIMD.Float32x4 = js.native
  def fromUint8x16Bits(value: SIMD.Uint8x16): SIMD.Float32x4 = js.native
}

@js.native
trait Int32x4 extends js.Object {
  var constructor: Int32x4Constructor = js.native
  override def valueOf(): Int32x4 = js.native
  override def toLocaleString(): String = js.native
  override def toString(): String = js.native
}

@js.native
trait Int32x4Constructor extends js.Object {
  def apply(s0: Double = ???, s1: Double = ???, s2: Double = ???, s3: Double = ???): Int32x4 = js.native
  def extractLane(simd: SIMD.Int32x4, lane: Double): Double = js.native
  def swizzle(a: SIMD.Int32x4, l1: Double, l2: Double, l3: Double, l4: Double): SIMD.Int32x4 = js.native
  def shuffle(a: SIMD.Int32x4, b: SIMD.Int32x4, l1: Double, l2: Double, l3: Double, l4: Double): SIMD.Int32x4 = js.native
  def check(a: SIMD.Int32x4): SIMD.Int32x4 = js.native
  def splat(n: Double): SIMD.Int32x4 = js.native
  def replaceLane(simd: SIMD.Int32x4, lane: Double, value: Double): SIMD.Int32x4 = js.native
  def select(selector: SIMD.Bool32x4, a: SIMD.Int32x4, b: SIMD.Int32x4): SIMD.Int32x4 = js.native
  def equal(a: SIMD.Int32x4, b: SIMD.Int32x4): SIMD.Bool32x4 = js.native
  def notEqual(a: SIMD.Int32x4, b: SIMD.Int32x4): SIMD.Bool32x4 = js.native
  def lessThan(a: SIMD.Int32x4, b: SIMD.Int32x4): SIMD.Bool32x4 = js.native
  def lessThanOrEqual(a: SIMD.Int32x4, b: SIMD.Int32x4): SIMD.Bool32x4 = js.native
  def greaterThan(a: SIMD.Int32x4, b: SIMD.Int32x4): SIMD.Bool32x4 = js.native
  def greaterThanOrEqual(a: SIMD.Int32x4, b: SIMD.Int32x4): SIMD.Bool32x4 = js.native
  def and(a: SIMD.Int32x4, b: SIMD.Int32x4): SIMD.Int32x4 = js.native
  def or(a: SIMD.Int32x4, b: SIMD.Int32x4): SIMD.Int32x4 = js.native
  def xor(a: SIMD.Int32x4, b: SIMD.Int32x4): SIMD.Int32x4 = js.native
  def not(a: SIMD.Int32x4, b: SIMD.Int32x4): SIMD.Int32x4 = js.native
  def add(a: SIMD.Int32x4, b: SIMD.Int32x4): SIMD.Int32x4 = js.native
  def sub(a: SIMD.Int32x4, b: SIMD.Int32x4): SIMD.Int32x4 = js.native
  def mul(a: SIMD.Int32x4, b: SIMD.Int32x4): SIMD.Int32x4 = js.native
  def neg(a: SIMD.Int32x4): SIMD.Int32x4 = js.native
  def shiftLeftByScalar(a: SIMD.Int32x4, bits: Double): SIMD.Int32x4 = js.native
  def shiftRightByScalar(a: SIMD.Int32x4, bits: Double): SIMD.Int32x4 = js.native
  def load(tarray: Uint8Array | Uint8ClampedArray | Int16Array | Uint16Array | Int32Array | Uint32Array | Float32Array | Float64Array, index: Double): SIMD.Int32x4 = js.native
  def load1(tarray: Uint8Array | Uint8ClampedArray | Int16Array | Uint16Array | Int32Array | Uint32Array | Float32Array | Float64Array, index: Double): SIMD.Int32x4 = js.native
  def load2(tarray: Uint8Array | Uint8ClampedArray | Int16Array | Uint16Array | Int32Array | Uint32Array | Float32Array | Float64Array, index: Double): SIMD.Int32x4 = js.native
  def load3(tarray: Uint8Array | Uint8ClampedArray | Int16Array | Uint16Array | Int32Array | Uint32Array | Float32Array | Float64Array, index: Double): SIMD.Int32x4 = js.native
  def store(tarray: Uint8Array | Uint8ClampedArray | Int16Array | Uint16Array | Int32Array | Uint32Array | Float32Array | Float64Array, index: Double, value: SIMD.Int32x4): SIMD.Int32x4 = js.native
  def store1(tarray: Uint8Array | Uint8ClampedArray | Int16Array | Uint16Array | Int32Array | Uint32Array | Float32Array | Float64Array, index: Double, value: SIMD.Int32x4): SIMD.Int32x4 = js.native
  def store2(tarray: Uint8Array | Uint8ClampedArray | Int16Array | Uint16Array | Int32Array | Uint32Array | Float32Array | Float64Array, index: Double, value: SIMD.Int32x4): SIMD.Int32x4 = js.native
  def store3(tarray: Uint8Array | Uint8ClampedArray | Int16Array | Uint16Array | Int32Array | Uint32Array | Float32Array | Float64Array, index: Double, value: SIMD.Int32x4): SIMD.Int32x4 = js.native
  def fromFloat32x4(value: SIMD.Float32x4): SIMD.Int32x4 = js.native
  def fromUint32x4(value: SIMD.Uint32x4): SIMD.Int32x4 = js.native
  def fromFloat32x4Bits(value: SIMD.Float32x4): SIMD.Int32x4 = js.native
  def fromInt16x8Bits(value: SIMD.Int16x8): SIMD.Int32x4 = js.native
  def fromInt8x16Bits(value: SIMD.Int8x16): SIMD.Int32x4 = js.native
  def fromUint32x4Bits(value: SIMD.Uint32x4): SIMD.Int32x4 = js.native
  def fromUint16x8Bits(value: SIMD.Uint16x8): SIMD.Int32x4 = js.native
  def fromUint8x16Bits(value: SIMD.Uint8x16): SIMD.Int32x4 = js.native
}

@js.native
trait Int16x8 extends js.Object {
  var constructor: Int16x8Constructor = js.native
  override def valueOf(): Int16x8 = js.native
  override def toLocaleString(): String = js.native
  override def toString(): String = js.native
}

@js.native
trait Int16x8Constructor extends js.Object {
  def apply(s0: Double = ???, s1: Double = ???, s2: Double = ???, s3: Double = ???, s4: Double = ???, s5: Double = ???, s6: Double = ???, s7: Double = ???): Int16x8 = js.native
  def extractLane(simd: SIMD.Int16x8, lane: Double): Double = js.native
  def swizzle(a: SIMD.Int16x8, l1: Double, l2: Double, l3: Double, l4: Double, l5: Double, l6: Double, l7: Double, l8: Double): SIMD.Int16x8 = js.native
  def shuffle(a: SIMD.Int16x8, b: SIMD.Int16x8, l1: Double, l2: Double, l3: Double, l4: Double, l5: Double, l6: Double, l7: Double, l8: Double): SIMD.Int16x8 = js.native
  def check(a: SIMD.Int16x8): SIMD.Int16x8 = js.native
  def splat(n: Double): SIMD.Int16x8 = js.native
  def replaceLane(simd: SIMD.Int16x8, lane: Double, value: Double): SIMD.Int16x8 = js.native
  def select(selector: SIMD.Bool16x8, a: SIMD.Int16x8, b: SIMD.Int16x8): SIMD.Int16x8 = js.native
  def equal(a: SIMD.Int16x8, b: SIMD.Int16x8): SIMD.Bool16x8 = js.native
  def notEqual(a: SIMD.Int16x8, b: SIMD.Int16x8): SIMD.Bool16x8 = js.native
  def lessThan(a: SIMD.Int16x8, b: SIMD.Int16x8): SIMD.Bool16x8 = js.native
  def lessThanOrEqual(a: SIMD.Int16x8, b: SIMD.Int16x8): SIMD.Bool16x8 = js.native
  def greaterThan(a: SIMD.Int16x8, b: SIMD.Int16x8): SIMD.Bool16x8 = js.native
  def greaterThanOrEqual(a: SIMD.Int16x8, b: SIMD.Int16x8): SIMD.Bool16x8 = js.native
  def and(a: SIMD.Int16x8, b: SIMD.Int16x8): SIMD.Int16x8 = js.native
  def or(a: SIMD.Int16x8, b: SIMD.Int16x8): SIMD.Int16x8 = js.native
  def xor(a: SIMD.Int16x8, b: SIMD.Int16x8): SIMD.Int16x8 = js.native
  def not(a: SIMD.Int16x8, b: SIMD.Int16x8): SIMD.Int16x8 = js.native
  def add(a: SIMD.Int16x8, b: SIMD.Int16x8): SIMD.Int16x8 = js.native
  def sub(a: SIMD.Int16x8, b: SIMD.Int16x8): SIMD.Int16x8 = js.native
  def mul(a: SIMD.Int16x8, b: SIMD.Int16x8): SIMD.Int16x8 = js.native
  def neg(a: SIMD.Int16x8): SIMD.Int16x8 = js.native
  def shiftLeftByScalar(a: SIMD.Int16x8, bits: Double): SIMD.Int16x8 = js.native
  def shiftRightByScalar(a: SIMD.Int16x8, bits: Double): SIMD.Int16x8 = js.native
  def addSaturate(a: SIMD.Int16x8, b: SIMD.Int16x8): SIMD.Int16x8 = js.native
  def subSaturate(a: SIMD.Int16x8, b: SIMD.Int16x8): SIMD.Int16x8 = js.native
  def load(tarray: Uint8Array | Uint8ClampedArray | Int16Array | Uint16Array | Int32Array | Uint32Array | Float32Array | Float64Array, index: Double): SIMD.Int16x8 = js.native
  def store(tarray: Uint8Array | Uint8ClampedArray | Int16Array | Uint16Array | Int32Array | Uint32Array | Float32Array | Float64Array, index: Double, value: SIMD.Int16x8): SIMD.Int16x8 = js.native
  def fromUint16x8(value: SIMD.Uint16x8): SIMD.Int16x8 = js.native
  def fromFloat32x4Bits(value: SIMD.Float32x4): SIMD.Int16x8 = js.native
  def fromInt32x4Bits(value: SIMD.Int32x4): SIMD.Int16x8 = js.native
  def fromInt8x16Bits(value: SIMD.Int8x16): SIMD.Int16x8 = js.native
  def fromUint32x4Bits(value: SIMD.Uint32x4): SIMD.Int16x8 = js.native
  def fromUint16x8Bits(value: SIMD.Uint16x8): SIMD.Int16x8 = js.native
  def fromUint8x16Bits(value: SIMD.Uint8x16): SIMD.Int16x8 = js.native
}

@js.native
trait Int8x16 extends js.Object {
  var constructor: Int8x16Constructor = js.native
  override def valueOf(): Int8x16 = js.native
  override def toLocaleString(): String = js.native
  override def toString(): String = js.native
}

@js.native
trait Int8x16Constructor extends js.Object {
  def apply(s0: Double = ???, s1: Double = ???, s2: Double = ???, s3: Double = ???, s4: Double = ???, s5: Double = ???, s6: Double = ???, s7: Double = ???, s8: Double = ???, s9: Double = ???, s10: Double = ???, s11: Double = ???, s12: Double = ???, s13: Double = ???, s14: Double = ???, s15: Double = ???): Int8x16 = js.native
  def extractLane(simd: SIMD.Int8x16, lane: Double): Double = js.native
  def swizzle(a: SIMD.Int8x16, l1: Double, l2: Double, l3: Double, l4: Double, l5: Double, l6: Double, l7: Double, l8: Double, l9: Double, l10: Double, l11: Double, l12: Double, l13: Double, l14: Double, l15: Double, l16: Double): SIMD.Int8x16 = js.native
  def shuffle(a: SIMD.Int8x16, b: SIMD.Int8x16, l1: Double, l2: Double, l3: Double, l4: Double, l5: Double, l6: Double, l7: Double, l8: Double, l9: Double, l10: Double, l11: Double, l12: Double, l13: Double, l14: Double, l15: Double, l16: Double): SIMD.Int8x16 = js.native
  def check(a: SIMD.Int8x16): SIMD.Int8x16 = js.native
  def splat(n: Double): SIMD.Int8x16 = js.native
  def replaceLane(simd: SIMD.Int8x16, lane: Double, value: Double): SIMD.Int8x16 = js.native
  def select(selector: SIMD.Bool8x16, a: SIMD.Int8x16, b: SIMD.Int8x16): SIMD.Int8x16 = js.native
  def equal(a: SIMD.Int8x16, b: SIMD.Int8x16): SIMD.Bool8x16 = js.native
  def notEqual(a: SIMD.Int8x16, b: SIMD.Int8x16): SIMD.Bool8x16 = js.native
  def lessThan(a: SIMD.Int8x16, b: SIMD.Int8x16): SIMD.Bool8x16 = js.native
  def lessThanOrEqual(a: SIMD.Int8x16, b: SIMD.Int8x16): SIMD.Bool8x16 = js.native
  def greaterThan(a: SIMD.Int8x16, b: SIMD.Int8x16): SIMD.Bool8x16 = js.native
  def greaterThanOrEqual(a: SIMD.Int8x16, b: SIMD.Int8x16): SIMD.Bool8x16 = js.native
  def and(a: SIMD.Int8x16, b: SIMD.Int8x16): SIMD.Int8x16 = js.native
  def or(a: SIMD.Int8x16, b: SIMD.Int8x16): SIMD.Int8x16 = js.native
  def xor(a: SIMD.Int8x16, b: SIMD.Int8x16): SIMD.Int8x16 = js.native
  def not(a: SIMD.Int8x16, b: SIMD.Int8x16): SIMD.Int8x16 = js.native
  def add(a: SIMD.Int8x16, b: SIMD.Int8x16): SIMD.Int8x16 = js.native
  def sub(a: SIMD.Int8x16, b: SIMD.Int8x16): SIMD.Int8x16 = js.native
  def mul(a: SIMD.Int8x16, b: SIMD.Int8x16): SIMD.Int8x16 = js.native
  def neg(a: SIMD.Int8x16): SIMD.Int8x16 = js.native
  def shiftLeftByScalar(a: SIMD.Int8x16, bits: Double): SIMD.Int8x16 = js.native
  def shiftRightByScalar(a: SIMD.Int8x16, bits: Double): SIMD.Int8x16 = js.native
  def addSaturate(a: SIMD.Int8x16, b: SIMD.Int8x16): SIMD.Int8x16 = js.native
  def subSaturate(a: SIMD.Int8x16, b: SIMD.Int8x16): SIMD.Int8x16 = js.native
  def load(tarray: Uint8Array | Uint8ClampedArray | Int16Array | Uint16Array | Int32Array | Uint32Array | Float32Array | Float64Array, index: Double): SIMD.Int8x16 = js.native
  def store(tarray: Uint8Array | Uint8ClampedArray | Int16Array | Uint16Array | Int32Array | Uint32Array | Float32Array | Float64Array, index: Double, value: SIMD.Int8x16): SIMD.Int8x16 = js.native
  def fromUint8x16(value: SIMD.Uint8x16): SIMD.Int8x16 = js.native
  def fromFloat32x4Bits(value: SIMD.Float32x4): SIMD.Int8x16 = js.native
  def fromInt32x4Bits(value: SIMD.Int32x4): SIMD.Int8x16 = js.native
  def fromInt16x8Bits(value: SIMD.Int16x8): SIMD.Int8x16 = js.native
  def fromUint32x4Bits(value: SIMD.Uint32x4): SIMD.Int8x16 = js.native
  def fromUint16x8Bits(value: SIMD.Uint16x8): SIMD.Int8x16 = js.native
  def fromUint8x16Bits(value: SIMD.Uint8x16): SIMD.Int8x16 = js.native
}

@js.native
trait Uint32x4 extends js.Object {
  var constructor: Uint32x4Constructor = js.native
  override def valueOf(): Uint32x4 = js.native
  override def toLocaleString(): String = js.native
  override def toString(): String = js.native
}

@js.native
trait Uint32x4Constructor extends js.Object {
  def apply(s0: Double = ???, s1: Double = ???, s2: Double = ???, s3: Double = ???): Uint32x4 = js.native
  def extractLane(simd: SIMD.Uint32x4, lane: Double): Double = js.native
  def swizzle(a: SIMD.Uint32x4, l1: Double, l2: Double, l3: Double, l4: Double): SIMD.Uint32x4 = js.native
  def shuffle(a: SIMD.Uint32x4, b: SIMD.Uint32x4, l1: Double, l2: Double, l3: Double, l4: Double): SIMD.Uint32x4 = js.native
  def check(a: SIMD.Uint32x4): SIMD.Uint32x4 = js.native
  def splat(n: Double): SIMD.Uint32x4 = js.native
  def replaceLane(simd: SIMD.Uint32x4, lane: Double, value: Double): SIMD.Uint32x4 = js.native
  def select(selector: SIMD.Bool32x4, a: SIMD.Uint32x4, b: SIMD.Uint32x4): SIMD.Uint32x4 = js.native
  def equal(a: SIMD.Uint32x4, b: SIMD.Uint32x4): SIMD.Bool32x4 = js.native
  def notEqual(a: SIMD.Uint32x4, b: SIMD.Uint32x4): SIMD.Bool32x4 = js.native
  def lessThan(a: SIMD.Uint32x4, b: SIMD.Uint32x4): SIMD.Bool32x4 = js.native
  def lessThanOrEqual(a: SIMD.Uint32x4, b: SIMD.Uint32x4): SIMD.Bool32x4 = js.native
  def greaterThan(a: SIMD.Uint32x4, b: SIMD.Uint32x4): SIMD.Bool32x4 = js.native
  def greaterThanOrEqual(a: SIMD.Uint32x4, b: SIMD.Uint32x4): SIMD.Bool32x4 = js.native
  def and(a: SIMD.Uint32x4, b: SIMD.Uint32x4): SIMD.Uint32x4 = js.native
  def or(a: SIMD.Uint32x4, b: SIMD.Uint32x4): SIMD.Uint32x4 = js.native
  def xor(a: SIMD.Uint32x4, b: SIMD.Uint32x4): SIMD.Uint32x4 = js.native
  def not(a: SIMD.Uint32x4, b: SIMD.Uint32x4): SIMD.Uint32x4 = js.native
  def add(a: SIMD.Uint32x4, b: SIMD.Uint32x4): SIMD.Uint32x4 = js.native
  def sub(a: SIMD.Uint32x4, b: SIMD.Uint32x4): SIMD.Uint32x4 = js.native
  def mul(a: SIMD.Uint32x4, b: SIMD.Uint32x4): SIMD.Uint32x4 = js.native
  def shiftLeftByScalar(a: SIMD.Uint32x4, bits: Double): SIMD.Uint32x4 = js.native
  def shiftRightByScalar(a: SIMD.Uint32x4, bits: Double): SIMD.Uint32x4 = js.native
  def load(tarray: Uint8Array | Uint8ClampedArray | Int16Array | Uint16Array | Int32Array | Uint32Array | Float32Array | Float64Array, index: Double): SIMD.Uint32x4 = js.native
  def load1(tarray: Uint8Array | Uint8ClampedArray | Int16Array | Uint16Array | Int32Array | Uint32Array | Float32Array | Float64Array, index: Double): SIMD.Uint32x4 = js.native
  def load2(tarray: Uint8Array | Uint8ClampedArray | Int16Array | Uint16Array | Int32Array | Uint32Array | Float32Array | Float64Array, index: Double): SIMD.Uint32x4 = js.native
  def load3(tarray: Uint8Array | Uint8ClampedArray | Int16Array | Uint16Array | Int32Array | Uint32Array | Float32Array | Float64Array, index: Double): SIMD.Uint32x4 = js.native
  def store(tarray: Uint8Array | Uint8ClampedArray | Int16Array | Uint16Array | Int32Array | Uint32Array | Float32Array | Float64Array, index: Double, value: SIMD.Uint32x4): SIMD.Uint32x4 = js.native
  def store1(tarray: Uint8Array | Uint8ClampedArray | Int16Array | Uint16Array | Int32Array | Uint32Array | Float32Array | Float64Array, index: Double, value: SIMD.Uint32x4): SIMD.Uint32x4 = js.native
  def store2(tarray: Uint8Array | Uint8ClampedArray | Int16Array | Uint16Array | Int32Array | Uint32Array | Float32Array | Float64Array, index: Double, value: SIMD.Uint32x4): SIMD.Uint32x4 = js.native
  def store3(tarray: Uint8Array | Uint8ClampedArray | Int16Array | Uint16Array | Int32Array | Uint32Array | Float32Array | Float64Array, index: Double, value: SIMD.Uint32x4): SIMD.Uint32x4 = js.native
  def fromFloat32x4(value: SIMD.Float32x4): SIMD.Uint32x4 = js.native
  def fromInt32x4(value: SIMD.Int32x4): SIMD.Uint32x4 = js.native
  def fromFloat32x4Bits(value: SIMD.Float32x4): SIMD.Uint32x4 = js.native
  def fromInt32x4Bits(value: SIMD.Int32x4): SIMD.Uint32x4 = js.native
  def fromInt16x8Bits(value: SIMD.Int16x8): SIMD.Uint32x4 = js.native
  def fromInt8x16Bits(value: SIMD.Int8x16): SIMD.Uint32x4 = js.native
  def fromUint16x8Bits(value: SIMD.Uint16x8): SIMD.Uint32x4 = js.native
  def fromUint8x16Bits(value: SIMD.Uint8x16): SIMD.Uint32x4 = js.native
}

@js.native
trait Uint16x8 extends js.Object {
  var constructor: Uint16x8Constructor = js.native
  override def valueOf(): Uint16x8 = js.native
  override def toLocaleString(): String = js.native
  override def toString(): String = js.native
}

@js.native
trait Uint16x8Constructor extends js.Object {
  def apply(s0: Double = ???, s1: Double = ???, s2: Double = ???, s3: Double = ???, s4: Double = ???, s5: Double = ???, s6: Double = ???, s7: Double = ???): Uint16x8 = js.native
  def extractLane(simd: SIMD.Uint16x8, lane: Double): Double = js.native
  def swizzle(a: SIMD.Uint16x8, l1: Double, l2: Double, l3: Double, l4: Double, l5: Double, l6: Double, l7: Double, l8: Double): SIMD.Uint16x8 = js.native
  def shuffle(a: SIMD.Uint16x8, b: SIMD.Uint16x8, l1: Double, l2: Double, l3: Double, l4: Double, l5: Double, l6: Double, l7: Double, l8: Double): SIMD.Uint16x8 = js.native
  def check(a: SIMD.Uint16x8): SIMD.Uint16x8 = js.native
  def splat(n: Double): SIMD.Uint16x8 = js.native
  def replaceLane(simd: SIMD.Uint16x8, lane: Double, value: Double): SIMD.Uint16x8 = js.native
  def select(selector: SIMD.Bool16x8, a: SIMD.Uint16x8, b: SIMD.Uint16x8): SIMD.Uint16x8 = js.native
  def equal(a: SIMD.Uint16x8, b: SIMD.Uint16x8): SIMD.Bool16x8 = js.native
  def notEqual(a: SIMD.Uint16x8, b: SIMD.Uint16x8): SIMD.Bool16x8 = js.native
  def lessThan(a: SIMD.Uint16x8, b: SIMD.Uint16x8): SIMD.Bool16x8 = js.native
  def lessThanOrEqual(a: SIMD.Uint16x8, b: SIMD.Uint16x8): SIMD.Bool16x8 = js.native
  def greaterThan(a: SIMD.Uint16x8, b: SIMD.Uint16x8): SIMD.Bool16x8 = js.native
  def greaterThanOrEqual(a: SIMD.Uint16x8, b: SIMD.Uint16x8): SIMD.Bool16x8 = js.native
  def and(a: SIMD.Uint16x8, b: SIMD.Uint16x8): SIMD.Uint16x8 = js.native
  def or(a: SIMD.Uint16x8, b: SIMD.Uint16x8): SIMD.Uint16x8 = js.native
  def xor(a: SIMD.Uint16x8, b: SIMD.Uint16x8): SIMD.Uint16x8 = js.native
  def not(a: SIMD.Uint16x8, b: SIMD.Uint16x8): SIMD.Uint16x8 = js.native
  def add(a: SIMD.Uint16x8, b: SIMD.Uint16x8): SIMD.Uint16x8 = js.native
  def sub(a: SIMD.Uint16x8, b: SIMD.Uint16x8): SIMD.Uint16x8 = js.native
  def mul(a: SIMD.Uint16x8, b: SIMD.Uint16x8): SIMD.Uint16x8 = js.native
  def shiftLeftByScalar(a: SIMD.Uint16x8, bits: Double): SIMD.Uint16x8 = js.native
  def shiftRightByScalar(a: SIMD.Uint16x8, bits: Double): SIMD.Uint16x8 = js.native
  def addSaturate(a: SIMD.Uint16x8, b: SIMD.Uint16x8): SIMD.Uint16x8 = js.native
  def subSaturate(a: SIMD.Uint16x8, b: SIMD.Uint16x8): SIMD.Uint16x8 = js.native
  def load(tarray: Uint8Array | Uint8ClampedArray | Int16Array | Uint16Array | Int32Array | Uint32Array | Float32Array | Float64Array, index: Double): SIMD.Uint16x8 = js.native
  def store(tarray: Uint8Array | Uint8ClampedArray | Int16Array | Uint16Array | Int32Array | Uint32Array | Float32Array | Float64Array, index: Double, value: SIMD.Uint16x8): SIMD.Uint16x8 = js.native
  def fromInt16x8(value: SIMD.Int16x8): SIMD.Uint16x8 = js.native
  def fromFloat32x4Bits(value: SIMD.Float32x4): SIMD.Uint16x8 = js.native
  def fromInt32x4Bits(value: SIMD.Int32x4): SIMD.Uint16x8 = js.native
  def fromInt16x8Bits(value: SIMD.Int16x8): SIMD.Uint16x8 = js.native
  def fromInt8x16Bits(value: SIMD.Int8x16): SIMD.Uint16x8 = js.native
  def fromUint32x4Bits(value: SIMD.Uint32x4): SIMD.Uint16x8 = js.native
  def fromUint8x16Bits(value: SIMD.Uint8x16): SIMD.Uint16x8 = js.native
}

@js.native
trait Uint8x16 extends js.Object {
  var constructor: Uint8x16Constructor = js.native
  override def valueOf(): Uint8x16 = js.native
  override def toLocaleString(): String = js.native
  override def toString(): String = js.native
}

@js.native
trait Uint8x16Constructor extends js.Object {
  def apply(s0: Double = ???, s1: Double = ???, s2: Double = ???, s3: Double = ???, s4: Double = ???, s5: Double = ???, s6: Double = ???, s7: Double = ???, s8: Double = ???, s9: Double = ???, s10: Double = ???, s11: Double = ???, s12: Double = ???, s13: Double = ???, s14: Double = ???, s15: Double = ???): Uint8x16 = js.native
  def extractLane(simd: SIMD.Uint8x16, lane: Double): Double = js.native
  def swizzle(a: SIMD.Uint8x16, l1: Double, l2: Double, l3: Double, l4: Double, l5: Double, l6: Double, l7: Double, l8: Double, l9: Double, l10: Double, l11: Double, l12: Double, l13: Double, l14: Double, l15: Double, l16: Double): SIMD.Uint8x16 = js.native
  def shuffle(a: SIMD.Uint8x16, b: SIMD.Uint8x16, l1: Double, l2: Double, l3: Double, l4: Double, l5: Double, l6: Double, l7: Double, l8: Double, l9: Double, l10: Double, l11: Double, l12: Double, l13: Double, l14: Double, l15: Double, l16: Double): SIMD.Uint8x16 = js.native
  def check(a: SIMD.Uint8x16): SIMD.Uint8x16 = js.native
  def splat(n: Double): SIMD.Uint8x16 = js.native
  def replaceLane(simd: SIMD.Uint8x16, lane: Double, value: Double): SIMD.Uint8x16 = js.native
  def select(selector: SIMD.Bool8x16, a: SIMD.Uint8x16, b: SIMD.Uint8x16): SIMD.Uint8x16 = js.native
  def equal(a: SIMD.Uint8x16, b: SIMD.Uint8x16): SIMD.Bool8x16 = js.native
  def notEqual(a: SIMD.Uint8x16, b: SIMD.Uint8x16): SIMD.Bool8x16 = js.native
  def lessThan(a: SIMD.Uint8x16, b: SIMD.Uint8x16): SIMD.Bool8x16 = js.native
  def lessThanOrEqual(a: SIMD.Uint8x16, b: SIMD.Uint8x16): SIMD.Bool8x16 = js.native
  def greaterThan(a: SIMD.Uint8x16, b: SIMD.Uint8x16): SIMD.Bool8x16 = js.native
  def greaterThanOrEqual(a: SIMD.Uint8x16, b: SIMD.Uint8x16): SIMD.Bool8x16 = js.native
  def and(a: SIMD.Uint8x16, b: SIMD.Uint8x16): SIMD.Uint8x16 = js.native
  def or(a: SIMD.Uint8x16, b: SIMD.Uint8x16): SIMD.Uint8x16 = js.native
  def xor(a: SIMD.Uint8x16, b: SIMD.Uint8x16): SIMD.Uint8x16 = js.native
  def not(a: SIMD.Uint8x16, b: SIMD.Uint8x16): SIMD.Uint8x16 = js.native
  def add(a: SIMD.Uint8x16, b: SIMD.Uint8x16): SIMD.Uint8x16 = js.native
  def sub(a: SIMD.Uint8x16, b: SIMD.Uint8x16): SIMD.Uint8x16 = js.native
  def mul(a: SIMD.Uint8x16, b: SIMD.Uint8x16): SIMD.Uint8x16 = js.native
  def shiftLeftByScalar(a: SIMD.Uint8x16, bits: Double): SIMD.Uint8x16 = js.native
  def shiftRightByScalar(a: SIMD.Uint8x16, bits: Double): SIMD.Uint8x16 = js.native
  def addSaturate(a: SIMD.Uint8x16, b: SIMD.Uint8x16): SIMD.Uint8x16 = js.native
  def subSaturate(a: SIMD.Uint8x16, b: SIMD.Uint8x16): SIMD.Uint8x16 = js.native
  def load(tarray: Uint8Array | Uint8ClampedArray | Int16Array | Uint16Array | Int32Array | Uint32Array | Float32Array | Float64Array, index: Double): SIMD.Uint8x16 = js.native
  def store(tarray: Uint8Array | Uint8ClampedArray | Int16Array | Uint16Array | Int32Array | Uint32Array | Float32Array | Float64Array, index: Double, value: SIMD.Uint8x16): SIMD.Uint8x16 = js.native
  def fromInt8x16(value: SIMD.Int8x16): SIMD.Uint8x16 = js.native
  def fromFloat32x4Bits(value: SIMD.Float32x4): SIMD.Uint8x16 = js.native
  def fromInt32x4Bits(value: SIMD.Int32x4): SIMD.Uint8x16 = js.native
  def fromInt16x8Bits(value: SIMD.Int16x8): SIMD.Uint8x16 = js.native
  def fromInt8x16Bits(value: SIMD.Int8x16): SIMD.Uint8x16 = js.native
  def fromUint32x4Bits(value: SIMD.Uint32x4): SIMD.Uint8x16 = js.native
  def fromUint16x8Bits(value: SIMD.Uint16x8): SIMD.Uint8x16 = js.native
}

@js.native
trait Bool32x4 extends js.Object {
  var constructor: Bool32x4Constructor = js.native
  override def valueOf(): Bool32x4 = js.native
  override def toLocaleString(): String = js.native
  override def toString(): String = js.native
}

@js.native
trait Bool32x4Constructor extends js.Object {
  def apply(s0: Boolean = ???, s1: Boolean = ???, s2: Boolean = ???, s3: Boolean = ???): Bool32x4 = js.native
  def extractLane(simd: SIMD.Bool32x4, lane: Double): Boolean = js.native
  def check(a: SIMD.Bool32x4): SIMD.Bool32x4 = js.native
  def splat(n: Boolean): SIMD.Bool32x4 = js.native
  def replaceLane(simd: SIMD.Bool32x4, lane: Double, value: Boolean): SIMD.Bool32x4 = js.native
  def allTrue(a: SIMD.Bool32x4): Boolean = js.native
  def anyTrue(a: SIMD.Bool32x4): Boolean = js.native
  def and(a: SIMD.Bool32x4, b: SIMD.Bool32x4): SIMD.Bool32x4 = js.native
  def or(a: SIMD.Bool32x4, b: SIMD.Bool32x4): SIMD.Bool32x4 = js.native
  def xor(a: SIMD.Bool32x4, b: SIMD.Bool32x4): SIMD.Bool32x4 = js.native
  def not(a: SIMD.Bool32x4, b: SIMD.Bool32x4): SIMD.Bool32x4 = js.native
}

@js.native
trait Bool16x8 extends js.Object {
  var constructor: Bool16x8Constructor = js.native
  override def valueOf(): Bool16x8 = js.native
  override def toLocaleString(): String = js.native
  override def toString(): String = js.native
}

@js.native
trait Bool16x8Constructor extends js.Object {
  def apply(s0: Boolean = ???, s1: Boolean = ???, s2: Boolean = ???, s3: Boolean = ???, s4: Boolean = ???, s5: Boolean = ???, s6: Boolean = ???, s7: Boolean = ???): Bool16x8 = js.native
  def extractLane(simd: SIMD.Bool16x8, lane: Double): Boolean = js.native
  def check(a: SIMD.Bool16x8): SIMD.Bool16x8 = js.native
  def splat(n: Boolean): SIMD.Bool16x8 = js.native
  def replaceLane(simd: SIMD.Bool16x8, lane: Double, value: Boolean): SIMD.Bool16x8 = js.native
  def allTrue(a: SIMD.Bool16x8): Boolean = js.native
  def anyTrue(a: SIMD.Bool16x8): Boolean = js.native
  def and(a: SIMD.Bool16x8, b: SIMD.Bool16x8): SIMD.Bool16x8 = js.native
  def or(a: SIMD.Bool16x8, b: SIMD.Bool16x8): SIMD.Bool16x8 = js.native
  def xor(a: SIMD.Bool16x8, b: SIMD.Bool16x8): SIMD.Bool16x8 = js.native
  def not(a: SIMD.Bool16x8, b: SIMD.Bool16x8): SIMD.Bool16x8 = js.native
}

@js.native
trait Bool8x16 extends js.Object {
  var constructor: Bool8x16Constructor = js.native
  override def valueOf(): Bool8x16 = js.native
  override def toLocaleString(): String = js.native
  override def toString(): String = js.native
}

@js.native
trait Bool8x16Constructor extends js.Object {
  def apply(s0: Boolean = ???, s1: Boolean = ???, s2: Boolean = ???, s3: Boolean = ???, s4: Boolean = ???, s5: Boolean = ???, s6: Boolean = ???, s7: Boolean = ???, s8: Boolean = ???, s9: Boolean = ???, s10: Boolean = ???, s11: Boolean = ???, s12: Boolean = ???, s13: Boolean = ???, s14: Boolean = ???, s15: Boolean = ???): Bool8x16 = js.native
  def extractLane(simd: SIMD.Bool8x16, lane: Double): Boolean = js.native
  def check(a: SIMD.Bool8x16): SIMD.Bool8x16 = js.native
  def splat(n: Boolean): SIMD.Bool8x16 = js.native
  def replaceLane(simd: SIMD.Bool8x16, lane: Double, value: Boolean): SIMD.Bool8x16 = js.native
  def allTrue(a: SIMD.Bool8x16): Boolean = js.native
  def anyTrue(a: SIMD.Bool8x16): Boolean = js.native
  def and(a: SIMD.Bool8x16, b: SIMD.Bool8x16): SIMD.Bool8x16 = js.native
  def or(a: SIMD.Bool8x16, b: SIMD.Bool8x16): SIMD.Bool8x16 = js.native
  def xor(a: SIMD.Bool8x16, b: SIMD.Bool8x16): SIMD.Bool8x16 = js.native
  def not(a: SIMD.Bool8x16, b: SIMD.Bool8x16): SIMD.Bool8x16 = js.native
}

}

@js.native
trait ImageBitmap extends js.Object {
  def width: Double = js.native
  def height: Double = js.native
  def close(): Unit = js.native
}

@js.native
@JSGlobal
class WebGLQuery extends WebGLObject {
}

@js.native
@JSGlobal
object WebGLQuery extends js.Object {
}

@js.native
@JSGlobal
class WebGLSampler extends WebGLObject {
}

@js.native
@JSGlobal
object WebGLSampler extends js.Object {
}

@js.native
@JSGlobal
class WebGLSync extends WebGLObject {
}

@js.native
@JSGlobal
object WebGLSync extends js.Object {
}

@js.native
@JSGlobal
class WebGLTransformFeedback extends WebGLObject {
}

@js.native
@JSGlobal
object WebGLTransformFeedback extends js.Object {
}

@js.native
@JSGlobal
class WebGLVertexArrayObject extends WebGLObject {
}

@js.native
@JSGlobal
object WebGLVertexArrayObject extends js.Object {
}

package Earcut {

@js.native
@JSGlobal("Earcut")
object Earcut extends js.Object {
  def earcut(data: js.Array[Double], holeIndices: js.Array[Double], dim: Double): js.Array[js.Any] = js.native
  def deviation(data: js.Array[Double], holeIndices: js.Array[Double], dim: Double, triangles: js.Array[Double]): Double = js.native
  def flatten(data: js.Array[js.Array[js.Array[Double]]]): js.Any = js.native
}

}

@js.native
trait ExtendedGamepadButton extends GamepadButton {
  def pressed: Boolean = js.native
  def touched: Boolean = js.native
  def value: Double = js.native
}

@js.native
@JSGlobalScope
object Importedjs extends js.Object {
  var HMDVRDevice: js.Any = js.native
  var VRDisplay: js.Any = js.native
  var VRFrameData: js.Any = js.native
}
