class Case<T>(var item: T): Storage<T> {
    override fun get(): T {
        return this.item
    }

    override fun replace(item: T) {
        this.item = item
    }

}