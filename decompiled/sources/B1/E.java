package B1;

import android.os.Message;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class E {
    public Message a;

    public final void a() {
        this.a = null;
        ArrayList arrayList = F.f292b;
        synchronized (arrayList) {
            if (arrayList.size() < 50) {
                arrayList.add(this);
            }
        }
    }

    public final void b() {
        Message message = this.a;
        message.getClass();
        message.sendToTarget();
        a();
    }
}
