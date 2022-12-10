interface Storage<T> {
    fun get(): T
    fun replace(item: T)
}