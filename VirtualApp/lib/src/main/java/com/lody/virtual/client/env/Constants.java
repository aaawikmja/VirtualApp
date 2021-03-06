package com.lody.virtual.client.env;

import com.lody.virtual.client.stub.ShortcutHandleActivity;

import android.content.Intent;

/**
 * @author Lody
 *
 */
public class Constants {

	public static final String META_KEY_IDENTITY = "X-Identity";

	public static final String META_VALUE_STUB = "Stub-User";

	/**
	 * Server process name of VA
	 */
	public static final String SERVER_PROCESS_NAME = ":x";
	/**
	 * Install shortcut action
	 */
	public static final String ACTION_INSTALL_SHORTCUT = "com.android.launcher.action.INSTALL_SHORTCUT";
	/**
	 * Uninstall shortcut action
	 */
	public static final String ACTION_UNINSTALL_SHORTCUT = "com.android.launcher.action.UNINSTALL_SHORTCUT";
	/**
	 * Package name of System-UI.apk
	 */
	public static final String SYSTEM_UI_PKG = "com.android.systemui";
	/**
	 * If an apk declared the "fake-signature" attribute on its Application TAG,
	 * we will use its signature instead of the real signature.
	 *
	 * For more detail, please see :
	 * https://github.com/microg/android_packages_apps_GmsCore/blob/master/
	 * patches/android_frameworks_base-M.patch.
	 */
	public static final String FEATURE_FAKE_SIGNATURE = "fake-signature";
	public static final String VIRTUAL_ACTION_PACKAGE_ADDED = "Virtual." + Intent.ACTION_PACKAGE_ADDED;
	public static final String VIRTUAL_ACTION_PACKAGE_REMOVED = "Virtual." + Intent.ACTION_PACKAGE_REMOVED;
	public static final String VIRTUAL_ACTION_PACKAGE_CHANGED = "Virtual." + Intent.ACTION_PACKAGE_CHANGED;
	/**
	 * The activity who handle the shortcut.
	 */
	public static String SHORTCUT_PROXY_ACTIVITY_NAME = ShortcutHandleActivity.class.getName();

	public static String ACTION_INSTALL_PACKAGE = "android.intent.action.VIRTUAL_INSTALL_PACKAGE";

	public static String ACTION_UNINSTALL_PACKAGE = "android.intent.action.VIRTUAL_UNINSTALL_PACKAGE";

}
