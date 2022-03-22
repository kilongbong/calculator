<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    xmlns:android="http://schemas.android.com/apk/res/android"
    tools:context=".MainActivity"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#3F51B5"
    android:orientation="vertical"
    >


    <TextView
        android:layout_width="match_parent"
        android:layout_height="100dp"
        android:background="#FF9800"
        android:text="SỐ HỌC ĐƠN GIẢN"
        android:textAlignment="center"
        android:textColor="#FAF6F6"
        android:textSize="32" />

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal">

        <TextView
            android:id="@+id/tvSoA"
            android:layout_width="100dp"
            android:layout_height="46dp"
            android:text="Số A:"
            android:textAlignment="center"
            android:textColor="#F8F3F3"
            android:textSize="26dp"
            android:background="#6C4040"/>

        <EditText
            android:id="@+id/edSoA"
            android:layout_width="261dp"
            android:layout_height="match_parent" />


</LinearLayout>

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="horizontal">

        <TextView
            android:id="@+id/tvSoB"
            android:layout_width="100dp"
            android:layout_height="46dp"
            android:text="Số B:"
            android:textAlignment="center"
            android:textColor="#F8F3F3"
            android:textSize="26dp"
            android:background="#6C4040"
            />

        <EditText
            android:id="@+id/edSoB"
            android:layout_width="match_parent"
            android:layout_height="match_parent" />
    </LinearLayout>


    <Button
        android:id="@+id/btnCong"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="center"
        android:onClick="XuLyCong"
        android:text="+"
        android:textSize="20dp" />

    <Button
        android:id="@+id/btnTru"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="center"
        android:onClick="XuLyTru"
        android:text="-"
        android:textSize="20dp" />

    <Button
        android:id="@+id/btnNhan"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="center"
        android:onClick="XuLyNhan"
        android:text="*"
        android:textSize="20dp" />

    <Button
        android:id="@+id/btnChia"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="center"
        android:onClick="XuLyChia"
        android:text="/"
        android:textSize="20dp" />

    <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="horizontal">

        </LinearLayout>

    <TextView
        android:id="@+id/tvKetQua"
        android:layout_width="match_parent"
        android:layout_height="180dp"
        android:text="Kết quả hiện ở đây"
        android:textAlignment="center"
        android:textColor="@color/white"
        android:textSize="24" />

</LinearLayout>
