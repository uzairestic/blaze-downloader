package com.example.uzair.blazeimageloader.repository

import ImageFeed
/**
 * This class acts as the repository, this class will be responsible to fetch the data
 * from data source, the view model of the application,
 * will not be aware of where the data is being fetched from.
 */
class ImageFeedRepository : IImageFeedRepository {
    override fun getAllImageFeeds(): List<ImageFeed> {
        //Return all the image feeds by creating an in app data model
        return listOf(ImageFeed())

        /*return listOf(
            ImageFeed("https://lh3.googleusercontent.com/ilpx0OlrIlJ0No0fRbIZEmtYJTt37WY4ouzRXFe3gFiltasjDgukbZEZW3954WIL8buXVRtlzQ=w640-h400-e365"),
            ImageFeed("https://lh3.googleusercontent.com/ilpx0OlrIlJ0No0fRbIZEmtYJTt37WY4ouzRXFe3gFiltasjDgukbZEZW3954WIL8buXVRtlzQ=w640-h400-e365", ""),
            ImageFeed("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTaKa-SUHCdG5RTO8CTj3yAzCDW5UTb5mInTppizcF_b925k00N", ""),
            ImageFeed("https://www.petmd.com/sites/default/files/Senior-Cat-Care-2070625.jpg", ""),
            ImageFeed("https://images2.minutemediacdn.com/image/upload/c_crop,h_1193,w_2121,x_0,y_175/f_auto,q_auto,w_1100/v1554921998/shape/mentalfloss/549585-istock-909106260.jpg", ""),
            ImageFeed("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ1fmdK6W7rSjqEk87xnxY2HodgwIV90j2Qtq8SVx059PqQw5nOFg", ""),
            ImageFeed("https://d17fnq9dkz9hgj.cloudfront.net/uploads/2012/11/101438745-cat-conjunctivitis-causes.jpg", ""),
            ImageFeed("https://metro.co.uk/wp-content/uploads/2019/05/Shadow-Darth-Maul-South-Ayrshire-b227.jpg?quality=90&strip=all", ""),
            ImageFeed("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQhW2--5Tf4McPHAV2sbBgV17QzMMPceHQgrA6sv_Yy8z6IdJns", ""),
            ImageFeed("https://d2eehagpk5cl65.cloudfront.net/img/q60/uploads/assets/mc/2018_12/reason-kitten.jpg", ""),
            ImageFeed("https://i.ytimg.com/vi/3QDYbQIS8cQ/maxresdefault.jpg", ""),
            ImageFeed("https://i.ytimg.com/vi/vdXDjCyv10M/hqdefault.jpg", ""),
            ImageFeed("https://images-na.ssl-images-amazon.com/images/I/71Ne2N59v1L._SX425_.jpg", ""),
            ImageFeed("http://www.thevbsc.net/pic/4.bp.blogspot.com/-Fh8PXM25pdY/T4ucliooPBI/AAAAAAAHQ54/lU4rlVHsKg0/s1600/Really+Fat+Cats+Photos+(34).jpg", ""),
            ImageFeed("https://tailandfur.com/wp-content/uploads/2015/09/40-Amazing-Cat-Funny-Moment-Pictures-Feature-Image.jpg", ""),
            ImageFeed("https://pbs.twimg.com/media/CsNjzFZXEAAbRGr.jpg:large", ""),
            ImageFeed("https://lh3.googleusercontent.com/ilpx0OlrIlJ0No0fRbIZEmtYJTt37WY4ouzRXFe3gFiltasjDgukbZEZW3954WIL8buXVRtlzQ=w640-h400-e365", ""),
            ImageFeed("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTaKa-SUHCdG5RTO8CTj3yAzCDW5UTb5mInTppizcF_b925k00N", ""),
            ImageFeed("https://www.petmd.com/sites/default/files/Senior-Cat-Care-2070625.jpg", ""),
            ImageFeed("https://images2.minutemediacdn.com/image/upload/c_crop,h_1193,w_2121,x_0,y_175/f_auto,q_auto,w_1100/v1554921998/shape/mentalfloss/549585-istock-909106260.jpg", ""),
            ImageFeed("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ1fmdK6W7rSjqEk87xnxY2HodgwIV90j2Qtq8SVx059PqQw5nOFg", ""),
            ImageFeed("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTJBnYhRJdmNKaOJbxiv1ENbv_HHfPNVCQytDpuXg3hfa5sf22W", ""),
            ImageFeed("https://metro.co.uk/wp-content/uploads/2019/05/Shadow-Darth-Maul-South-Ayrshire-b227.jpg?quality=90&strip=all", ""),
            ImageFeed("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQhW2--5Tf4McPHAV2sbBgV17QzMMPceHQgrA6sv_Yy8z6IdJns", ""),
            ImageFeed("https://d2eehagpk5cl65.cloudfront.net/img/q60/uploads/assets/mc/2018_12/reason-kitten.jpg", ""),
            ImageFeed("https://i.ytimg.com/vi/3QDYbQIS8cQ/maxresdefault.jpg", ""),
            ImageFeed("https://i.ytimg.com/vi/vdXDjCyv10M/hqdefault.jpg", ""),
            ImageFeed("https://images-na.ssl-images-amazon.com/images/I/71Ne2N59v1L._SX425_.jpg", ""),
            ImageFeed("http://www.thevbsc.net/pic/4.bp.blogspot.com/-Fh8PXM25pdY/T4ucliooPBI/AAAAAAAHQ54/lU4rlVHsKg0/s1600/Really+Fat+Cats+Photos+(34).jpg", ""),
            ImageFeed("https://tailandfur.com/wp-content/uploads/2015/09/40-Amazing-Cat-Funny-Moment-Pictures-Feature-Image.jpg", ""),
            ImageFeed("https://pbs.twimg.com/media/CsNjzFZXEAAbRGr.jpg:large", "")
        )*/
    }
}