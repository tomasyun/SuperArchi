package www.yuntdev.com.library.binding

import androidx.databinding.BindingAdapter
import android.widget.ImageView
import com.bumptech.glide.request.RequestOptions
import www.yuntdev.com.library.image.GlideApp

@BindingAdapter("bind_imageView_url")
fun loadImage(imageView: ImageView, url: String?) {
    GlideApp.with(imageView.context)
            .load(url)
            .into(imageView)
}

@BindingAdapter("bind_imageView_url_circle")
fun loadImageCircle(imageView: ImageView, url: String?) {
    GlideApp.with(imageView.context)
            .load(url)
            .apply(RequestOptions().circleCrop())
            .into(imageView)
}