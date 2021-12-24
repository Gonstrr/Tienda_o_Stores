package com.example.stores

interface OnClickListener {
    fun onClick(storeId: Long)
    fun onFavoriteStoreClick(storeEntity: StoreEntity)
    fun onDeleteStore(storeEntity: StoreEntity)
}