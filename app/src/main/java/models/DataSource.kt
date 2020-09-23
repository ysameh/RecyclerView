package models

class DataSource {
    companion object{

        fun createDataSet(): ArrayList<BlogPost>{
            val list = ArrayList<BlogPost>()
            list.add(
                BlogPost(
                    "FC Barcelona",
                    "",
                    "https://static.nike.com/a/images/f_auto/dpr_2.0/w_429,c_limit/a76a7bba-36d1-4637-97ec-1ecfbfcfc547/official-fc-barcelona-store.png",
                    "Squad List"
                )
            )
            list.add(
                BlogPost(
                    "Ronald Koeman",
                    "",
                    "https://i.imgur.com/LS4KO38.png",
                    "Coach"
                )
            )

            list.add(
                BlogPost(
                    "Lionel Messi",
                    "",
                    "https://www.fcbarcelona.com/photo-resources/2019/09/12/2c22eb75-7530-47bc-9ea8-92b492b6780a/Messi-600x708.png?width=670&height=790",
                    "Attacker"
                )
            )
            list.add(
                BlogPost(
                    "Luis Suarez",
                    "",
                    "https://www.fcbarcelona.com/photo-resources/2019/09/12/b92e8731-df84-43db-9267-1018f6e3fdc3/Suarez-600x708.png?width=670&height=790",
                    "Attacker"
                )
            )
            list.add(
                BlogPost(
                    "Antoine Griezmann",
                    "",
                    "https://www.fcbarcelona.com/photo-resources/2019/09/12/003f5e86-ddfe-43ff-940e-d4a51605b948/Griezmann-600x708.png?width=670&height=790",
                    "Attacker"
                )
            )
            list.add(
                BlogPost(
                    "Ousmane Dembele",
                    "",
                    "https://www.fcbarcelona.com/photo-resources/2019/09/12/1d0e5cdd-8891-4d8e-9ce4-703f7642a728/Dembele-600x708.png?width=670&height=790",
                    "Attacker"
                )
            )
            list.add(
                BlogPost(
                    "Trincao",
                    "",
                    "https://www.fcbarcelona.com/photo-resources/2020/08/27/560df249-0242-4560-b190-145b93a06797/trincao_01.png?width=670&height=790",
                    "Attacker"
                )
            )
            list.add(
                BlogPost(
                    "Philippe Coutinho",
                    "",
                    "https://www.fcbarcelona.com/photo-resources/2019/09/12/280c12b5-1936-4049-a5fc-325721dd67af/Coutinho-600x708.png?width=670&height=790",
                    "Midfielder"
                )
            )
            list.add(
                BlogPost(
                    "Frenkie De Jong",
                    "",
                    "https://www.fcbarcelona.com/photo-resources/2019/09/12/6ebbed65-9c3f-4ae8-a873-9abfa3b5378f/De-Jong-600x708.png?width=670&height=790",
                    "Midfielder"
                )
            )
            list.add(
                BlogPost(
                    "Sergio Busquets",
                    "",
                    "https://www.fcbarcelona.com/photo-resources/2019/09/12/336440ae-442d-4437-9892-99235786ecde/Busquets-600x708.png?width=670&height=790",
                    "Midfielder"
                )
            )
            list.add(
                BlogPost(
                    "Rafinha Alcantara",
                    "",
                    "https://www.fcbarcelona.com/photo-resources/2019/09/12/68b8a679-3362-4dde-8b5b-1e065c21d807/Rafinha-600x708.png?width=670&height=790",
                    "Midfielder"
                )
            )
            list.add(
                BlogPost(
                    "Carles Alena",
                    "",
                    "https://www.fcbarcelona.com/photo-resources/2019/09/12/80e96913-40d4-415f-9ded-52ff64562b17/Alena-600x708.png?width=670&height=790",
                    "Midfielder"
                )
            )
            list.add(
                BlogPost(
                    "Gerrard Pique",
                    "",
                    "https://www.fcbarcelona.com/photo-resources/2019/09/12/8fd82c1e-8b3b-4553-a518-536c58637779/Pique-600x708.png?width=670&height=790",
                    "Defender"
                )
            )
            list.add(
                BlogPost(
                    "Clement Lenglet",
                    "",
                    "https://www.fcbarcelona.com/photo-resources/2019/09/12/fa912693-a8c2-4f34-90d8-609bd84b5c4b/Lenglet-600x708.png?width=670&height=790",
                    "Defender"
                )
            )
            list.add(
                BlogPost(
                    "Samuel Umtiti",
                    "",
                    "https://www.fcbarcelona.com/photo-resources/2019/09/12/0b45cf3e-7d04-4309-ab83-f5923d2906b7/Umtiti-600x708.png?width=670&height=790",
                    "Defender"
                )
            )
            list.add(
                BlogPost(
                    "Jordi Alba",
                    "",
                    "https://www.fcbarcelona.com/photo-resources/2019/09/12/84123f6a-f17f-4eb1-b0b5-5cc17f66346d/Alba-600x708.png?width=670&height=790",
                    "Defender"
                )
            )
            list.add(
                BlogPost(
                    "Nelson Semedo",
                    "",
                    "https://www.fcbarcelona.com/photo-resources/2019/09/12/48d7ce59-de37-4547-bc5a-113250e714fe/Wague-600x708.png?width=670&height=790",
                    "Defender"
                )
            )
            list.add(
                BlogPost(
                    "Sergi Roberto",
                    "",
                    "https://www.fcbarcelona.com/photo-resources/2019/09/12/3e9a6d4b-6506-433a-a379-527154374f51/Roberto-600x708.png?width=670&height=790",
                    "Defender"
                )
            )
            list.add(
                BlogPost(
                    "Junior Firpo",
                    "",
                    "https://www.fcbarcelona.com/photo-resources/2019/09/12/a9e6e616-c312-4d9b-9e72-68aa39899500/Firpo-600x708.png?width=670&height=790",
                    "Defender"
                )
            )
            list.add(
                BlogPost(
                    "Marc Andre Ter Stegen",
                    "",
                    "https://www.fcbarcelona.com/photo-resources/2019/09/12/f8fa5933-b92e-4397-8982-f885b71b7ba8/ter-Stegen-600x708.png?width=670&height=790",
                    "Goalkeeper"
                )
            )
            list.add(
                BlogPost(
                    "Neto",
                    "",
                    "https://www.fcbarcelona.com/photo-resources/2019/09/17/68fba0e4-5b76-403b-b3e0-e237a27dff6f/Neto-600x708.png?width=670&height=790",
                    "Goalkeeper"
                )
            )
            return list
        }
    }
}