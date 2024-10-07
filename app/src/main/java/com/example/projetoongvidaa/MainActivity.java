import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager2 viewPagerCarousel;
    private CarouselAdapter carouselAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize ViewPager2
        viewPagerCarousel = findViewById(R.id.viewPagerCarousel);

        // List of images to display in the carousel
        List<Integer> images = new ArrayList<>();
        images.add(R.drawable.image1);  // Ensure these images exist in drawable folder
        images.add(R.drawable.image2);
        images.add(R.drawable.image3);

        // Set up the adapter and attach it to the ViewPager2
        carouselAdapter = new CarouselAdapter(this, images);
        viewPagerCarousel.setAdapter(carouselAdapter);
    }
}
