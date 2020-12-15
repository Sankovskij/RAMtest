package sankovskij.test.ramtest.onboarding.model

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.viewpager.widget.PagerAdapter
import sankovskij.test.ramtest.R

class ViewPagerApapter(var context: Context, var onBoadrdingDataList: List<OnBoadrdingData>) : PagerAdapter() {
    override fun getCount(): Int {
        return onBoadrdingDataList.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val view : View = LayoutInflater.from(context).inflate(R.layout.onboarding_screen_layout, null)
        val onBoardingImage : ImageView
        val onBoardingHeader : TextView
        val onBoardingText : TextView

        onBoardingImage = view.findViewById(R.id.onboardingImage)
        onBoardingHeader = view.findViewById(R.id.onboardigHeader)
        onBoardingText = view.findViewById(R.id.onboardingText)

        onBoardingImage.setImageResource(onBoadrdingDataList[position].onboardingImg)
        onBoardingHeader.text = (onBoadrdingDataList[position].onboadringHeader)
        onBoardingText.text = (onBoadrdingDataList[position].onboardingText)

        container.addView(view)
        return view
    }
}