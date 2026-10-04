package F2;

import K2.W;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.kusukanime.R;

/* renamed from: F2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0158n extends W {

    /* renamed from: t, reason: collision with root package name */
    public final TextView f2372t;

    /* renamed from: u, reason: collision with root package name */
    public final TextView f2373u;

    /* renamed from: v, reason: collision with root package name */
    public final ImageView f2374v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C0163t f2375w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0158n(C0163t c0163t, View view) {
        super(view);
        this.f2375w = c0163t;
        if (B1.K.a < 26) {
            view.setFocusable(true);
        }
        this.f2372t = (TextView) view.findViewById(R.id.exo_main_text);
        this.f2373u = (TextView) view.findViewById(R.id.exo_sub_text);
        this.f2374v = (ImageView) view.findViewById(R.id.exo_icon);
        view.setOnClickListener(new ViewOnClickListenerC0150f(2, this));
    }
}
