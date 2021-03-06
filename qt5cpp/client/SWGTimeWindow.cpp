/**
 * Route Optimization API
 * Our Route Optimization API solves the so called vehicle routing problem fast. It calculates an optimal tour for a set of vehicles, services and constraints
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


#include "SWGTimeWindow.h"

#include "SWGHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace Swagger {


SWGTimeWindow::SWGTimeWindow(QString* json) {
    init();
    this->fromJson(*json);
}

SWGTimeWindow::SWGTimeWindow() {
    init();
}

SWGTimeWindow::~SWGTimeWindow() {
    this->cleanup();
}

void
SWGTimeWindow::init() {
    earliest = 0L;
    latest = 0L;
}

void
SWGTimeWindow::cleanup() {
    

}

SWGTimeWindow*
SWGTimeWindow::fromJson(QString &json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
SWGTimeWindow::fromJsonObject(QJsonObject &pJson) {
    ::Swagger::setValue(&earliest, pJson["earliest"], "qint64", "");
    ::Swagger::setValue(&latest, pJson["latest"], "qint64", "");
}

QString
SWGTimeWindow::asJson ()
{
    QJsonObject* obj = this->asJsonObject();
    
    QJsonDocument doc(*obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject*
SWGTimeWindow::asJsonObject() {
    QJsonObject* obj = new QJsonObject();
    
    obj->insert("earliest", QJsonValue(earliest));

    obj->insert("latest", QJsonValue(latest));

    return obj;
}

qint64
SWGTimeWindow::getEarliest() {
    return earliest;
}
void
SWGTimeWindow::setEarliest(qint64 earliest) {
    this->earliest = earliest;
}

qint64
SWGTimeWindow::getLatest() {
    return latest;
}
void
SWGTimeWindow::setLatest(qint64 latest) {
    this->latest = latest;
}



} /* namespace Swagger */

