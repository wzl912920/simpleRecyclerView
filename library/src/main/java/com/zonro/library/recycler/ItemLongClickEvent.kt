package com.zonro.library.recycler

import android.view.*

/**
 * Created by Lynn.
 */

interface ItemLongClickEvent {
    fun onItemLongClick(view : View , position : Int)
}