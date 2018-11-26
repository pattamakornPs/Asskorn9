package com.example.korn.assign9

import android.os.Parcel
import android.os.Parcelable

class Student(val Username:String,val Password:String,val Gender:String,val Birthday:String,val Email:String,val Phone:String) : Parcelable {
    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString(),
            parcel.readString()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(Username)
        parcel.writeString(Password)
        parcel.writeString(Gender)
        parcel.writeString(Birthday)
        parcel.writeString(Email)
        parcel.writeString(Phone)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Student> {
        override fun createFromParcel(parcel: Parcel): Student {
            return Student(parcel)
        }

        override fun newArray(size: Int): Array<Student?> {
            return arrayOfNulls(size)
        }
    }
}