package B1;

import android.content.Intent;
import android.content.IntentSender;
import java.io.Serializable;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements Runnable {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f342k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f343l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f344m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f345n;

    public /* synthetic */ m(int i7, int i8, Object obj, Object obj2) {
        this.f342k = i8;
        this.f344m = obj;
        this.f343l = i7;
        this.f345n = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f342k) {
            case 0:
                Iterator it = ((CopyOnWriteArraySet) this.f344m).iterator();
                while (it.hasNext()) {
                    p pVar = (p) it.next();
                    if (!pVar.f348d) {
                        int i7 = this.f343l;
                        if (i7 != -1) {
                            pVar.f346b.a(i7);
                        }
                        pVar.f347c = true;
                        ((n) this.f345n).invoke(pVar.a);
                    }
                }
                break;
            case 1:
                ((I2.d) ((I2.a) this.f344m).f4005c).b(this.f343l, (Serializable) this.f345n);
                break;
            default:
                ((c.l) this.f344m).a(this.f343l, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) this.f345n));
                break;
        }
    }
}
