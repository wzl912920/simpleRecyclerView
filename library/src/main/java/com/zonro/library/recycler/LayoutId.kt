package com.zonro.library.recycler

/**
 * Created by Lynn.
 */
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.CLASS , AnnotationTarget.PROPERTY_GETTER , AnnotationTarget.PROPERTY_SETTER)
annotation class LayoutId(val value : Int)