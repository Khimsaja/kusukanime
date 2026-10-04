package F2;

import K2.W;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.kusukanime.R;

/* renamed from: F2.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0159o extends K2.A {

    /* renamed from: c, reason: collision with root package name */
    public final String[] f2376c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f2377d;

    /* renamed from: e, reason: collision with root package name */
    public final Drawable[] f2378e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0163t f2379f;

    public C0159o(C0163t c0163t, String[] strArr, Drawable[] drawableArr) {
        this.f2379f = c0163t;
        this.f2376c = strArr;
        this.f2377d = new String[strArr.length];
        this.f2378e = drawableArr;
    }

    @Override // K2.A
    public final int a() {
        return this.f2376c.length;
    }

    @Override // K2.A
    public final void b(W w7, int i7) {
        C0158n c0158n = (C0158n) w7;
        boolean zD = d(i7);
        View view = c0158n.a;
        if (zD) {
            view.setLayoutParams(new K2.I(-1, -2));
        } else {
            view.setLayoutParams(new K2.I(0, 0));
        }
        c0158n.f2372t.setText(this.f2376c[i7]);
        String str = this.f2377d[i7];
        TextView textView = c0158n.f2373u;
        if (str == null) {
            textView.setVisibility(8);
        } else {
            textView.setText(str);
        }
        Drawable drawable = this.f2378e[i7];
        ImageView imageView = c0158n.f2374v;
        if (drawable == null) {
            imageView.setVisibility(8);
        } else {
            imageView.setImageDrawable(drawable);
        }
    }

    @Override // K2.A
    public final W c(ViewGroup viewGroup) {
        C0163t c0163t = this.f2379f;
        return new C0158n(c0163t, LayoutInflater.from(c0163t.getContext()).inflate(R.layout.exo_styled_settings_list_item, viewGroup, false));
    }

    public final boolean d(int i7) {
        C0163t c0163t = this.f2379f;
        y1.L l7 = c0163t.f2447t0;
        if (l7 == null) {
            return false;
        }
        if (i7 == 0) {
            return ((Q4.c) l7).y0(13);
        }
        if (i7 != 1) {
            return true;
        }
        return ((Q4.c) l7).y0(30) && ((Q4.c) c0163t.f2447t0).y0(29);
    }
}
