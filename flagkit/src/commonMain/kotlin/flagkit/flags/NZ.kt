package flagkit.flags

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import flagkit.FlagKit

val FlagKit.NZ: ImageVector
    get() {
        if (_NZ != null) {
            return _NZ!!
        }
        _NZ = ImageVector.Builder(
            name = "NZ",
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
                        0f to Color(0xFF0A17A7),
                        1f to Color(0xFF030E88)
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
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(4.074f, -0.902f),
                    end = Offset(4.074f, 7.902f)
                ),
                strokeLineWidth = 1f
            ) {
                moveTo(3f, 3.23f)
                lineTo(-1.352f, -0.5f)
                lineTo(0.66f, -0.5f)
                lineTo(4.16f, 2f)
                lineTo(4.857f, 2f)
                lineTo(9.5f, -0.902f)
                lineTo(9.5f, 0.25f)
                curveTo(9.5f, 0.553f, 9.333f, 0.877f, 9.082f, 1.056f)
                lineTo(6f, 3.257f)
                lineTo(6f, 3.77f)
                lineTo(9.137f, 6.459f)
                curveTo(9.599f, 6.855f, 9.341f, 7.5f, 8.75f, 7.5f)
                curveTo(8.505f, 7.5f, 8.205f, 7.404f, 8.001f, 7.258f)
                lineTo(4.84f, 5f)
                lineTo(4.143f, 5f)
                lineTo(-0.5f, 7.902f)
                lineTo(-0.5f, 6.243f)
                lineTo(3f, 3.743f)
                lineTo(3f, 3.23f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFDB1E36),
                        1f to Color(0xFFD51931)
                    ),
                    start = Offset(4.5f, 0f),
                    end = Offset(4.5f, 7f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(3.5f, 3f)
                lineTo(-0f, -0f)
                lineTo(0.5f, -0f)
                lineTo(4f, 2.5f)
                lineTo(5f, 2.5f)
                lineTo(9f, -0f)
                lineTo(9f, 0.25f)
                curveTo(9f, 0.388f, 8.913f, 0.562f, 8.792f, 0.649f)
                lineTo(5.5f, 3f)
                lineTo(5.5f, 4f)
                lineTo(8.812f, 6.839f)
                curveTo(8.916f, 6.928f, 8.884f, 7f, 8.75f, 7f)
                lineTo(8.75f, 7f)
                curveTo(8.612f, 7f, 8.413f, 6.938f, 8.292f, 6.851f)
                lineTo(5f, 4.5f)
                lineTo(4f, 4.5f)
                lineTo(-0f, 7f)
                lineTo(-0f, 6.5f)
                lineTo(3.5f, 4f)
                lineTo(3.5f, 3f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFFFFFFF),
                        1f to Color(0xFFF0F0F0)
                    ),
                    start = Offset(4.75f, 0f),
                    end = Offset(4.75f, 7.5f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(-0f, 2.5f)
                lineTo(-0f, 4.5f)
                lineTo(3.5f, 4.5f)
                lineTo(3.5f, 7.005f)
                curveTo(3.5f, 7.278f, 3.714f, 7.5f, 4.005f, 7.5f)
                lineTo(4.995f, 7.5f)
                curveTo(5.274f, 7.5f, 5.5f, 7.284f, 5.5f, 7.005f)
                lineTo(5.5f, 4.5f)
                lineTo(9.01f, 4.5f)
                curveTo(9.28f, 4.5f, 9.5f, 4.286f, 9.5f, 3.995f)
                lineTo(9.5f, 3.005f)
                curveTo(9.5f, 2.726f, 9.285f, 2.5f, 9.01f, 2.5f)
                lineTo(5.5f, 2.5f)
                lineTo(5.5f, -0f)
                lineTo(3.5f, -0f)
                lineTo(3.5f, 2.5f)
                lineTo(-0f, 2.5f)
                close()
            }
            path(
                fill = Brush.linearGradient(
                    colorStops = arrayOf(
                        0f to Color(0xFFDB1E36),
                        1f to Color(0xFFD51931)
                    ),
                    start = Offset(4.5f, 0f),
                    end = Offset(4.5f, 7f)
                ),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(-0f, 3f)
                lineToRelative(4f, 0f)
                lineToRelative(0f, -0.5f)
                lineToRelative(0f, -2.5f)
                lineToRelative(1f, 0f)
                lineToRelative(0f, 2.5f)
                lineToRelative(0f, 0.5f)
                lineToRelative(4f, 0f)
                lineToRelative(0f, 1f)
                lineToRelative(-4f, 0f)
                lineToRelative(0f, 0.5f)
                lineToRelative(0f, 2.5f)
                lineToRelative(-1f, 0f)
                lineToRelative(0f, -2.5f)
                lineToRelative(0f, -0.5f)
                lineToRelative(-4f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFCA1931)),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15f, 13f)
                lineToRelative(-0.707f, 0.207f)
                lineToRelative(0.207f, -0.707f)
                lineToRelative(-0.207f, -0.707f)
                lineToRelative(0.707f, 0.207f)
                lineToRelative(0.707f, -0.207f)
                lineToRelative(-0.207f, 0.707f)
                lineToRelative(0.207f, 0.707f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFCA1931)),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(15f, 3.5f)
                lineToRelative(-0.707f, 0.207f)
                lineToRelative(0.207f, -0.707f)
                lineToRelative(-0.207f, -0.707f)
                lineToRelative(0.707f, 0.207f)
                lineToRelative(0.707f, -0.207f)
                lineToRelative(-0.207f, 0.707f)
                lineToRelative(0.207f, 0.707f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFCA1931)),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(18f, 6.5f)
                lineToRelative(-0.707f, 0.207f)
                lineToRelative(0.207f, -0.707f)
                lineToRelative(-0.207f, -0.707f)
                lineToRelative(0.707f, 0.207f)
                lineToRelative(0.707f, -0.207f)
                lineToRelative(-0.207f, 0.707f)
                lineToRelative(0.207f, 0.707f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFCA1931)),
                strokeLineWidth = 1f,
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(12f, 7.5f)
                lineToRelative(-0.707f, 0.207f)
                lineToRelative(0.207f, -0.707f)
                lineToRelative(-0.207f, -0.707f)
                lineToRelative(0.707f, 0.207f)
                lineToRelative(0.707f, -0.207f)
                lineToRelative(-0.207f, 0.707f)
                lineToRelative(0.207f, 0.707f)
                close()
            }
        }.build()

        return _NZ!!
    }

@Suppress("ObjectPropertyName")
private var _NZ: ImageVector? = null
