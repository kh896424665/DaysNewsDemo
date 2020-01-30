package com.kh.daysnewsdemo.mvp.model

data class BaseModel<T>(val code: Int, val message: String, var data: T) {

}