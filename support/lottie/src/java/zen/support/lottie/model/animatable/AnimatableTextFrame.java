package zen.support.lottie.model.animatable;

import zen.support.lottie.value.Keyframe;
import zen.support.lottie.animation.keyframe.TextKeyframeAnimation;
import zen.support.lottie.model.DocumentData;

import java.util.List;

public class AnimatableTextFrame extends BaseAnimatableValue<DocumentData, DocumentData> {

  public AnimatableTextFrame(List<Keyframe<DocumentData>> keyframes) {
    super(keyframes);
  }

  @Override public TextKeyframeAnimation createAnimation() {
    return new TextKeyframeAnimation(keyframes);
  }
}
