package www.yuntdev.com.library.binding.support

import android.view.MenuItem
import androidx.appcompat.widget.Toolbar
import androidx.databinding.BindingAdapter
import www.yuntdev.com.library.functional.Consumer

interface ToolbarMenuClickListener : Consumer<MenuItem>

@BindingAdapter("bind_menuClick")
fun onToolbarMenuClick(toolbar: Toolbar,
                       consumer: ToolbarMenuClickListener) =
        toolbar.setOnMenuItemClickListener {
            consumer.accept(it)
            true
        }