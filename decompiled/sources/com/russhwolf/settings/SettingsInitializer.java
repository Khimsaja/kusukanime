package com.russhwolf.settings;

import N2.b;
import P3.y;
import android.content.Context;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import z1.c;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/russhwolf/settings/SettingsInitializer;", "LN2/b;", "Landroid/content/Context;", "<init>", "()V", "multiplatform-settings-no-arg_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SettingsInitializer implements b {
    @Override // N2.b
    public final Object create(Context context) {
        l.f("context", context);
        Context applicationContext = context.getApplicationContext();
        c.f18950l = applicationContext;
        l.e("also(...)", applicationContext);
        return applicationContext;
    }

    @Override // N2.b
    public final List dependencies() {
        return y.f7779k;
    }
}
