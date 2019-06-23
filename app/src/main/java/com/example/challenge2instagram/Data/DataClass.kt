package com.example.challenge2instagram.Data

import android.annotation.SuppressLint
import android.os.Parcel
import android.os.Parcelable
import com.example.challenge2instagram.R

class DataClass() {
    companion object {
         val iconArray = intArrayOf(
             R.drawable.icon01,
             R.drawable.icon02,
             R.drawable.icon03,
             R.drawable.icon04,
             R.drawable.icon05,
             R.drawable.icon06,
             R.drawable.icon07,
             R.drawable.icon08,
             R.drawable.icon09,
             R.drawable.icon10

        )
         val picArray = intArrayOf(
             R.drawable.image01,
             R.drawable.image02,
             R.drawable.image03,
             R.drawable.image04,
             R.drawable.image05,
             R.drawable.image06,
             R.drawable.image07,
             R.drawable.image08,
             R.drawable.image09,
             R.drawable.image10,
             R.drawable.image11,
             R.drawable.image12,
             R.drawable.image13,
             R.drawable.image14,
             R.drawable.image15,
             R.drawable.image16,
             R.drawable.image17,
             R.drawable.image18,
             R.drawable.image19,
             R.drawable.image20
        )
         val nameArray = arrayOf(
            "Apple","Buton","Candy","David","Elvis","Frank","Gin","Helen","Ivy","Jacky"
        )
         val commentArray = arrayOf(
            "1Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin vel odio faucibus, dictum\n" +
                    "        nibh mollis, semper magna. Sed ut luctus nisi. Phasellus id egestas tortor. Cras ac quam elit. Integer sed orci\n" +
                    "        arcu. Duis bibendum feugiat ex ultricies posuere. In maximus elementum tortor id malesuada. Curabitur eget velit\n" +
                    "        eget arcu lacinia fermentum. Aenean dapibus mauris id ante feugiat, a varius arcu porttitor. Nunc congue maximus\n" +
                    "        arcu. Fusce maximus lorem enim, sit amet mollis orci aliquam in. Fusce lectus massa, malesuada non nulla eu,\n" +
                    "        gravida cursus erat. Donec iaculis sit amet lorem a aliquet. Mauris eu erat nec magna sollicitudin ultrices sit\n" +
                    "        amet vel arcu. Sed imperdiet metus ac ligula placerat varius. Mauris eleifend ex non urna imperdiet, vitae porta\n" +
                    "        leo imperdiet.",
            "2Curabitur scelerisque augue vel nisl sodales, eu ornare ligula tincidunt. Praesent cursus\n" +
                    "        nibh ac leo tempor ultrices. Quisque dignissim mauris non porttitor imperdiet. Maecenas viverra ac ante at\n" +
                    "        dapibus. Mauris gravida, erat sed placerat pulvinar, augue urna dignissim libero, ut vestibulum diam metus in\n" +
                    "        dui. Vivamus tempor mollis aliquet. Fusce sollicitudin fringilla neque, non rutrum libero auctor mattis. Nullam\n" +
                    "        ac mi accumsan, commodo purus ut, gravida ipsum. Fusce viverra id diam id imperdiet. Suspendisse bibendum mi\n" +
                    "        arcu, a imperdiet turpis luctus eget. Aliquam erat volutpat. Vivamus ipsum lacus, viverra a ornare eu, blandit\n" +
                    "        in tellus. Donec in vehicula risus.",
            "3Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. In\n" +
                    "        congue suscipit nisl, in condimentum nibh lobortis at. Sed pellentesque, nulla tincidunt elementum interdum,\n" +
                    "        neque diam porttitor ante, cursus lobortis felis diam ut est. Vestibulum placerat rhoncus sagittis. Nam lacinia\n" +
                    "        interdum ultricies. Vivamus lacinia odio sit amet erat faucibus, eget mollis ligula molestie. Maecenas id\n" +
                    "        vestibulum enim. Aenean viverra, leo sit amet interdum porttitor, dolor magna volutpat orci, imperdiet molestie\n" +
                    "        erat dolor non justo.",
            "4Suspendisse pretium elementum velit, in venenatis diam porta et. Curabitur finibus maximus\n" +
                    "        neque non vulputate. Nunc commodo arcu felis, nec malesuada tortor volutpat sit amet. Nulla eget urna et mi\n" +
                    "        hendrerit porta. Vestibulum nec diam id orci congue blandit vitae nec mi. Vestibulum bibendum ipsum neque, eget\n" +
                    "        feugiat lectus sollicitudin luctus. Integer sed justo eu purus vulputate mollis. Fusce ante ante, consequat sed\n" +
                    "        nibh et, fermentum convallis mi. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere\n" +
                    "        cubilia Curae; Ut ut sagittis purus. Duis tincidunt facilisis erat eget blandit. Ut malesuada vehicula pulvinar.",
            "5Fusce a purus sem. Integer eleifend nisl at odio maximus, posuere suscipit lorem ultricies.\n" +
                    "        Nullam ac ipsum placerat, consectetur erat rutrum, efficitur mauris. Quisque pellentesque pretium viverra. Nulla\n" +
                    "        suscipit blandit lacus, non accumsan velit tristique ut. Sed mattis dapibus dolor eget sodales. Praesent\n" +
                    "        consectetur elit id mollis auctor. Mauris ac nisl pellentesque, auctor lacus nec, vulputate nisi. Aliquam nibh\n" +
                    "        nibh, vestibulum sit amet suscipit eget, ultricies a sapien. Lorem ipsum dolor sit amet, consectetur adipiscing\n" +
                    "        elit. Donec commodo, lacus vel fermentum feugiat, tellus leo ullamcorper turpis, ut dignissim sem ante eu orci.\n" +
                    "        Aenean egestas nisi at metus commodo, ac commodo erat cursus. Suspendisse potenti.",
            "6Quisque vehicula nulla vel sem rhoncus lobortis. Morbi porta augue dui, at semper ligula\n" +
                    "        volutpat ac. Quisque bibendum ipsum eget pharetra laoreet. Pellentesque id porta velit, nec vestibulum lorem.\n" +
                    "        Cras in est id orci vehicula molestie. Praesent vitae viverra lacus. Praesent ullamcorper molestie risus, eget\n" +
                    "        volutpat diam luctus eget. Donec quis convallis dui, at pretium arcu. Donec congue porta efficitur. In hac\n" +
                    "        habitasse platea dictumst. Etiam aliquam justo in dolor bibendum sagittis eget consectetur arcu. Sed varius quam\n" +
                    "        pulvinar nunc pellentesque, non gravida lacus aliquam. Nunc et ultrices neque, ullamcorper rhoncus leo.",
            "7Integer lobortis nec augue sit amet pretium. Integer euismod bibendum aliquam. In hac\n" +
                    "        habitasse platea dictumst. Quisque et feugiat purus, vel feugiat risus. Fusce et ante tortor. Cras lobortis nunc\n" +
                    "        a justo consectetur malesuada. Nullam mi lectus, semper vitae fringilla elementum, tristique at enim. Vestibulum\n" +
                    "        eu lectus lacinia, luctus arcu quis, imperdiet eros. Donec suscipit ac nisl quis consectetur. Pellentesque\n" +
                    "        ornare odio vitae suscipit sollicitudin. Donec at suscipit nisl, eget fermentum tellus.",
            "8Nulla elementum nibh velit, eget egestas diam lacinia euismod. Curabitur aliquam ante nulla,\n" +
                    "        vel lobortis erat cursus nec. Morbi et commodo purus, in dictum sapien. Donec hendrerit ligula orci, at egestas\n" +
                    "        dolor semper vitae. Nam ut placerat justo, a efficitur tortor. Morbi eget porta diam. Vivamus quis arcu semper,\n" +
                    "        hendrerit lacus nec, sagittis ipsum. Aenean placerat commodo cursus. Donec lacus velit, malesuada a mauris sed,\n" +
                    "        lacinia pretium augue. Nunc ultricies tortor id faucibus rhoncus. Vivamus in magna vel nisi efficitur sodales\n" +
                    "        vitae aliquet nunc. Donec id dapibus magna, eget hendrerit tellus. Integer varius dolor vitae magna feugiat, eu\n" +
                    "        posuere ex ultrices. Sed egestas erat ac eleifend scelerisque. In nec dignissim lorem. Aenean faucibus iaculis\n" +
                    "        tortor maximus aliquam.",
            "9Curabitur lobortis feugiat est, sit amet suscipit odio consequat dignissim. Ut congue nisi\n" +
                    "        vitae pulvinar rhoncus. Nullam et mi pretium, rutrum libero nec, dignissim eros. Integer sollicitudin, urna et\n" +
                    "        euismod cursus, quam tortor hendrerit odio, nec facilisis eros lacus sed velit. Ut ac est non erat laoreet\n" +
                    "        varius. Suspendisse facilisis eget nunc sit amet fringilla. Pellentesque tincidunt sed leo quis dignissim.\n" +
                    "        Quisque malesuada mattis mattis. Integer eu molestie nulla.",
            "10Pellentesque tincidunt lacus ac sapien laoreet, eget congue nibh fermentum. Maecenas eu\n" +
                    "        mattis ligula. Sed malesuada tempus diam, in malesuada purus ultricies sed. Praesent lacinia turpis purus.\n" +
                    "        Vivamus in viverra ante. Aenean eu venenatis enim, eget pretium massa. Vivamus efficitur justo ac urna porta\n" +
                    "        elementum. Nulla maximus dictum feugiat.",
            "11Suspendisse fermentum metus et viverra imperdiet. Vestibulum ante ipsum primis in faucibus\n" +
                    "        orci luctus et ultrices posuere cubilia Curae; Phasellus mollis mauris nibh, a gravida nunc pharetra sed.\n" +
                    "        Suspendisse tincidunt luctus elementum. Mauris pharetra ultrices lacus nec mattis. Etiam urna felis, euismod a\n" +
                    "        euismod scelerisque, sodales eu purus. Nunc in velit sit amet orci convallis porta sit amet vitae tortor.\n" +
                    "        Maecenas lacinia accumsan faucibus. Suspendisse ullamcorper non ligula at ultrices. Suspendisse at purus non\n" +
                    "        ligula dapibus suscipit. In et neque eu dui viverra commodo. Nullam volutpat turpis mauris, quis finibus arcu\n" +
                    "        fringilla vitae. Mauris accumsan eu massa a porta. Cras eleifend arcu mollis, tincidunt elit rhoncus, faucibus\n" +
                    "        tortor. Fusce vitae tellus tincidunt, tristique lacus a, feugiat mauris. Quisque ut placerat turpis.",
            "12Praesent ante magna, efficitur vitae tempus sed, porttitor at purus. Maecenas eu orci\n" +
                    "        lacus. Mauris ex metus, volutpat vehicula dolor quis, maximus fermentum ipsum. Fusce ornare sagittis mauris ut\n" +
                    "        tempus. Fusce justo odio, dapibus condimentum felis in, scelerisque venenatis lacus. Nam elementum felis et\n" +
                    "        elementum dapibus. Aliquam ut orci sed lacus sodales tempor. Sed blandit euismod mauris, eu consequat diam\n" +
                    "        congue a.",
            "13Aliquam faucibus consequat nunc non tincidunt. Aenean sit amet mollis orci. Mauris eu lorem\n" +
                    "        sed sem ullamcorper molestie. In dictum, nisi sit amet tincidunt ultrices, augue magna malesuada ex, vel\n" +
                    "        bibendum ligula leo elementum mi. Sed laoreet condimentum lectus, in pharetra arcu euismod id. Mauris efficitur\n" +
                    "        dui id velit lobortis, eu consequat sem sodales. Aliquam egestas massa sed imperdiet sagittis. Phasellus\n" +
                    "        consectetur vel ligula quis dignissim.",
            "14Donec iaculis placerat justo nec tincidunt. In id condimentum mi, nec facilisis est. Morbi\n" +
                    "        pulvinar dolor nec mauris posuere semper. Etiam ut dictum augue, nec consequat elit. Sed id fermentum sem. Donec\n" +
                    "        commodo tortor at lacus pharetra, nec dapibus nunc ullamcorper. Ut ultrices, elit ut vulputate tristique, sem\n" +
                    "        felis tincidunt nulla, a placerat felis risus id lacus. Nullam tincidunt tempor arcu, sodales consequat nunc\n" +
                    "        sollicitudin sed.",
            "15Ut in erat eros. Nullam dignissim feugiat dictum. Quisque pretium nec odio sed feugiat. In\n" +
                    "        lobortis sagittis tortor id dictum. Quisque non porttitor libero. Nam bibendum ex felis, facilisis fringilla mi\n" +
                    "        gravida ut. Donec maximus sapien eget purus molestie pulvinar. Etiam commodo odio sem, malesuada sodales tortor\n" +
                    "        varius eu. Etiam condimentum tempus molestie. Donec et quam egestas, varius tortor quis, iaculis lacus. Etiam in\n" +
                    "        sollicitudin libero. Ut et arcu ex.",
            "16Sed mauris nibh, eleifend nec metus et, rutrum dapibus odio. Duis ipsum nunc, blandit a\n" +
                    "        venenatis et, aliquam sit amet mi. Nullam nec est at lorem tristique posuere et vel nibh. Aliquam sagittis\n" +
                    "        pellentesque dolor nec auctor. Vivamus sed ante quis ipsum accumsan aliquam eu sit amet turpis. Ut aliquam\n" +
                    "        eleifend felis, vel mattis eros finibus eget. Praesent dapibus nisl augue, quis accumsan mauris gravida ut. In\n" +
                    "        hac habitasse platea dictumst. Pellentesque sem mi, rutrum molestie posuere vitae, cursus non magna. Maecenas in\n" +
                    "        dui libero.",
            "17Donec ut nibh congue, scelerisque arcu vitae, laoreet quam. Aliquam metus lectus, tincidunt\n" +
                    "        eget blandit ac, luctus at orci. Pellentesque finibus elit et laoreet commodo. Nunc condimentum enim dolor, in\n" +
                    "        volutpat libero congue sollicitudin. Vestibulum dolor mauris, pellentesque ut lacus non, placerat dictum lectus.\n" +
                    "        Sed congue interdum neque, quis aliquet velit consectetur eleifend. Phasellus eget erat diam. Quisque malesuada\n" +
                    "        justo at neque rhoncus, vitae vehicula velit consequat. Praesent mauris tellus, rhoncus id erat vel,\n" +
                    "        sollicitudin venenatis nunc. Donec quis pellentesque nibh. Proin est libero, dictum sit amet neque vel, rutrum\n" +
                    "        ornare augue. Quisque interdum efficitur leo dignissim posuere.",
            "18Phasellus eget luctus felis. Donec risus mi, imperdiet et dictum vitae, elementum facilisis\n" +
                    "        orci. Duis eget eros fermentum, euismod libero ut, porta velit. Pellentesque vestibulum orci ac maximus congue.\n" +
                    "        Morbi bibendum semper tempus. Donec lacinia interdum congue. Vivamus quis tellus quam. Nullam id nunc nibh.\n" +
                    "        Suspendisse euismod accumsan nisl ut faucibus. Mauris non nibh odio. Aenean fringilla ante posuere eros ultrices\n" +
                    "        faucibus. Morbi at odio sit amet massa venenatis vestibulum vitae at odio. Proin viverra enim ac aliquet\n" +
                    "        laoreet.",
            "19Vivamus pharetra porttitor pellentesque. Cras dictum suscipit elit, a sodales diam feugiat\n" +
                    "        eget. Nam imperdiet mattis nisi in convallis. Quisque efficitur, felis vitae faucibus euismod, odio odio lacinia\n" +
                    "        lorem, in feugiat orci nisl eu neque. Praesent dictum aliquam velit. Aenean nec semper ligula, ac porta nisl.\n" +
                    "        Nunc posuere dapibus leo, quis tempor nisl hendrerit eget. Donec ac mattis nisi. Ut id nulla at massa efficitur\n" +
                    "        rhoncus.",
            "20Vivamus pharetra porttitor pellentesque. Cras dictum suscipit elit, a sodales diam feugiat\n" +
                    "        eget. Nam imperdiet mattis nisi in convallis. Quisque efficitur, felis vitae faucibus euismod, odio odio lacinia\n" +
                    "        lorem, in feugiat orci nisl eu neque. Praesent dictum aliquam velit. Aenean nec semper ligula, ac porta nisl.\n" +
                    "        Nunc posuere dapibus leo, quis tempor nisl hendrerit eget. Donec ac mattis nisi. Ut id nulla at massa efficitur\n" +
                    "        rhoncus."
        )
        fun getIconList(): MutableList<Int>{
            return iconArray.toMutableList()
        }
    }
}
@SuppressLint("ParcelCreator")
data class TimeLineData(var image : Int, var comment:String) : Parcelable{
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(image)
        parcel.writeString(comment)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<TimeLineData> {
        override fun createFromParcel(parcel: Parcel): TimeLineData {
            return TimeLineData(parcel)
        }

        override fun newArray(size: Int): Array<TimeLineData?> {
            return arrayOfNulls(size)
        }
        val defaultList: MutableList<TimeLineData>
            get() {
                val dataList = mutableListOf<TimeLineData>()
                for (i in DataClass.picArray.indices) {
                    dataList.add(
                        TimeLineData(
                            DataClass.picArray[i],
                            DataClass.commentArray[i]
                        )
                    )
                }
                return dataList
            }
    }
}
@SuppressLint("ParcelCreator")
data class IconData(var icon : Int, var name:String) : Parcelable{
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(icon)
        parcel.writeString(name)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<IconData> {
        override fun createFromParcel(parcel: Parcel): IconData {
            return IconData(parcel)
        }

        override fun newArray(size: Int): Array<IconData?> {
            return arrayOfNulls(size)
        }
        val defaultList: MutableList<IconData>
            get() {
                val dataList = mutableListOf<IconData>()
                for (i in DataClass.iconArray.indices) {
                    dataList.add(
                        IconData(
                            DataClass.iconArray[i],
                            DataClass.nameArray[i]
                        )
                    )
                }
                return dataList
            }
    }
}
@SuppressLint("ParcelCreator")
class Userinfo() :Parcelable{

    var userIcon : Int =0
    var userName : String =""
    var userId : Int=0
    var posts :Float =0F
    var followers :Int=0
    var following : Int =0
    var company : String =""
    var companydescribe : String =""
    var describe : String =""
    var website : String=""
    var followBy : MutableList<IconData> =ArrayList()
    var Gallery:  MutableList<TimeLineData> =ArrayList()
    inline fun <reified T> Parcel.readMutableList(): MutableList<T> {
        @Suppress("UNCHECKED_CAST")
        return readArrayList(T::class.java.classLoader) as MutableList<T>
    }
    constructor(parcel: Parcel) : this() {
        userIcon = parcel.readInt()
        userName = parcel.readString()
        userId = parcel.readInt()
        posts = parcel.readFloat()
        followers = parcel.readInt()
        following = parcel.readInt()
        company = parcel.readString()
        companydescribe = parcel.readString()
        describe = parcel.readString()
        website = parcel.readString()
        followBy = parcel.readMutableList()
        Gallery = parcel.readMutableList()
//        followBy = parcel.readArrayList(IconData::class.java.classLoader) as MutableList<IconData>
//        Gallery = parcel.readArrayList(TimeLineData::class.java.classLoader) as MutableList<TimeLineData>
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(userIcon)
        parcel.writeString(userName)
        parcel.writeInt(userId)
        parcel.writeFloat(posts)
        parcel.writeInt(followers)
        parcel.writeInt(following)
        parcel.writeString(company)
        parcel.writeString(companydescribe)
        parcel.writeString(describe)
        parcel.writeString(website)
        parcel.writeList(followBy)
        parcel.writeList(Gallery)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Userinfo> {
        override fun createFromParcel(parcel: Parcel): Userinfo {
            return Userinfo(parcel)
        }

        override fun newArray(size: Int): Array<Userinfo?> {
            return arrayOfNulls(size)
        }
        val defaultData: Userinfo
            get() {
                val user= Userinfo()
                user.userIcon = R.drawable.subicon
                user.userName = "natgeo"
                user.userId = 131452777
                user.posts = 20.4F
                user.followers=112
                user.following=131
                user.company = "National Geographic"
                user.companydescribe = "Media/News Company"
                user.describe = "Experience the world through the Geographic photographers."
                user.website = "natgeo.com"
                user.followBy = IconData.defaultList
                user.Gallery = TimeLineData.defaultList
                return user
            }
    }


}