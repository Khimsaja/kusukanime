package F2;

import K2.W;
import android.view.View;
import android.widget.TextView;
import com.kusukanime.R;

/* renamed from: F2.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0160p extends W {

    /* renamed from: t, reason: collision with root package name */
    public final TextView f2380t;

    /* renamed from: u, reason: collision with root package name */
    public final View f2381u;

    public C0160p(View view) {
        super(view);
        if (B1.K.a < 26) {
            view.setFocusable(true);
        }
        this.f2380t = (TextView) view.findViewById(R.id.exo_text);
        this.f2381u = view.findViewById(R.id.exo_check);
    }
}
