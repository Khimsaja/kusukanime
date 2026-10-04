package io.github.jan.supabase.storage;

import P3.y;
import android.content.Context;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016J\u001a\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\t0\bH\u0016¨\u0006\n"}, d2 = {"Lio/github/jan/supabase/storage/SupabaseInitializer;", "Landroidx/startup/Initializer;", "Landroid/content/Context;", "<init>", "()V", "create", "context", "dependencies", "", "Ljava/lang/Class;", "storage-kt_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SupabaseInitializer implements N2.b {
    @Override // N2.b
    public List<Class<? extends N2.b>> dependencies() {
        return y.f7779k;
    }

    @Override // N2.b
    public Context create(Context context) {
        l.f("context", context);
        Context applicationContext = context.getApplicationContext();
        ContextKt.appContext = applicationContext;
        l.e("also(...)", applicationContext);
        return applicationContext;
    }
}
