# Kotlin_BottomSheet_Behovior
<img width="292" alt="Screenshot_1" src="https://user-images.githubusercontent.com/60017090/230595554-eafe2313-acee-4b20-81bf-dd5e08262b69.png">


//activity_main.xml



                <?xml version="1.0" encoding="utf-8"?>
                <androidx.coordinatorlayout.widget.CoordinatorLayout xmlns:android="http://schemas.android.com/apk/res/android"
                    xmlns:app="http://schemas.android.com/apk/res-auto"
                    xmlns:tools="http://schemas.android.com/tools"
                    android:layout_width="match_parent"
                    android:layout_height="match_parent"
                    android:background="#C9DDDD"
                    tools:context=".MainActivity">

                    <LinearLayout
                        android:layout_width="match_parent"
                        android:orientation="vertical"
                        android:id="@+id/linearlayoutbottomsheet"
                        android:layout_height="300dp"
                        app:behavior_peekHeight="?actionBarSize"
                        android:background="@drawable/background"
                        app:layout_behavior="@string/bottom_sheet_behavior">

                        <ImageView
                            android:id="@+id/imageviewarrow"
                            android:layout_margin="10dp"
                            android:layout_width="match_parent"
                            android:layout_height="wrap_content"
                            android:src="@drawable/round_keyboard_arrow_up_24"
                            ></ImageView>
                        <ImageView
                            android:id="@+id/imageview2"
                            android:layout_margin="10dp"
                            android:layout_width="match_parent"
                            android:layout_height="200dp"
                            android:src="@drawable/image777"
                            ></ImageView>
                    </LinearLayout>

                </androidx.coordinatorlayout.widget.CoordinatorLayout>





