package ru.renett.carefully.ui.app

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CarefullyTopAppBar(
    @StringRes titleRes: Int,
    actions: List<TopAppBarAction> = listOf(),
    modifier: Modifier = Modifier,
    isNavigationIconEnabled: Boolean = false,
    navigationAction: TopAppBarAction? = null,
) {
    CenterAlignedTopAppBar(
        title = {
            Text(text = stringResource(id = titleRes))
        },
        navigationIcon = {
            if (isNavigationIconEnabled) {
                navigationAction?.let { action ->
                    IconButton(onClick = action.onActionClick) {
                        Icon(
                            imageVector = action.icon,
                            contentDescription = action.contentDescription
                        )
                    }
                }
            }
        },
        actions = {
            for (action in actions) {
                IconButton(onClick = action.onActionClick) {
                    Icon(
                        imageVector = action.icon,
                        contentDescription = action.contentDescription
                    )
                }
            }
        }
    )
}

class TopAppBarAction(
    val icon: ImageVector,
    val contentDescription: String?,
    val onActionClick: () -> Unit = {}
)

@Preview("Carefully Top App Bar")
@Composable
fun CarefullyTopAppBarPreview() {
    CarefullyTopAppBar(
        titleRes = android.R.string.untitled,
        actions = listOf(
            TopAppBarAction(Icons.Default.Edit, "Edit")
        ),
        navigationAction = TopAppBarAction(Icons.Default.ArrowBack, "Back")
    )
}
