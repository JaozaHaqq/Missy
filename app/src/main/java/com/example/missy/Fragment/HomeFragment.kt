package com.example.missy.Fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.content.ContextCompat.startActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.missy.DataModel
import com.example.missy.Deskripsi
import com.example.missy.MoodActivity
import com.example.missy.R
import com.example.misy.adapter_grid


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {
    private lateinit var recyclerView: RecyclerView
    val Datamahasiswa = listOf<DataModel>(
        DataModel(
            image = R.drawable. artikel1,
            title = "Perbedaan Telat Haid dengan Hamil",
            desc = "Perbedaan ini terjadi karena hormon antara ...Lorem ipsum dolor sit amet, " +
                    "consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et " +
                    "dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco" +
                    " laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in " +
                    "reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. " +
                    "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt " +
                    "mollit anim id est laborum.",
        ),
        DataModel(
            R.drawable. artikel2,
            title = "4 Perbedaan Darah Implantasi dan Darah Haid",
            desc = "Ada beberapa macam perbedaan Darah ...Lorem ipsum dolor sit amet, consectetur " +
                    "adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna " +
                    "aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi" +
                    " ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in " +
                    "voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint " +
                    "occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit " +
                    "anim id est laborum.",
        ),
        DataModel(
            R.drawable. artikel3,
            title = "Telat Haid Bukan Berarti Kamu Hamil!",
            desc = "Telat haid bukan karena sebagai tanda kita hamil namun ....Lorem ipsum dolor " +
                    "sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut " +
                    "labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud " +
                    "exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute" +
                    " irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat " +
                    "nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa " +
                    "qui officia deserunt mollit anim id est laborum.",
        ),
        DataModel(
            R.drawable. artikel4,
            title = "Alasan Kamu Keram Tapi Gak Lagi Haid",
            desc = "Keram sering muncul dikarenakan faktor dan kondisi tertentu....Lorem ipsum" +
                    " dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt " +
                    "ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud " +
                    "exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. " +
                    "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore " +
                    "eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, " +
                    "sunt in culpa qui officia deserunt mollit anim id est laborum.",
        ),
        DataModel(
            R.drawable. artikel5,
            title = "Inilah Tanda Kamu Minggu Ini Mens!",
            desc = "Kita dapat memperkirakan minggu hari kita mens....Lorem ipsum dolor sit amet, " +
                    "consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et " +
                    "dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco " +
                    "laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in " +
                    "reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. " +
                    "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia " +
                    "deserunt mollit anim id est laborum.",
        ),
        DataModel(
            R.drawable. artikel6,
            title = "Ciri-ciri Wanita Tanpa Rahim",
            desc = "Tidak semua wanita terlahir dengan rahim, berikut ciri - ciri ...Lorem ipsum " +
                    "dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt " +
                    "ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud " +
                    "exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute" +
                    " irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat " +
                    "nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa " +
                    "qui officia deserunt mollit anim id est laborum.",
        ),
        DataModel(
            R.drawable. artikel7,
            title = "Perut Kembung Tanda Gejala Kista",
            desc = "Kembung sering terjadi dikarenakan faktor berikut...Lorem ipsum dolor " +
                    "sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt " +
                    "ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud " +
                    "exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis " +
                    "aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu f" +
                    "ugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in " +
                    "culpa qui officia deserunt mollit anim id est laborum.",
        ),
        DataModel(
            R.drawable. avocado,
            title = "Manfaat Minum Jus Alpukat Tiap Hari",
            desc = "Berikut manfaat buah alpukat antara lain ...Lorem ipsum dolor sit amet, " +
                    "consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et " +
                    "dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco" +
                    " laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in " +
                    "reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. " +
                    "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia " +
                    "deserunt mollit anim id est laborum.",
        ),
        DataModel(
            R.drawable. artikel8,
            title = "001",
            desc = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor " +
                    "incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis " +
                    "nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. " +
                    "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore " +
                    "eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt " +
                    "in culpa qui officia deserunt mollit anim id est laborum."
        ),
        DataModel(
            R.drawable. artikel1,
            title = "002",
            desc = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor " +
                    "incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis " +
                    "nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. " +
                    "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore " +
                    "eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt " +
                    "in culpa qui officia deserunt mollit anim id est laborum.",
        ),
        DataModel(
            R.drawable. artikel8,
            title = "003",
            desc = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor " +
                    "incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis " +
                    "nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. " +
                    "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore " +
                    "eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt " +
                    "in culpa qui officia deserunt mollit anim id est laborum.",
        ),
    )
    // TODO: Rename and change types of parameters
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val tampil: RecyclerView = view.findViewById(R.id.recyclerView)
        tampil.layoutManager = GridLayoutManager(requireActivity(), 2)
        tampil.setHasFixedSize(true)
            val adapter = adapter_grid(requireActivity(), Datamahasiswa) { mhs ->
                val intent = Intent(requireActivity(), Deskripsi::class.java)
                intent.putExtra("foto", mhs.image)
                intent.putExtra("judul", mhs.title)
                intent.putExtra("deskripsi", mhs.desc)
                activity?.startActivity(intent)
            }
            tampil.adapter = adapter
        }

    }

    /*private fun ShowCardMahasiswa() {
        recyclerView.layoutManager = GridLayoutManager (requireActivity(), 2)
        val adapter = adapter_grid(requireActivity(), Datamahasiswa) { mhs ->
            val intent = Intent(requireActivity(), Deskripsi::class.java)
            intent.putExtra("foto", mhs.image)
            intent.putExtra("judul", mhs.title)
            intent.putExtra("deskripsi", mhs.desc)
            startActivity(intent)
        }
        recyclerView.adapter = adapter

    }*/
