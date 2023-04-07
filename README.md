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

//backgground shape 

                <?xml version="1.0" encoding="utf-8"?>
                <shape xmlns:android="http://schemas.android.com/apk/res/android"
                    android:shape="rectangle"
                    >
                    <solid android:color="@android:color/white"></solid>
                    <corners
                        android:topRightRadius="35dp"
                        android:topLeftRadius="35dp"></corners>
                </shape>




//MainActivity.kt


              class MainActivity : AppCompatActivity() {
                  lateinit var linearLayout: LinearLayout
                  lateinit var imageView: ImageView
                  var collapse=true
                  override fun onCreate(savedInstanceState: Bundle?) {
                      super.onCreate(savedInstanceState)
                      setContentView(R.layout.activity_main)
                      linearLayout=findViewById(R.id.linearlayoutbottomsheet)
                      imageView=findViewById(R.id.imageviewarrow)
                      val bottomSheetBehavior=BottomSheetBehavior.from(linearLayout)

                      imageView.setOnClickListener {
                          if (collapse){
                              bottomSheetBehavior.state=BottomSheetBehavior.STATE_EXPANDED
                              collapse=false
                          }else{
                              bottomSheetBehavior.state=BottomSheetBehavior.STATE_COLLAPSED
                              collapse=true
                          }
                      }

                      bottomSheetBehavior.addBottomSheetCallback(object: BottomSheetBehavior.BottomSheetCallback() {
                          override fun onStateChanged(bottomSheet: View, newState: Int) {
                              if (newState==BottomSheetBehavior.STATE_EXPANDED){
                                  imageView.setImageResource(R.drawable.round_keyboard_arrow_down_24)
                              }else if(newState == BottomSheetBehavior.STATE_COLLAPSED){
                                  imageView.setImageResource(R.drawable.round_keyboard_arrow_up_24)

                              }
                          }

                          override fun onSlide(bottomSheet: View, slideOffset: Float) {

                          }

                      })


                  }
              }
