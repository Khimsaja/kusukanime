package J1;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* renamed from: J1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0288d extends ContentObserver {
    public final ContentResolver a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f4187b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0289e f4188c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0288d(C0289e c0289e, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f4188c = c0289e;
        this.a = contentResolver;
        this.f4187b = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z7) {
        C0289e c0289e = this.f4188c;
        c0289e.a(C0286b.c(c0289e.a, c0289e.f4196i, c0289e.f4195h));
    }
}
