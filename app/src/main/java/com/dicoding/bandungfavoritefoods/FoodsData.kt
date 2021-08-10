package com.dicoding.bandungfavoritefoods

object FoodsData {
    private val foodNames = arrayOf("Bandros",
            "Cimol",
            "Colenak",
            "Cuangki",
            "Gehu Jeletot",
            "Karedok",
            "Mie Kocok",
            "Peuyeum",
            "Seblak",
            "Surabi",
            "Nasi Timbel",
            " Nasi Tutug Oncom"

    )

    private val foodsDetail = arrayOf(
            "Salah satu camilan tradisional kota Bandung yang paling diminati adalah bandros. Kue dari campuran tepung beras dan santan ini berbentuk seperti pukis dengan rasa gurih. Ada taburan gula pasir untuk menambah cita rasa.Kini variannya sudah beragam. Salah satu yang menyajikan dengan cara unik adalah bandros Cowboy Cisangkuy. Ada beragam rasa ditawarkan, mulai dari green tea, keju, coklat hingga beberapa merek coklat kenamaan. Di sini, kamu tetap bisa mendapatkan bandros versi original, kok!",
            "Cimol adalah singkatan dari aci digemol, berbahasa Sunda yang memiliki arti bahan tepung kanji (aci) yang dan dibentuk bulat dan digoreng. Tempat cimol favorit bisa anda temui di Cimol & Tahu Bulat Pendi",
            "Tidak sedikit yang mengenalnya sebagai tape bakar, namun apa pun itu kualitas rasanya sudah mendunia. Bayangkan tape singkong yang dibakar dan dicocol pada gula merah yang dipanaskan bersama parutan kelapa, bikin ngiler, kan? Salah satu tempat mendapatkan makanan khas Bandung ini adalah di Colenak Murdi Putra, yang konon sudah berdiri sejak 1930. Kamu harus mencicipi yang ini saat liburan ke Bandung, ya!",
            "Sajiannya mirip bakso Malang. Dalam satu porsi cuanki terdiri dari aci, siomay, bakso, pangsit rebus, pangsit goreng dan bakso goreng. Bedanya, mi yang digunakan bukan mi kuning. Dengan tambahan seledri dan daun bawang, Cuanki juga lebih gurih dan bening. Banyak tempat untuk bisa menikmati cuanki, mengingat pada awalnya kuliner ini ditawarkan oleh penjualnya dengan berkeliling. Namun kini ada satu spot yang cukup populer bagi pecinta kuliner, yaitu Cuanki Serayu, yang sudah berdiri sejak 1990.",
            "Bagi pencari rasa pedas, kuliner Gehu Jeletot bisa jadi alternatif yang pas. Camilan baru di kota Bandung ini banyak menjadi buruan karena rasa pedas, gurih dan menyenangkan. Selain taburan sayuran di dalam tahunya, seperti irisan wortel dan sayur kol, ada juga irisan daging sapi untuk menambah cita rasa. Gehu Hot Jeletot menjadi tempat yang tepat bagi kamu yang menginginkan makanan khas Bandung ini. Harganya memang relatif lebih mahal dibanding produk sejenis lainnya di Bandung, namun kualitas rasanya cukup berbeda.",
            "Tertarik mengkonsumsi makanan yang bergizi dan menyehatkan di Bandung, silakan langsung mencoba karedok. Mulai dari bahan, cara pengolahan dan penyajian, semuanya berakhir dengan kesegaran. Untuk menambah rasa, kamu harus meminta diolah dengan tingkat pedas sedikit di atas rata-rata. Salah satu penjual karedok yang cukup favorit di kota Bandung adalah Warung Cihapit Bu Siti. Selain karedok, kamu juga bisa mencoba lotek, pecel dan gado-gado. Dijamin semuanya menyehatkan, lho!",
            "Bagi kamu yang tertarik menikmati sajian yang memanjakan lidah, Mie Kocong Mang Dadeng bisa menjadi alternatif yang pas. Rasanya nendang, pun demikian dengan isian di setiap porsi mie kocok yang disajikan.Bukan hal yang mengejutkan karena kabarnya ada bumbu spesial, yang terdiri dari 27 macam bumbu rempah yang menjadikan rasa mie kocok Mang Dadeng begitu ngehits di kalangan pecinta kuliner tradisional.",
            "Inilah salah satu makanan khas Bandung yang begitu identik dengan Kota Kembang. Bukan sekadar tape singkong, peuyeum merupakan tape dengan kadar air yang jauh lebih sedikit, yang membuatnya bisa bertahan jauh lebih lama. Serunya, peuyeum bisa menjadi makanan yang disantap langsung, atau menjadi bahan dasar untuk olahan camilan kesukaan kamu. Banyak tempat untuk bisa mendapatkan peuyeum. Rekomendasi kami, langsung ke sentranya di Desa Citatah.",
            "Belum ke Bandung jika kamu belum mencoba makan seblak. Makanan khas Bandung yang terbuat dari kerupuk basah ini memiliki rasa yang khas karena dibuat dari bumbu rempah dan memiliki isian yang mengenyangkan seperti sayur, daging dan telur. Ada beberapa tempat asyik untuk merasakan seblak, namun salah satu yang layak direkomendasikan adalah Seblak Jebred yang memiliki tambahan ceker di isiannya, plus tahu krispi, sosis dan kikil. Supaya semakin nyam-nyam, naikkan versi pedasnya, ya! Harganya juga cukup ramah di kantong, lho!",
            "Surabi menjadi salah satu camilan paling ngehits di Bandung. Beragam rasa, topping dan tampilan yang imut menjadi alasan mengapa jajanan tradisional ini banyak diburu para pendatang dan kaum urban Bandung. Salah satu pioner surabi di Bandung adalah Surabi Cihapit, yang berdiri sejak 1991. Menu yang paling terkenal adalah surabi oncom, namun varian lain juga layak dicoba. Dijamin ketagihan, lho!",
            "Disebut tersembunyi karena nasinya dibungkus daun pisang. Setelah dibuka, kamu bisa mendapati nasi putih hangat dengan aroma yang khas dan bisa menikmatinya dengan ditemani daging atau ikan, tahu, tempe serta sambal dan lalapan.Ingin mendapatkan rasa otentik dari makanan khas Bandung ini, langsung saja menuju ke nasi timbel Bawean, spot legendaris yang sudah berdiri sejak 1985. Selain pilihan lauknya yang melimpah, kamu juga bisa memilih varian nasi timbelnya, nasi timbel putih dan merah. Wow!",
            "Dari namanya, kamu sudah bisa menebak seperti apa komposisi kuliner ini. Nasi yang ditumbuk dan dicampur oncom, ditambah dengan lauk pauk yang sesuai dengan selera, kamu bisa mendapatkan sensasi rasa yang aduhai. Namun, pertanyaan besarnya, di mana tempat yang menyajikan nasi tutug oncom paling mantab? Ada banyak pendapat, dan semuanya memiliki cita rasanya sendiri. Kami merekomendasikan Nasi Tutug Oncom Bi Kokom di daerah Lengkong, yang tidak hanya memiliki menawarkan rasa yang pas, tapi juga fasilitas yang memadai."

    )
    private val foodsLokasi = arrayOf(
            "Jl. Cisangkuy No.56, Citarum, Bandung Wetan, Kota Bandung, Jawa Barat",
            "Jl. Gegerkalong Hilir No.88-92, Sukarasa, Kec. Sukasari, Kota Bandung, Jawa Barat 40152",
            "Jalan Ahmad Yani No. 733, Cicaheum, Kiaracondong, Padasuka, Cibeunying Kidul, Kota Bandung, Jawa Barat",
            "Jalan Serayu No.2, Cihapit, Bandung Wetan, Kota Bandung, Jawa Barat",
            "JL. Jupiter Raya, Blok F2 No. 25, Margahayu Barat, Sekejati, Sekejati, Buahbatu, Kota Bandung, Jawa Barat",
            "Jl. Cihapit No.6, Cihapit, Bandung Wetan, Kota Bandung, Jawa Barat",
            "Jl. Kyai Haji Ahmad Dahlan No. 67, Turangga, Lengkong, Kota Bandung, Jawa Barat",
            "Jalan Bandung-Cianjur, Kampung Cimerang, Desa Citatah, Cipatat, Kabupaten Bandung Barat, Jawa Barat",
            "Jl. Buah Batu No.163, Turangga, Lengkong, Kota Bandung, Jawa Barat",
            "Jl. Cihapit, Cihapit, Bandung, Kota Bandung, Jawa Barat",
            "Jl. Bawean Pav. 3, Bandung, Merdeka, Sumur Bandung, Jawa Barat",
            "Jl. Macan, Burangrang, Lengkong, Kota Bandung, Jawa Barat"
    )


    private val foodsHarga = arrayOf(
            "Mulai dari 8,000 IDR hingga 45,000 IDR per porsi, tergantung pilihan rasa",
            "Mulai dari 5,000 IDR hingga 10,000 IDR per porsi, tergantung varian",
            " 10,000 IDR per bungkus",
            "17,000 IDR untuk satu porsi cuanki dan batagor, sementara untuk setengah porsi dihargai 10,000 IDR",
            "Harga: 2,000 - 6000 IDR per buah",
            "Mulai dari 10,000 IDR per porsi",
            "Mulai dari 23,000 IDR per porsi",
            "15,000 IDR per kilogram",
            "Mulai dari 12,000 IDR per porsi, sementara toppingnya dihargai mulai dari 3,000 IDR hingga 4,000 IDR",
            "Mulai dari 2,000 IDR per biji",
            "Mulai dari 4,000 IDR untuk satu porsi nasi timbel, sementara lauknya mulai dari 1,000 IDR hingga 15,000 IDR.",
            "Mulai dari 8,000 IDR hingga 25,000 IDR, tergantung lauk yang dipilih."


    )

    private val foodsImage = intArrayOf(
            R.drawable.bandros,
            R.drawable.cimol,
            R.drawable.colenak,
            R.drawable.cuangki,
            R.drawable.jeletot,
            R.drawable.karedok,
            R.drawable.mie,
            R.drawable.peuyeum,
            R.drawable.seblak,
            R.drawable.surabi,
            R.drawable.timbel,
            R.drawable.tutugoncom
    )

    val listData: ArrayList<Food>
        get() {
            val list = arrayListOf<Food>()
            for (position in foodNames.indices) {
                val food = Food()
                food.name = foodNames[position]
                food.detail = foodsDetail[position]
                food.lokasi = foodsLokasi[position]
                food.harga = foodsHarga[position]
                food.photo = foodsImage[position]
                list.add(food)

            }
            return list
        }
}