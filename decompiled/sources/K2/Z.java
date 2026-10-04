package K2;

import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class Z {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public int f4541b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4542c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4543d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4544e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f4545f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f4546g;

    public Z(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f4546g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.a = -1;
        this.f4541b = Integer.MIN_VALUE;
        this.f4542c = false;
        this.f4543d = false;
        this.f4544e = false;
        int[] iArr = this.f4545f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
