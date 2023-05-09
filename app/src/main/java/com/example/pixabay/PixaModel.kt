package com.example.pixabay

import java.util.ArrayList

data class PixaModel (
    var hits:ArrayList<ImageModel>
        )

 data class ImageModel (
     var largeImageURL:String
     )


