package a1;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.D;
import androidx.lifecycle.EnumC0689p;
import androidx.lifecycle.F;
import androidx.lifecycle.InterfaceC0694v;
import androidx.lifecycle.x;
import e5.AbstractC0832b;
import kotlin.jvm.internal.l;

/* renamed from: a1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0658b extends Activity implements InterfaceC0694v {

    /* renamed from: k, reason: collision with root package name */
    public final x f10421k = new x(this);

    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    @Override // android.app.Activity, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r12) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.AbstractActivityC0658b.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        l.f("event", keyEvent);
        View decorView = getWindow().getDecorView();
        l.e("window.decorView", decorView);
        if (AbstractC0832b.q(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i7 = F.f10705l;
        D.b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        l.f("outState", bundle);
        this.f10421k.h(EnumC0689p.f10738m);
        super.onSaveInstanceState(bundle);
    }
}
