package zen.support.lottie.model.animatable;

import zen.support.lottie.value.Keyframe;
import zen.support.lottie.animation.keyframe.BaseKeyframeAnimation;
import zen.support.lottie.animation.keyframe.GradientColorKeyframeAnimation;
import zen.support.lottie.model.content.GradientColor;

import java.util.List;

public class AnimatableGradientColorValue extends BaseAnimatableValue<GradientColor,
    GradientColor> {
  public AnimatableGradientColorValue(
      List<Keyframe<GradientColor>> keyframes) {
    super(keyframes);
  }

  @Override public BaseKeyframeAnimation<GradientColor, GradientColor> createAnimation() {
    return new GradientColorKeyframeAnimation(keyframes);
  }
}
