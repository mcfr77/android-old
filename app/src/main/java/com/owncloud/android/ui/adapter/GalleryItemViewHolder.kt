/*
 *
 * Nextcloud Android client application
 *
 * @author Tobias Kaminsky
 * Copyright (C) 2022 Tobias Kaminsky
 * Copyright (C) 2022 Nextcloud GmbH
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <https://www.gnu.org/licenses/>.
 */

package com.owncloud.android.ui.adapter

import android.view.View
import android.widget.ImageView
import com.afollestad.sectionedrecyclerview.SectionedViewHolder
import com.elyeproj.loaderviewlibrary.LoaderImageView
import com.owncloud.android.databinding.GridImageBinding

class GalleryItemViewHolder(val binding: GridImageBinding) : SectionedViewHolder(binding.root),
    ListGridImageViewHolder {
    override fun getThumbnail(): ImageView {
        return binding.thumbnail
    }

    override fun getShimmerThumbnail(): LoaderImageView {
        return binding.thumbnailShimmer
    }

    override fun getFavorite(): ImageView {
        return binding.favoriteAction
    }

    override fun getLocalFileIndicator(): ImageView {
        return binding.localFileIndicator
    }

    override fun getShared(): ImageView {
        return binding.sharedIcon
    }

    override fun getCheckbox(): ImageView {
        return binding.customCheckbox
    }

    override fun getItemLayout(): View {
        return binding.ListItemLayout
    }

    override fun getUnreadComments(): ImageView {
        return binding.unreadComments
    }
}