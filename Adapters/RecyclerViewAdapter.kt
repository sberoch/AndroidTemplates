#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME}
#end
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
#parse("File Header.java")
class ${NAME} : RecyclerView.Adapter<${VIEWHOLDER_CLASS}>() {

    private val items = ArrayList<${ITEM_CLASS}>()
    
    fun setItems(items: ArrayList<${ITEM_CLASS}>) {
        this.items.clear()
        this.items.addAll(items)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ${VIEWHOLDER_CLASS} {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_comment, parent, false)
        return ${VIEWHOLDER_CLASS}(view)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ${VIEWHOLDER_CLASS}, position: Int) {
        holder.bind(items[position])
    }
}

class ${VIEWHOLDER_CLASS}(private val view: View) : RecyclerView.ViewHolder(view) {
    fun bind(item: ${ITEM_CLASS}) {

    }
}

