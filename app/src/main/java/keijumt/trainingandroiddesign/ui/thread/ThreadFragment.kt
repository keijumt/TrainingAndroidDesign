package keijumt.trainingandroiddesign.ui.thread

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders
import keijumt.trainingandroiddesign.BaseFragment
import keijumt.trainingandroiddesign.R
import keijumt.trainingandroiddesign.ui.main.MainViewModel
import kotlinx.android.synthetic.main.fragment_thread.view.*

class ThreadFragment : BaseFragment() {

    companion object {
        fun newInstance() = ThreadFragment()
    }

    private lateinit var threadViewModel: ThreadViewModel
    private lateinit var mainViewModel: MainViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_thread, container, false)
        view.container_workspace_list.setOnClickListener {
            mainViewModel.event.value = MainViewModel.Event.Workspaces
        }
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        threadViewModel = ViewModelProviders.of(requireActivity()).get(ThreadViewModel::class.java)
        mainViewModel = ViewModelProviders.of(requireActivity()).get(MainViewModel::class.java)
    }

}
