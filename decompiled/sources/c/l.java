package c;

import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import b1.AbstractC0703b;
import f.C0840a;
import f.C0842c;
import f.C0846g;
import f6.AbstractC0905c;
import g.C0928a;
import g.InterfaceC0931d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class l {
    public final LinkedHashMap a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f11061b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f11062c = new LinkedHashMap();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f11063d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final transient LinkedHashMap f11064e = new LinkedHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f11065f = new LinkedHashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f11066g = new Bundle();

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n f11067h;

    public l(n nVar) {
        this.f11067h = nVar;
    }

    public final boolean a(int i7, int i8, Intent intent) {
        String str = (String) this.a.get(Integer.valueOf(i7));
        if (str == null) {
            return false;
        }
        C0842c c0842c = (C0842c) this.f11064e.get(str);
        if ((c0842c != null ? c0842c.a : null) != null) {
            ArrayList arrayList = this.f11063d;
            if (arrayList.contains(str)) {
                ((e4.k) c0842c.a.a.getValue()).invoke(c0842c.f11379b.a(intent, i8));
                arrayList.remove(str);
                return true;
            }
        }
        this.f11065f.remove(str);
        this.f11066g.putParcelable(str, new C0840a(intent, i8));
        return true;
    }

    public final void b(int i7, C0928a c0928a, L2.e eVar) {
        Intent intent;
        Bundle bundleExtra;
        int i8;
        n nVar = this.f11067h;
        kotlin.jvm.internal.l.f("context", nVar);
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 33 || (i9 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
            intent = new Intent("android.provider.action.PICK_IMAGES");
            intent.setType(AbstractC0905c.s((InterfaceC0931d) eVar.f6045l));
            ((C0928a) eVar.f6046m).getClass();
            intent.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", 1);
        } else if (nVar.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112) != null) {
            ResolveInfo resolveInfoResolveActivity = nVar.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112);
            if (resolveInfoResolveActivity == null) {
                throw new IllegalStateException("Required value was null.");
            }
            ActivityInfo activityInfo = resolveInfoResolveActivity.activityInfo;
            Intent intent2 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
            intent2.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
            intent2.setType(AbstractC0905c.s((InterfaceC0931d) eVar.f6045l));
            ((C0928a) eVar.f6046m).getClass();
            intent2.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB", 1);
            intent = intent2;
        } else {
            intent = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent.setType(AbstractC0905c.s((InterfaceC0931d) eVar.f6045l));
            if (intent.getType() == null) {
                intent.setType("*/*");
                intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
            }
        }
        if (intent.getExtras() != null) {
            Bundle extras = intent.getExtras();
            kotlin.jvm.internal.l.c(extras);
            if (extras.getClassLoader() == null) {
                intent.setExtrasClassLoader(nVar.getClassLoader());
            }
        }
        if (intent.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundleExtra = intent.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            intent.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundleExtra = null;
        }
        Bundle bundle = bundleExtra;
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(intent.getAction())) {
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            HashSet hashSet = new HashSet();
            for (int i10 = 0; i10 < stringArrayExtra.length; i10++) {
                if (TextUtils.isEmpty(stringArrayExtra[i10])) {
                    throw new IllegalArgumentException(AbstractC0703b.m(new StringBuilder("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
                }
                if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(stringArrayExtra[i10], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i10));
                }
            }
            int size = hashSet.size();
            String[] strArr = size > 0 ? new String[stringArrayExtra.length - size] : stringArrayExtra;
            if (size > 0) {
                if (size == stringArrayExtra.length) {
                    return;
                }
                int i11 = 0;
                for (int i12 = 0; i12 < stringArrayExtra.length; i12++) {
                    if (!hashSet.contains(Integer.valueOf(i12))) {
                        strArr[i11] = stringArrayExtra[i12];
                        i11++;
                    }
                }
            }
            nVar.requestPermissions(stringArrayExtra, i7);
            return;
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intent.getAction())) {
            nVar.startActivityForResult(intent, i7, bundle);
            return;
        }
        C0846g c0846g = (C0846g) intent.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            kotlin.jvm.internal.l.c(c0846g);
            i8 = i7;
            try {
                nVar.startIntentSenderForResult(c0846g.f11384k, i8, c0846g.f11385l, c0846g.f11386m, c0846g.f11387n, 0, bundle);
            } catch (IntentSender.SendIntentException e7) {
                e = e7;
                new Handler(Looper.getMainLooper()).post(new B1.m(i8, 2, this, e));
            }
        } catch (IntentSender.SendIntentException e8) {
            e = e8;
            i8 = i7;
        }
    }
}
