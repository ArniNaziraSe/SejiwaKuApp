import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun LinkText(url: String, linkText: String) {
    val context = LocalContext.current
    Text(
        text = linkText,
        modifier = Modifier
            .padding(8.dp)
            .clickable {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                context.startActivity(intent)
            }
    )
}

@Composable
fun LinkLazyRow(urls: List<Pair<String, String>>) {
    LazyRow(modifier = Modifier.padding(16.dp)) {
        items(urls) { (url, linkText) ->
            LinkText(url = url, linkText = linkText)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewLinkLazyRow() {
    val sampleUrls = listOf(
        "https://www.example.com" to "Example",
        "https://www.google.com" to "Google",
        "https://www.github.com" to "GitHub"
    )

    LinkLazyRow(urls = sampleUrls)
}