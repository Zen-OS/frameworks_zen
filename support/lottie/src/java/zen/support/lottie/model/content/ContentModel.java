package zen.support.lottie.model.content;


import android.support.annotation.Nullable;

import zen.support.lottie.LottieDrawable;
import zen.support.lottie.animation.content.Content;
import zen.support.lottie.model.layer.BaseLayer;

public interface ContentModel {
  @Nullable Content toContent(LottieDrawable drawable, BaseLayer layer);
}
