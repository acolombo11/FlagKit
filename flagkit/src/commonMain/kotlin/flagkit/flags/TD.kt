package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.TD: ImageVector
    get() {
        if (_TD != null) {
            return _TD!!
        }
        _TD = ImageVector.Builder(
            name = "TD",
            defaultWidth = 21.dp,
            defaultHeight = 15.dp,
            viewportWidth = 21f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(10.5f, 0f),
                    end = Offset(10.5f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-21f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFDE1D42),
                        1f to Color(0xFFC51335)
                    ),
                    start = Offset(15.5f, 0f),
                    end = Offset(15.5f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(10f, 0f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-11f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFF083780),
                        1f to Color(0xFF032862)
                    ),
                    start = Offset(3.5f, 0f),
                    end = Offset(3.5f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-7f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFD147),
                        1f to Color(0xFFFECA2F)
                    ),
                    start = Offset(10.5f, 0f),
                    end = Offset(10.5f, 15f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(7f, 0f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-7f)
                close()
            }
        }.build()

        return _TD!!
    }

@Suppress("ObjectPropertyName")
private var _TD: ImageVector? = null
