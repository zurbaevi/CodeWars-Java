package com.codewars.kyu7

/**
 * @author Zurbaevi Nika
 */
class CircularList<T>(private vararg val elements: T) {

    private var position = -1

    init {
        if (elements.isEmpty()) {
            throw RuntimeException()
        }
    }

    fun next(): T {
        position++;
        if (position == elements.size) {
            position = 0;
        }
        return elements[position];
    }

    fun prev(): T {
        position--;
        if (position < 0) {
            position = elements.size - 1;
        }
        return elements[position];
    }
}
