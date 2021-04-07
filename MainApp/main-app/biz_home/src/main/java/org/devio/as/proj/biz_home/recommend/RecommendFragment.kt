package org.devio.`as`.proj.biz_home.recommend

import android.os.Bundle
import android.view.View
import org.devio.`as`.proj.biz_home.R
import org.devio.`as`.proj.common.flutter.HiFlutterCacheManager
import org.devio.`as`.proj.common.flutter.HiFlutterFragment

class RecommendFragment : HiFlutterFragment(HiFlutterCacheManager.MODULE_NAME_RECOMMEND) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setTitle(getString(R.string.title_recommend))
    }

    override fun getPageName(): String {
        return "recommend_fragment"
    }
}