package mojeong.moko.myviewpager2introslide

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MyIntroPagerRecyclerAdapter(private var pageList: ArrayList<PageItem>): RecyclerView.Adapter<MyPagerViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyPagerViewHolder {

        return MyPagerViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.layout_intro_pager_item, parent
                                                                                ,false))

    }

    override fun getItemCount(): Int {

        return pageList.size

    }

    override fun onBindViewHolder(holder: MyPagerViewHolder, position: Int) {

        holder.bindWithView(pageList[position])

    }
}