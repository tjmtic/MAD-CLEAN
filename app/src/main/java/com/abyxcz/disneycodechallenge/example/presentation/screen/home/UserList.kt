package com.abyxcz.disneycodechallenge.example.presentation.screen.home

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text

import androidx.compose.runtime.Composable

import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.paging.compose.LazyPagingItems
import com.abyxcz.disneycodechallenge.domain.model.User
import com.abyxcz.disneycodechallenge.example.R


@OptIn(ExperimentalFoundationApi::class) //Required for sticky headers
@Composable
fun UserListContent(users: LazyPagingItems<User>,
                    getUserValue: (Boolean, User) -> Unit
) {
    //Function Hoisted in UserListItem
    fun getCheckboxValue(selected: Boolean, user: User){
        getUserValue(selected, user)
    }
    val groupedItems = users.itemSnapshotList.items.groupBy{ it.reserved }.toSortedMap(reverseOrder())

    LazyColumn{
                groupedItems.forEach { (reserved, userGroup) ->

                    stickyHeader{
                        Text(
                            text = if (reserved) stringResource(id = R.string.have_reservations) else stringResource(id = R.string.need_reservations),
                            color = Color.Black,
                            fontSize = 18.sp,
                            modifier = Modifier
                                .background(Color.White)
                                .padding(20.dp)
                                //.shadow(1.dp)
                                .fillMaxWidth()
                        )
                    }

                    items(items = userGroup,
                        key = { user ->
                            user.pk
                        }) { user ->
                            UserListItem(
                                user = user,
                                onCheckboxSelected = { getCheckboxValue(it, user) })
                    }
                }
            }

}






