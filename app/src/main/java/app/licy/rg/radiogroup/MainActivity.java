package app.licy.rg.radiogroup;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.RadioButton;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * MainActivity
 *
 * @author : Licy
 * @date : 2019年4月9日
 * email ：licy3051@qq.com
 */
public class MainActivity extends AppCompatActivity {

    @BindView(R.id.rb_1)
    RadioButton rb1;
    @BindView(R.id.rb_2)
    RadioButton rb2;
    @BindView(R.id.rb_3)
    RadioButton rb3;
    @BindView(R.id.rb_4)
    RadioButton rb4;
    @BindView(R.id.rb_5)
    RadioButton rb5;
    @BindView(R.id.rb_6)
    RadioButton rb6;
    @BindView(R.id.rb_7)
    RadioButton rb7;
    @BindView(R.id.rb_8)
    RadioButton rb8;
    @BindView(R.id.rb_9)
    RadioButton rb9;
    @BindView(R.id.rb_10)
    RadioButton rb10;
    @BindView(R.id.rb_11)
    RadioButton rb11;
    @BindView(R.id.rb_12)
    RadioButton rb12;
    @BindView(R.id.rb_13)
    RadioButton rb13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        initRadioButtons();

    }

    public void initRadioButtons() {

        WindowManager windowManager = getWindowManager();
        Point point = new Point();
        windowManager.getDefaultDisplay().getSize(point);
        int width = point.x;
        // 这里设置的是radio button的高度
        int height = dpToPx(this, 30);

        LinearLayout.LayoutParams params2 = (LinearLayout.LayoutParams) rb2.getLayoutParams();
        params2.setMargins(width / 2, -height, 0, 0);
        rb2.setLayoutParams(params2);

        LinearLayout.LayoutParams params4 = (LinearLayout.LayoutParams) rb4.getLayoutParams();
        params4.setMargins(width / 3, -height, 0, 0);
        rb4.setLayoutParams(params4);

        LinearLayout.LayoutParams params5 = (LinearLayout.LayoutParams) rb5.getLayoutParams();
        params5.setMargins((width / 3) * 2, -height, 0, 0);
        rb5.setLayoutParams(params5);

        LinearLayout.LayoutParams params7 = (LinearLayout.LayoutParams) rb7.getLayoutParams();
        params7.setMargins(width / 4, -height, 0, 0);
        rb7.setLayoutParams(params7);

        LinearLayout.LayoutParams params8 = (LinearLayout.LayoutParams) rb8.getLayoutParams();
        params8.setMargins((width / 4) * 2, -height, 0, 0);
        rb8.setLayoutParams(params8);

        LinearLayout.LayoutParams params9 = (LinearLayout.LayoutParams) rb9.getLayoutParams();
        params9.setMargins((width / 4) * 3, -height, 0, 0);
        rb9.setLayoutParams(params9);

        LinearLayout.LayoutParams params11 = (LinearLayout.LayoutParams) rb11.getLayoutParams();
        params11.setMargins(width / 4, -height, 0, 0);
        rb11.setLayoutParams(params11);

        LinearLayout.LayoutParams params12 = (LinearLayout.LayoutParams) rb12.getLayoutParams();
        params12.setMargins((width / 4) * 2, -height, 0, 0);
        rb12.setLayoutParams(params12);

        LinearLayout.LayoutParams params13 = (LinearLayout.LayoutParams) rb13.getLayoutParams();
        params13.setMargins((width / 4) * 3, -height, 0, 0);
        rb13.setLayoutParams(params13);

    }

    /**
     * 根据手机的分辨率从 dp 的单位 转成为 px(像素)
     */
    public static int dpToPx(final Context context, final float dp) {
        return (int) (dp * context.getResources().getDisplayMetrics().density);
    }


}
