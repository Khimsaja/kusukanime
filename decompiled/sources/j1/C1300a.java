package j1;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: j1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1300a extends ClickableSpan {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final C1303d f12211b;

    /* renamed from: c, reason: collision with root package name */
    public final int f12212c;

    public C1300a(int i7, C1303d c1303d, int i8) {
        this.a = i7;
        this.f12211b = c1303d;
        this.f12212c = i8;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.a);
        this.f12211b.a.performAction(this.f12212c, bundle);
    }
}
