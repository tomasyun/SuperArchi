package www.yuntdev.com.library.functional

typealias Supplier<T> = () -> T

interface Consumer<T> {

    fun accept(t: T)
}