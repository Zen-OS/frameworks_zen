package zen.support.lottie.model.animatable;

import android.graphics.Path;

import zen.support.lottie.value.Keyframe;
import zen.support.lottie.animation.keyframe.BaseKeyframeAnimation;
import zen.support.lottie.animation.keyframe.ShapeKeyframeAnimation;
import zen.support.lottie.model.content.ShapeData;

import java.util.List;

public class AnimatableShapeValue extends BaseAnimatableValue<ShapeData, Path> {

  public AnimatableShapeValue(List<Keyframe<ShapeData>> keyframes) {
    super(keyframes);
  }

  @Override public BaseKeyframeAnimation<ShapeData, Path> createAnimation() {
    return new ShapeKeyframeAnimation(keyframes);
  }
}
