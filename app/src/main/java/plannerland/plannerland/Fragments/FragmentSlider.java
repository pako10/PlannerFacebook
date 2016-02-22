package plannerland.plannerland.Fragments;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;
import com.daimajia.slider.library.Tricks.ViewPagerEx;
import java.util.HashMap;
import plannerland.plannerland.DoctorScrolling;
import plannerland.plannerland.LoginActivity;
import plannerland.plannerland.R;
import plannerland.plannerland.SesrchActivity;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;
import com.daimajia.slider.library.Tricks.ViewPagerEx;
import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.BaseSliderView;
import com.daimajia.slider.library.SliderTypes.TextSliderView;
import com.daimajia.slider.library.Tricks.ViewPagerEx;
import java.util.HashMap;
import plannerland.plannerland.Fragments.FragmentSlider;



public class FragmentSlider extends Fragment implements
        BaseSliderView.OnSliderClickListener, ViewPagerEx.OnPageChangeListener{

    private SliderLayout mDemoSlider;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle sevedInstanceState ){

        final View view = inflater.inflate(R.layout.fragmentslider, container, false);

        mDemoSlider = (SliderLayout)view.findViewById(R.id.slider);

        //SLIDER
        HashMap<String,Integer> file_maps = new HashMap<String, Integer>();
        file_maps.put("Primero",R.drawable.primero);
        file_maps.put("Segundo", R.drawable.segundo);
        file_maps.put("Tercero", R.drawable.tercero);
        file_maps.put("Cuarto", R.drawable.cuarto);
        file_maps.put("Quinto", R.drawable.quinto);
        file_maps.put("Sexto", R.drawable.sexto);
        file_maps.put("Septimo", R.drawable.septimo);


        for(String name : file_maps.keySet()){
            TextSliderView textSliderView = new TextSliderView(getActivity());
            // initialize a SliderLayout
            textSliderView
                    .description(name)
                    .image(file_maps.get(name))
                    .setScaleType(BaseSliderView.ScaleType.Fit)
                    .setOnSliderClickListener(this);

            //add your extra information
           /* textSliderView.bundle(new Bundle());
            textSliderView.getBundle()
                    .putString("extra",name);*/

            mDemoSlider.addSlider(textSliderView);
        }

        return view;
    }


    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {}

    @Override
    public void onPageSelected(int position) {
        Log.d("Slider Demo", "Page Changed: " + position);
    }

    @Override
    public void onPageScrollStateChanged(int state) {}

    @Override
    public void onStop() {
        // To prevent a memory leak on rotation, make sure to call stopAutoCycle() on the slider before activity or fragment is destroyed
        mDemoSlider.stopAutoCycle();
        super.onStop();
    }

    @Override
    public void onSliderClick(BaseSliderView slider) {
        // Toast.makeText(this,slider.getBundle().get("extra") + "", Toast.LENGTH_SHORT).show();
    }


}
