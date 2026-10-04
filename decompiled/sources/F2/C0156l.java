package F2;

import K2.W;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.kusukanime.R;

/* renamed from: F2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0156l extends K2.A {

    /* renamed from: c, reason: collision with root package name */
    public final String[] f2368c;

    /* renamed from: d, reason: collision with root package name */
    public final float[] f2369d;

    /* renamed from: e, reason: collision with root package name */
    public int f2370e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0163t f2371f;

    public C0156l(C0163t c0163t, String[] strArr, float[] fArr) {
        this.f2371f = c0163t;
        this.f2368c = strArr;
        this.f2369d = fArr;
    }

    @Override // K2.A
    public final int a() {
        return this.f2368c.length;
    }

    @Override // K2.A
    public final void b(W w7, final int i7) {
        C0160p c0160p = (C0160p) w7;
        String[] strArr = this.f2368c;
        if (i7 < strArr.length) {
            c0160p.f2380t.setText(strArr[i7]);
        }
        int i8 = this.f2370e;
        View view = c0160p.f2381u;
        View view2 = c0160p.a;
        if (i7 == i8) {
            view2.setSelected(true);
            view.setVisibility(0);
        } else {
            view2.setSelected(false);
            view.setVisibility(4);
        }
        view2.setOnClickListener(new View.OnClickListener() { // from class: F2.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                C0156l c0156l = this.a;
                int i9 = c0156l.f2370e;
                int i10 = i7;
                C0163t c0163t = c0156l.f2371f;
                if (i10 != i9) {
                    c0163t.setPlaybackSpeed(c0156l.f2369d[i10]);
                }
                c0163t.f2448u.dismiss();
            }
        });
    }

    @Override // K2.A
    public final W c(ViewGroup viewGroup) {
        return new C0160p(LayoutInflater.from(this.f2371f.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
    }
}
